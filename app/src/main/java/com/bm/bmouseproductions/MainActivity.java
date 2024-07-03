package com.bm.bmouseproductions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView cliente;
    ImageView colaborador;

    ImageView logotopo;

    ImageView demandas;

    ImageView site;

    ImageView instagram;

    ImageView linkedin;

    ImageView whatsapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cliente = findViewById(R.id.cliente);
        colaborador = findViewById(R.id.colaborador);
        logotopo = findViewById(R.id.logotopo);
        demandas = findViewById(R.id.demandas);
        site = findViewById(R.id.site);
        instagram = findViewById(R.id.instagram);
        linkedin = findViewById(R.id.linkedin);
        whatsapp = findViewById(R.id.whatsapp);

        cliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.bmouseproductions.com/view/play/");

            }
        });

        colaborador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://bmouseproductions.com/view/bmousegram/");

            }
        });


        logotopo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.bmouseproductions.com/");

            }
        });


        demandas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.bmouseproductions.com/view/demandas/");

            }
        });

        site.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.bmouseproductions.com/");

            }
        });

        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.instagram.com/bmouseproductions/");

            }
        });

        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.linkedin.com/company/bmouse/");

            }
        });

        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://wa.me/+553497226999");

            }
        });

    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}