package com.example.ketteshazifeladat;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Harom extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.harom);
        Log.d("Statusz","Harom:onCreate()");
        Button button4=findViewById(R.id.button4);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Harom.this,MainActivity.class);
                startActivity(i);
            }
        });

    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d("Statusz","Harom: onStart()");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("Statusz","Harom: onStop()");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("Statusz","Harom: onDestroy()");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Statusz", "Harom: onPause()");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Statusz", "Harom: onResume()");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Statusz", "Harom: onRestart()");
    }
}
