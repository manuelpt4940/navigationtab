package com.example.usuario.navigationtab.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.usuario.navigationtab.MainActivity;
import com.example.usuario.navigationtab.R;

public class EstadoSubActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estado_sub1);
        Button b_nacti = (Button) findViewById(R.id.button);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        b_nacti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getBaseContext(),EstadoSubActivity2.class);
                in.putExtra("SubActivity","Nueva Pestaña2");
                startActivity(in);
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            if (bundle.getString("SubActivity") != null){
                Toast.makeText(getApplicationContext(), "data: "
                        + bundle.getString("SubActivity"),
                        Toast.LENGTH_SHORT).show();
            }
        }


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
