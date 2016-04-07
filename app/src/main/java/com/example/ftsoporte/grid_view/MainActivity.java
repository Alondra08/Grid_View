package com.example.ftsoporte.grid_view;


import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends Activity {

    GridViewAdapter adapter ;
    String[] titulo = new String[]{"Labial","Rimmel", "Labios", "Polvo","Rubor","EyesPencil"};
    int[] imagenes={
            R.drawable.labial,
            R.drawable.rimmel,
            R.drawable.labios,
            R.drawable.polvo,
            R.drawable.rubor,
            R.drawable.lapiz
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 final GridView lista=(GridView)findViewById(R.id.gridView);
        adapter=new GridViewAdapter(this,titulo,imagenes);
        lista.setAdapter(adapter);
    }
}