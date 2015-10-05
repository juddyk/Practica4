package com.example.juddyreina.sanandresapp;

/**
 * Created by REINA on 04/10/2015.
 */
public class listas {
    private int idImage;
    private  String Nombre;
    private String Info;

    public listas(int idImage, String nombre,String inf) {
        this.idImage = idImage;
        Nombre = nombre;
        Info=inf;

    }

    public int getIdImage() {
        return idImage;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getInfo() {
        return Info;
    }

    public void setIdImage(int idImage) {
        this.idImage = idImage;
    }

    public void setInfo(String info) {
        Info = info;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
