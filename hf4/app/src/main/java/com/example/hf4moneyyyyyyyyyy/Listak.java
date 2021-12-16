package com.example.hf4moneyyyyyyyyyy;

public class Listak {
    protected static final String[] nevek=new String[]{"EUR","usd","gbr","aud","cad","chf","dk","huf"};
    protected static final String[] hosszan=new String[]{"euro","dolar","lira","dollar australian","dolar canadian","franc","corona","forint"};
    protected static final double[] buy=new double[]{4.4100, 3.9750, 6.1250, 2.9600, 3.0950, 4.2300, 0.5850, 0.0136};
    protected static final double[] sell=new double[]{4.5500, 4.1450, 6.3550, 3.0600, 3.2650, 4.3300, 0.6150, 0.0146};

    public static String[] getNevek() {
        return nevek;
    }

    public static String[] getHosszan() {
        return hosszan;
    }

    public static double[] getBuy() {
        return buy;
    }

    public static double[] getSell() {
        return sell;
    }
}
