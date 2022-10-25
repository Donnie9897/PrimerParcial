package com.example.primerparcial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static ArrayAdapter<Object> layoutAdapter;
    RecyclerView recycler;

    public static ArrayList<Producto> productos  = new ArrayList<Producto>();
    private RecyclerAdapter adapter;

    private String nombre;
    private String descripcion;
    private int precio;
    private Button btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            Intent intent = getIntent();
            binding = ActivityMainBinding.inflate(getLayoutInflater());
            setContentView(binding.getRoot());
            recycler = binding.recycler;
            layoutAdapter = new ArrayAdapter<Object>(this, productos);

            nombre = getIntent().getStringExtra("Nombre");
            descripcion = getIntent().getStringExtra("Descripcion");
            // precio = getIntent().getIntExtra("Precio");
            precio = 1; //debuggeando la variable precio porque no quiere obtener el valor
            btn = findViewById(R.id.button);

            productos = new ArrayList<Producto>();

            adapter = new RecyclerAdapter(productos);
/*
            for (int i = 0;  i <= 100; i++){
                productos.add(new Producto(nombre, descripcion, precio));
            }*/

            recycler = recycler.findViewById(R.id.recyclerMain);

            btn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                    startActivity(intent);
                }
                });


    }
}