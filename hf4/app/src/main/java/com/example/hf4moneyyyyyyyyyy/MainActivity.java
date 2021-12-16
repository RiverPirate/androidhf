package com.example.hf4moneyyyyyyyyyy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista=findViewById(R.id.valamiid);
        Adatok a=new Adatok(this);
        lista.setAdapter(a);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String nev=Listak.getNevek()[i];
                double buy=Listak.getBuy()[i];
                Toast.makeText(getApplicationContext(), nev+" " + String.format("%,.5f",buy)+ "ron", Toast.LENGTH_SHORT).show();
            }
        });
    }
}