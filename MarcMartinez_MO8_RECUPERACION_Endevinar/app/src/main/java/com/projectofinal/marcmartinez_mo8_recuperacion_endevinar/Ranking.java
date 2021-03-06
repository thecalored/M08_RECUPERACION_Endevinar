package com.projectofinal.marcmartinez_mo8_recuperacion_endevinar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.ListView;


import androidx.appcompat.app.AppCompatActivity;

public class Ranking extends AppCompatActivity {
    Button boton_atras;
    ListView listaRanking;
    Adapter_ranking adapter;
    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranking);
    }

    @Override
    protected void onResume() {
        super.onResume();
        boton_atras = (Button) findViewById(R.id.finish);
        boton_atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pagEnde = new Intent(Ranking.this,MainActivity.class);
                startActivity(pagEnde);
            }
        });
        listaRanking = (ListView) findViewById(R.id.ListView);
        adapter = new Adapter_ranking(this,MainActivity.arrayRanking);
        listaRanking.setAdapter(adapter);

    }
}
