package com.example.klarisa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Plant_2_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p2);
    }

    public void goBack(View view) {
        Intent myIntent = new Intent (Plant_2_Activity.this, MainActivity.class);
        finish();
    }
}
