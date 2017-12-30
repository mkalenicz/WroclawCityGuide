package com.kalenicz.maciej.wroclawcityguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.category_container, new CityFragment())
                .commit();
    }
}
