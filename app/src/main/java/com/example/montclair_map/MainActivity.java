package com.example.montclair_map;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import java.util.Locale;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Navigate(View view){

        //Montclair State University directions are created
        Uri Intenturi = Uri.parse("google.navigation:q=40.8644624104021, -74.19858111477711");
        //Intent is created to launch Google Maps
        Intent Map = new Intent(Intent.ACTION_VIEW, Intenturi);
        //Google Maps package is created
        Map.setPackage("com.google.android.apps.maps");
        //Navigation will begin upon the button being pressed
        startActivity(Map);
    }
}