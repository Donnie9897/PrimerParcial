package com.example.primerparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity extends AppCompatActivity {
    private TextView nombre;
    private TextView descripcion;
    private TextView precio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_layout);

        nombre = (TextView) findViewById(R.id.nom_producto);
        descripcion = (TextView) findViewById(R.id.desc_producto);
        precio = (TextView) findViewById(R.id.precio_Producto);
    }


    public void getData(View view){
        String nom = nombre.getText().toString();
        String des = descripcion.getText().toString();
        String pre = precio.getText().toString();

        MainActivity.layoutAdapter.notifyDataSetChanged();

        Producto producto = new Producto(nom,des,Integer.valueOf(pre));
        MainActivity.productos.add(producto);
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}