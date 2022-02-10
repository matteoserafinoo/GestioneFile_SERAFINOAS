package com.example.gestionefile_serafino;

import android.content.Context;
import android.util.Log;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Gestore {
    String nomefile;
    Context c;

    public Gestore(String nomefile) {
        this.nomefile = nomefile;
    }

    public String LeggiFile(String nomefile, Context c)
    {
        String s="";
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(c.openFileInput(nomefile)));
         s = br.readLine();
        } catch (FileNotFoundException e) {
            Log.e("Errore", e.toString());
        } catch (IOException e) {
            Log.e("Errore",e.toString());
        }
      String inputString;

        /*while ((inputString=inputReader.readline()) != null)
        {
            s.append(inputString +"\n");
        }*/
        return s.toString();

    }

    public String ScriviFile(String nomefile, Context c)
    {
        FileOutputStream file0;
        String esito="";
        String testodascrivere = "QUesto è il testo del file";
        try {
            file0 = c.openFileOutput(nomefile, Context.MODE_PRIVATE);
            file0.write(testodascrivere.getBytes());
            file0.close();
            esito = "Tutto bene";
        } catch (FileNotFoundException e) {
            esito = "Attenzione errore apertura file";
        } catch (IOException e) {
            esito= "Errore nella scrittura";
        }
        return esito;
    }
}
