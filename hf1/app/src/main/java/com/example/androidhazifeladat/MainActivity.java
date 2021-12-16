package com.example.androidhazifeladat;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText egy=findViewById(R.id.egy);
        EditText ketto=findViewById(R.id.ketto);
        TextView eredmeny=findViewById(R.id.osszeg);
        Button ossz=findViewById(R.id.osz);
        Button kiv=findViewById(R.id.ki);
        Button szo=findViewById(R.id.szo);
        Button o=findViewById(R.id.o);

        ossz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double oszeg=Double.parseDouble(egy.getText().toString())+Double.parseDouble(ketto.getText().toString());
                String ered=String.format("%.2f",oszeg);
                eredmeny.setText(ered);
            }

        });
        kiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double oszeg=Double.parseDouble(egy.getText().toString())-Double.parseDouble(ketto.getText().toString());
                String ered=String.format("%.2f",oszeg);
                eredmeny.setText(ered);
            }
        });

        szo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double oszeg=Double.parseDouble(egy.getText().toString())*Double.parseDouble(ketto.getText().toString());
                String ered=String.format("%.2f",oszeg);
                eredmeny.setText(ered);
            }
        });

        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double oszeg=Double.parseDouble(egy.getText().toString())/Double.parseDouble(ketto.getText().toString());
                String ered=String.format("%.2f",oszeg);
                eredmeny.setText(ered);
            }
        });
    }
}