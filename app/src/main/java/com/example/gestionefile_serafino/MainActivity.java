package com.example.gestionefile_serafino;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnscrittura;
    Button btnlettura;
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnscrittura =(Button) findViewById(R.id.btnscrittura);
        btnlettura = (Button) findViewById(R.id.btnlettura);
        editText = findViewById(R.id.editText);

        //listeners
        btnscrittura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnlettura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}