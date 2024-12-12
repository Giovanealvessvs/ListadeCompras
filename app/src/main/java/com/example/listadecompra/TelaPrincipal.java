package com.example.listadecompra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class TelaPrincipal extends AppCompatActivity {
Button btAdc, btRmv;
Spinner spnCategoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);
        btAdc=(Button) findViewById(R.id.btnAdicionar);
        btRmv=(Button) findViewById(R.id.btnRemover);
        spnCategoria=(Spinner) findViewById(R.id.spnCategoria);

        Spinner spinner = findViewById(R.id.spnCategoria);


        List<String> categorias = Arrays.asList("Categoria 1", "Categoria 2", "Categoria 3", "Categoria 4");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, categorias);


        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View view, int position, long id) {
                // Obtendo o item selecionado
                String selectedCategory = parentView.getItemAtPosition(position).toString();
                // Exibindo o item selecionado em um Toast (ou você pode fazer outra ação)
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // O que fazer se nada for selecionado (opcional)
            }
        });

    }
}