package com.example.alumno.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by alumno on 08/10/2015.
 */
public class MyViewHolder extends RecyclerView.ViewHolder {

    private TextView fecha;
    private TextView titulo;
    private TextView descripcion;

    public TextView getFecha() {
        return fecha;
    }

    public void setFecha(TextView fecha) {
        this.fecha = fecha;
    }

    public TextView getTitulo() {
        return titulo;
    }

    public void setTitulo(TextView titulo) {
        this.titulo = titulo;
    }

    public TextView getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(TextView descripcion) {
        this.descripcion = descripcion;
    }

    public ImageView getImagen() {
        return imagen;
    }

    public void setImagen(ImageView imagen) {
        this.imagen = imagen;
    }

    public TextView getLink() {
        return link;
    }

    public void setLink(TextView link) {
        this.link = link;
    }

    private ImageView imagen;
    private TextView link;

    public MyViewHolder(View itemView) {
        super(itemView);

        fecha=(TextView) itemView.findViewById(R.id.txtFecha);
        titulo=(TextView) itemView.findViewById(R.id.txtLink);
        descripcion=(TextView) itemView.findViewById(R.id.txtDescipcion);
        imagen=(ImageView) itemView.findViewById(R.id.imageView);
        link=(TextView) itemView.findViewById(R.id.txtLink);

    }
}
