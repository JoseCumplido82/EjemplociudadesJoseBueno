package com.example.ejemplociudades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.ejemplociudades.clases.Provincia;
import com.example.ejemplociudades.controladores.ProvinciaController;

import java.util.ArrayList;

public class ActualizarProvinciaActivity1 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner sp_actualizarp = null;
    ArrayList<Provincia> provincias = null;
    ArrayAdapter<Provincia> adapter = null;
    Provincia pseleccionada = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actualizar_provincia1);
        sp_actualizarp = (Spinner) findViewById(R.id.sp_actualizarp);
        //------------------------------
        provincias = ProvinciaController.obtenerProvincias();
        sp_actualizarp.setOnItemSelectedListener(this);
        // creamos el adaptador
        adapter = new ArrayAdapter<Provincia>(this,R.layout.support_simple_spinner_dropdown_item, provincias);
        sp_actualizarp.setAdapter(adapter);


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}