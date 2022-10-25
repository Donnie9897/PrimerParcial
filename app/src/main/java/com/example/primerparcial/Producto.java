package com.example.primerparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Producto {

    private String nombre;
    private String descripcion;
    private int precio;

    public Producto(String name, String lastName, int id) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String name) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setId(int id) {
        this.precio = precio;
    }
}
