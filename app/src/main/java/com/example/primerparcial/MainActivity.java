package com.example.primerparcial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.text.Normalizer;
import java.util.ArrayList;
import com.example.primerparcial.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    public static LayoutAdapter layoutAdapter;
    RecyclerView recycler;

    public static ArrayList<Producto> productos  = new ArrayList<Producto>();
   // private RecyclerAdapter adapter;


    private String nombre;
    private String descripcion;
    private int precio;
    private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            //Intent intent = getIntent();
           // binding = ActivityMainBinding.inflate(getLayoutInflater());
           // setContentView(binding.getRoot());
           // recycler = binding.recycler;

            layoutAdapter = new LayoutAdapter(this, productos);
            btn = findViewById(R.id.button);

            productos = new ArrayList<Producto>();

            //adapter = new RecyclerAdapter(productos);
            recycler = recycler.findViewById(R.id.recyclerMain);
            recycler.setAdapter(layoutAdapter);


    }

    public void IntentCall(View view){
        Intent intent = new Intent(this, Activity.class);

        startActivity(intent);
    }
}