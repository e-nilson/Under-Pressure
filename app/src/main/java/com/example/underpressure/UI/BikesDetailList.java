package com.example.underpressure.UI;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.underpressure.Database.Repository;
import com.example.underpressure.Entity.Bikes;
import com.example.underpressure.R;

import java.util.ArrayList;
import java.util.List;

public class BikesDetailList extends AppCompatActivity {

    List<Bikes> allBikes;

    private int bikeID;
    private Repository repository;
    private int numBikes;

    Bikes currentBike;

    EditText editBikeName;
    EditText editForkModel;
    EditText editForkVolumeSpacers;
    EditText editForkLSC;
    EditText editForkHSC;
    EditText editForkLSR;
    EditText editForkHSR;
    EditText editShockModel;
    EditText editShockSpringRate;
    EditText editShockVolumeSpacers;
    EditText editShockLSC;
    EditText ediShockHSC;
    EditText editShockLSR;
    EditText editShockHSR;
    EditText editFrontPressure;
    EditText editRearPressure;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bikes_detail);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Methods for entering and saving bike details for the bike list activity page
        bikeID = getIntent().getIntExtra("bikeID", -1);
        repository = new Repository(getApplication());
        allBikes = repository.getAllBikes();

        for (Bikes b : allBikes) {
            if (b.getBikeID() == bikeID) currentBike = b;
        }
        editBikeName = findViewById(R.id.editBikeName);
        editForkModel = findViewById(R.id.editForkModel);
        editForkVolumeSpacers = findViewById(R.id.editForkVolumeSpacers);
        editForkLSC = findViewById(R.id.editForkLSC);
        editForkHSC = findViewById(R.id.editForkHSC);
        editForkLSR = findViewById(R.id.editForkLSR);
        editForkHSR = findViewById(R.id.editForkHSR);
        editShockModel = findViewById(R.id.editShockModel);
        editShockSpringRate = findViewById(R.id.editShockSpringRate);
        editShockVolumeSpacers = findViewById(R.id.editShockVolumeSpacers);
        editShockLSC = findViewById(R.id.editShockLSC);
        ediShockHSC = findViewById(R.id.ediShockHSC);
        editShockLSR = findViewById(R.id.editShockLSR);
        editShockHSR = findViewById(R.id.editShockHSR);
        editFrontPressure = findViewById(R.id.editFrontPressure);
        editRearPressure = findViewById(R.id.editRearPressure);
        if (currentBike != null) {
            editBikeName.setText(currentBike.getBikeName());
            editForkModel.setText(currentBike.getForkModel());
            editForkVolumeSpacers.setText(currentBike.getForkVolumeSpacers());
            editForkLSC.setText(currentBike.getForkLSC());
            editForkHSC.setText(currentBike.getForkHSC());
            editForkLSR.setText(currentBike.getForkLSR());
            editForkHSR.setText(currentBike.getForkHSR());
            editShockModel.setText(currentBike.getShockModel());
            editShockSpringRate.setText(currentBike.getShockSpringRate());
            editShockVolumeSpacers.setText(currentBike.getShockVolumeSpacers());
            editShockLSC.setText(currentBike.getShockLSC());
            ediShockHSC.setText(currentBike.getShockHSC());
            editShockLSR.setText(currentBike.getShockLSR());
            editShockHSR.setText(currentBike.getShockHSR());
            editFrontPressure.setText(currentBike.getFrontTirePressure());
            editRearPressure.setText(currentBike.getRearTirePressure());
        }
        // Adds the bike recycler view to the bike details page based on bikeID
        RecyclerView recyclerView = findViewById(R.id.bikesRecyclerView);
        final BikesAdapter bikesAdapter = new BikesAdapter(this);
        recyclerView.setAdapter(bikesAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        List<Bikes> filteredBikes = new ArrayList<>();
        for (Bikes b : repository.getAllBikes()) {
            if (b.getBikeID() == bikeID) filteredBikes.add(b);
        }
        numBikes = filteredBikes.size();
        // TODO bikesAdapter = setBikes(filteredBikes);
    }

    /* TODO return a int for the below attributes instead of strings
    public void saveBikeDetails (View view) {
        Bikes bikes;
        if (bikeID == -1) {
            int newBikeID = repository.getAllBikes().get(repository.getAllBikes().size() -1 ).getBikeID() + 1;
            bikes = new Bikes(newBikeID, editBikeName.getText().toString(), editForkModel.getText().toString(), editForkVolumeSpacers.getText(),
            editForkLSC.getText().toString(), editForkHSC.getText().toString(), editForkLSR.getText().toString(), editForkHSR.getText().toString(),
            editShockModel.getText().toString(), editShockSpringRate.getText().toString(), editShockVolumeSpacers.getText().toString(), editShockLSC.getText().toString(),
            ediShockHSC.getText().toString(), editShockLSR.getText().toString(), editShockHSR.getText().toString(),
            editFrontPressure.getText().toString(), editRearPressure.getText().toString());

        }
    }

     */
}
















