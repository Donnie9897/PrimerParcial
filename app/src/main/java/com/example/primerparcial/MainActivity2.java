package com.example.primerparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    private View txt1;
    private View txt2;
    private View precio;
    private Button btn;
    private Button btn_quit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txt1 = findViewById(R.id.txt_art);
        txt2 = findViewById(R.id.txt_des);
        precio = findViewById(R.id.txt_pre);
        btn = findViewById(R.id.btn_add);
        btn_quit = findViewById(R.id.btn_quit);



        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                intent.putExtra("Nombre", String.valueOf(txt1));
                intent.putExtra("Descripcion", String.valueOf(txt2));
                intent.putExtra("Precio", Integer.parseInt(String.valueOf(precio)));


                startActivity(intent);

            }



        });

        btn_quit.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                finish();
                startActivity(getIntent());
                overridePendingTransition(0 ,0 );
            }

        });


    }
}