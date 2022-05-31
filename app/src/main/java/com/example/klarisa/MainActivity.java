package com.example.klarisa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nextPlant1(View view){
        Intent myIntent = new Intent(MainActivity.this, Plant_1_Activity.class);
        MainActivity.this.startActivity(myIntent);
    }

    public void nextPlant2(View view){
        Intent myIntent = new Intent(MainActivity.this, Plant_2_Activity.class);
        MainActivity.this.startActivity(myIntent);
    }

    public void nextPlant3(View view){
        Intent myIntent = new Intent(MainActivity.this, Plant_3_Activity.class);
        MainActivity.this.startActivity(myIntent);
    }
    public void nextPlant4(View view){
        Intent myIntent = new Intent(MainActivity.this, Plant_4_Activity.class);
        MainActivity.this.startActivity(myIntent);
    }
    public void exitActivity (View view) {
        finish();
    }
}