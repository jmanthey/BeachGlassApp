package com.example.android.beachglassapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


//Jeremy Manthey

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//Method to call the about class
    public void onClickAbout(View view) {

        Intent startIntent = new Intent(getApplicationContext(), AboutBeachGlass.class);
        startActivity(startIntent);
    }
//Method to call Identifu class
    public void onClickIdentify(View view) {

        Intent startIntent = new Intent(getApplicationContext(), Identify.class);
        startActivity(startIntent);
    }

//An intent to show on Google Maps where beach glass can be found.
    public void onClickFind(View view) {

        Uri gmmIntentUri = Uri.parse("geo:46.787491,-92.093912?z=17");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
}
