package com.example.hf4moneyyyyyyyyyy;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Adatok extends ArrayAdapter {
    private final Activity ac;
    private final String[] nevek;
    private final String[] hosszan;
    private final double[] buy;
    private final double[] sell;

    public Adatok(Activity ac){
        super(ac,R.layout.hogyanesnezzenkije, Listak.getNevek());
        this.ac=ac;
        this.nevek=Listak.getNevek();
        this.hosszan=Listak.getHosszan();
        this.buy=Listak.getBuy();
        this.sell=Listak.getSell();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater li=ac.getLayoutInflater();
        View v=li.inflate(R.layout.hogyanesnezzenkije,null,true);
        TextView nevek1=v.findViewById(R.id.textView);
        TextView hosszan1=v.findViewById(R.id.textView2);
        TextView buy1=v.findViewById(R.id.textView3);
        TextView sell1=v.findViewById(R.id.textView5);
        nevek1.setText(nevek[position]);
        hosszan1.setText(hosszan[position]);
        buy1.setText(String.format("%,.5f",buy[position]));
        sell1.setText(String.format("%,5.f",sell[position]));
        return v;
    }
}
