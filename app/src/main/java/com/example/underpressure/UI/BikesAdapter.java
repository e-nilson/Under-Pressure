package com.example.underpressure.UI;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.underpressure.Entity.Bikes;
import com.example.underpressure.R;

import java.util.List;

public class BikesAdapter extends RecyclerView.Adapter<BikesAdapter.BikeViewHolder> {
    private List<Bikes> mBikes;
    private Context context;
    private LayoutInflater mInflater;

    class BikeViewHolder extends RecyclerView.ViewHolder {
        // TODO private final TextView bikeIDTextView;
        private final TextView bikeNameItemView;
        private final TextView forkModelItemView;
        private final TextView forkSpringRateItemView;
        private final TextView forkVolumeSpacersItemView;
        private final TextView forkLSCItemView;
        private final TextView forkHSCItemView;
        private final TextView forkLSRItemView;
        private final TextView forkHSRItemView;
        private final TextView shockModelItemView;
        private final TextView shockSpringRateItemView;
        private final TextView shockVolumeSpacersItemView;
        private final TextView shockLSCItemView;
        private final TextView shockHSCItemView;
        private final TextView shockLSRItemView;
        private final TextView shockHSRItemView;
        private final TextView frontTirePressureItemView;
        private final TextView rearTirePressureItemView;

        private BikeViewHolder(View itemView) {
            super(itemView);
            // TODO bikeIDTextView
            bikeNameItemView = itemView.findViewById(R.id.textViewBikeName);
            forkModelItemView = itemView.findViewById(R.id.textViewForkModel);
            forkSpringRateItemView = itemView.findViewById(R.id.textViewForkSpringRate);
            forkVolumeSpacersItemView = itemView.findViewById(R.id.textViewForkVolumeSpacers);
            forkLSCItemView = itemView.findViewById(R.id.textViewForkLSC);
            forkHSCItemView = itemView.findViewById(R.id.textViewForkHSC);
            forkLSRItemView = itemView.findViewById(R.id.textViewForkLSR);
            forkHSRItemView = itemView.findViewById(R.id.textViewForkHSR);
            shockModelItemView = itemView.findViewById(R.id.textViewShockModel);
            shockSpringRateItemView = itemView.findViewById(R.id.textViewShockSpringRate);
            shockVolumeSpacersItemView = itemView.findViewById(R.id.textViewShockVolumeSpacers);
            shockLSCItemView = itemView.findViewById(R.id.textViewShockLSC);
            shockHSCItemView = itemView.findViewById(R.id.textViewShockHSC);
            shockLSRItemView = itemView.findViewById(R.id.textViewShockLSR);
            shockHSRItemView = itemView.findViewById(R.id.textViewShockHSR);
            frontTirePressureItemView = itemView.findViewById(R.id.textViewFrontPressure);
            rearTirePressureItemView = itemView.findViewById(R.id.textViewRearPressure);

            itemView.setOnClickListener(new View.OnClickListener() {

                // Sends data to the detailed bike screen
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    final Bikes current = mBikes.get(position);
                    Intent intent = new Intent(context, BikesDetailList.class);
                    intent.putExtra("bikeID", current.getBikeID());
                    intent.putExtra("bikeName", current.getBikeName());
                    intent.putExtra("forkModel", current.getForkModel());
                    intent.putExtra("forkSpringRate", current.getForkSpringRate());
                    intent.putExtra("forkVolumeSpacers", current.getForkVolumeSpacers());
                    intent.putExtra("forkLSC", current.getForkLSC());
                    intent.putExtra("forkHSC", current.getForkHSC());
                    intent.putExtra("forkLSR", current.getForkLSR());
                    intent.putExtra("forkHSR", current.getForkHSR());
                    intent.putExtra("shockModel", current.getShockModel());
                    intent.putExtra("shockSpringRate", current.getShockSpringRate());
                    intent.putExtra("shockVolumeSpacers", current.getShockVolumeSpacers());
                    intent.putExtra("shockLSC", current.getShockLSC());
                    intent.putExtra("shockHSC", current.getShockHSC());
                    intent.putExtra("shockLSR", current.getShockLSR());
                    intent.putExtra("shockHSR", current.getShockHSR());
                    intent.putExtra("frontTirePressure", current.getFrontTirePressure());
                    intent.putExtra("rearTirePressure", current.getRearTirePressure());
                    context.startActivity(intent);
                }
            });
        }
    }

    @NonNull
    @Override
    public BikesAdapter.BikeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.bikes_list,parent,false);
        return new BikeViewHolder(itemView);
    }

    // This is where you put things on the text fields
    @Override
    public void onBindViewHolder(@NonNull BikeViewHolder holder, int position) {
        if (mBikes != null) {
            final Bikes current = mBikes.get(position);
            holder.bikeNameItemView.setText(current.getBikeName());
            holder.forkModelItemView.setText(current.getForkModel());
            holder.forkSpringRateItemView.setText(current.getForkSpringRate());
            holder.forkVolumeSpacersItemView.setText(current.getForkVolumeSpacers());
            holder.forkLSCItemView.setText(current.getForkLSC());
            holder.forkHSCItemView.setText(current.getForkHSC());
            holder.forkLSRItemView.setText(current.getForkLSR());
            holder.forkHSRItemView.setText(current.getForkHSR());
            holder.shockModelItemView.setText(current.getShockModel());
            holder.shockSpringRateItemView.setText(current.getShockLSC());
            holder.shockVolumeSpacersItemView.setText(current.getShockHSC());
            holder.shockLSCItemView.setText(current.getShockLSR());
            holder.shockHSCItemView.setText(current.getShockHSR());
            holder.shockLSRItemView.setText(current.getShockLSR());
            holder.shockHSRItemView.setText(current.getShockHSR());
            holder.frontTirePressureItemView.setText(current.getFrontTirePressure());
            holder.rearTirePressureItemView.setText(current.getRearTirePressure());
        } else {
            holder.bikeNameItemView.setText("No Bike Name");
            holder.forkModelItemView.setText("No Fork Model");
            holder.forkSpringRateItemView.setText("No Fork Spring Rate");
            holder.forkVolumeSpacersItemView.setText("No Fork Volume Spacers");
            holder.forkLSCItemView.setText("No Fork LSC");
            holder.forkHSCItemView.setText("No Fork HSC");
            holder.forkLSRItemView.setText("No Fork LSR");
            holder.forkHSRItemView.setText("No Fork HSR");
            holder.shockModelItemView.setText("No Shock Model");
            holder.shockSpringRateItemView.setText("No Shock Spring Rate");
            holder.shockVolumeSpacersItemView.setText("No Shock Volume Spacers");
            holder.shockLSCItemView.setText("No Shock LSC");
            holder.shockHSCItemView.setText("No Shock HSC");
            holder.shockLSRItemView.setText("No Shock LSR");
            holder.shockHSRItemView.setText("No Shock HSR");
            holder.frontTirePressureItemView.setText("No Front Tire Pressure");
            holder.rearTirePressureItemView.setText("No Rear Tire Pressure");
        }
    }

    @Override
    public int getItemCount() {
        if (mBikes != null) {
            return mBikes.size();
        }
        else return 0;
    }

    public void setBikes (List<Bikes> bikes) {
        mBikes = bikes;
        notifyDataSetChanged();
    }

    public BikesAdapter (Context context) {
        mInflater = LayoutInflater.from(context);
        this.context = context;
    }
}