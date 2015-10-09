package com.example.alumno.myapplication;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.*;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements Handler.Callback{

    private Handler handler = null;
    private RecyclerView rv = null;
    private List<Noticia> listaNoticias;
    private Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Noticia> listaNoticias= new ArrayList<>();
        Noticia noticia1= new Noticia();
        Noticia noticia2= new Noticia();
        noticia1.setFecha("20/10/2015");
        noticia1.setTitulo("Titulo1 UNO");
        noticia1.setDescripcion("Descripcion1");
        noticia2.setFecha("11/05/2014");
        noticia2.setTitulo("Titulo1 DOS");
        noticia2.setDescripcion("Descripcion2");
        listaNoticias.add(noticia1);
        listaNoticias.add(noticia2);

        this.rv = (RecyclerView)findViewById(R.id.list);
        handler = new Handler(this);

        LinearLayoutManager llm= new LinearLayoutManager(this);
        rv.setLayoutManager(llm);

        Adapter adapter = new Adapter(listaNoticias, handler);
        rv.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean handleMessage(Message msg) {
        return false;
    }
}
