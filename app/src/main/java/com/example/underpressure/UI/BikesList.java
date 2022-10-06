package com.example.underpressure.UI;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.underpressure.Database.Repository;
import com.example.underpressure.Entity.Bikes;
import com.example.underpressure.R;

import java.util.ArrayList;
import java.util.List;

public class BikesList extends AppCompatActivity {

    private Repository repository;
    private RecyclerView recyclerView;
    private int numBikes;
    private ArrayList<Bikes> bikesArrayList;
    private Context context;

    Bikes currentBike;

    // Initializes the main bikes list page
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bikes_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = findViewById(R.id.bikesRecyclerView);
        Repository repository = new Repository(getApplication());

        List<Bikes> allBikes = repository.getAllBikes();
        BikesAdapter bikesAdapter = new BikesAdapter(this);
        recyclerView.setAdapter(bikesAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        bikesAdapter.setBikes(allBikes);
    }

    // Navigates to the bike detail page
    public void enterBikeDetails (View view) {
        Intent intent = new Intent(BikesList.this, BikesDetailList.class);
        if (currentBike != null) intent.putExtra("bikeID", currentBike.getBikeID());
        startActivity(intent);
    }

    // Creates a menu
    @Override
    public boolean onCreateOptionsMenu (Menu menu) {
        getMenuInflater().inflate(R.menu.menu_bike,menu);
        return true;
    }



}
