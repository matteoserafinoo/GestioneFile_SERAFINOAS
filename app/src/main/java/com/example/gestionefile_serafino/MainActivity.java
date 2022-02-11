    package com.example.gestionefile_serafino;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

    public class MainActivity extends AppCompatActivity {
    Button btnscrittura;
    Button btnlettura;
    EditText editText;
    Gestore gest;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnscrittura =(Button) findViewById(R.id.btnscrittura);
        btnlettura = (Button) findViewById(R.id.btnlettura);
        editText = findViewById(R.id.editText);

       gest = new Gestore();

        //listeners
        btnscrittura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 String ritorno = gest.ScriviFile("testo.txt", getApplicationContext());

                Toast.makeText(getApplicationContext(),ritorno,Toast.LENGTH_LONG).show();
            }
        });

        btnlettura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context c = getApplicationContext();
                String righelette = gest.LeggiFile("prova.txt", getApplicationContext());
                Toast.makeText(getApplicationContext(),righelette, Toast.LENGTH_LONG).show();
            }
        });
    }

}