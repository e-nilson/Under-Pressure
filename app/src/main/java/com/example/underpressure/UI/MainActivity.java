package com.example.underpressure.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.underpressure.Database.Repository;
import com.example.underpressure.Entity.Bikes;
import com.example.underpressure.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Adds bike sample data to bike detail activity
        Repository repository = new Repository(getApplication());
        Bikes bikesEntity = new Bikes(1,"Bronson V4", "Lyrik Ultimate",79, 1,
                2, 2, 10, 10, "Super Deluxe", 178, 2,
                2, 2, 5, 5, 23, 26);
        repository.insertBike(bikesEntity);
        Bikes bikesEntity2 = new Bikes(2,"Tallboy V5", "Pike Ultimate",51, 1,
                2, 2, 10, 10, "Super Deluxe", 112, 0,
                2, 2, 5, 5, 18, 21);
        repository.insertBike(bikesEntity2);
    }

    // Navigates to the bike list page
    public void bikeGarageButton(View view) {
        Intent intent = new Intent(MainActivity.this, BikesList.class);
        startActivity(intent);
    }
}