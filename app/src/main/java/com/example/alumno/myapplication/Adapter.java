package com.example.alumno.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;
import android.os.Handler;

/**
 * Created by alumno on 08/10/2015.
 */
public class Adapter extends RecyclerView.Adapter<MyViewHolder>{

    private List<Noticia> listaNoticias;
    private Handler handler;

    public Adapter(List<Noticia> listaNoticias, Handler handler){
        this.listaNoticias=listaNoticias;
        this.handler=handler;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        View vista= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_rss, viewGroup, false);

        MyViewHolder mvh= new MyViewHolder(vista);
        return mvh; //retorno el MyViewHolder armado que contiene los widgets
    }

    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, int position) {
        Noticia noticia = listaNoticias.get(position);
        myViewHolder.getFecha().setText(noticia.getFecha());
        myViewHolder.getLink().setText(noticia.getTitulo());
        myViewHolder.getDescripcion().setText(noticia.getDescripcion());
        //myViewHolder.getImagen().setImageBitmap(n.getImagen());

        if ( noticia.getImagen() == null ) {
            HiloImagenes thI = new HiloImagenes(noticia.getLink(), handler, position);
            Thread t = new Thread(thI);
            t.start();
        }
        else
        {
            myViewHolder.getImagen().setImageBitmap(noticia.getImagen());
        }
    }

    @Override
    public int getItemCount() {

        return this.listaNoticias.size();
    }
}
