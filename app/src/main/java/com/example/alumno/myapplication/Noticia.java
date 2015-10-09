package com.example.alumno.myapplication;

import android.graphics.Bitmap;
import android.support.annotation.StringDef;
import android.widget.ImageView;

/**
 * Created by alumno on 08/10/2015.
 */
public class Noticia {

    private String titulo;
    private String descripcion;
    private String fecha; //revisar si la fecha q viene es de formato String
    private String link;
    private Bitmap imagen;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Bitmap getImagen() {
        return imagen;
    }

    public void setImagen(Bitmap imagen) {
        this.imagen = imagen;
    }

    public Noticia(){

    }


}
