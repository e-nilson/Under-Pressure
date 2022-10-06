package com.example.underpressure.UI;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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
    public void enterNewBikeDetails(View view) {
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

    // Tells what happens with the created menus
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.home:
                Intent homeIntent = new Intent(BikesList.this, MainActivity.class);
                startActivity(homeIntent);
                return true;

            case R.id.refresh:
                refreshBikeList();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    // Refreshes the bike list from the menu
    private void refreshBikeList() {
        recyclerView = findViewById(R.id.bikesRecyclerView);
        final BikesAdapter adapter = new BikesAdapter(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        List<Bikes> filteredBikes = new ArrayList<>();
        List<Bikes> allBikes = repository.getAllBikes();

        numBikes = filteredBikes.size();
        adapter.setBikes(allBikes);
    }
}
