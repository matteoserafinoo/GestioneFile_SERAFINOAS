package com.example.gestionefile_serafino;

import android.content.Context;
import android.util.Log;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

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


        return s;
    }

    public void ScriviFile(String nomefile, String testo)
    {

    }
}
