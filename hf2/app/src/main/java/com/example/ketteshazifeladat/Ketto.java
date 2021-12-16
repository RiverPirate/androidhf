package com.example.ketteshazifeladat;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Ketto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ketto);
        Log.d("Statusz","Ketto:onCreate()");
        Button button2=findViewById(R.id.button2);
        Button button3=findViewById(R.id.button3);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Ketto.this,MainActivity.class);
                startActivity(i);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Ketto.this,Harom.class);
                startActivity(i);
            }
        });
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d("Statusz","Ketto: onStart()");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("Statusz","Ketto: onStop()");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("Statusz","Ketto: onDestroy()");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Statusz", "Ketto: onPause()");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Statusz", "Ketto: onResume()");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Statusz", "Ketto: onRestart()");
    }
}
