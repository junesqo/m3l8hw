package com.example.m3l8hw;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.m3l8hw.databinding.LocationItemBinding;

import java.util.ArrayList;

public class LocationAdapter extends RecyclerView.Adapter<LocationAdapter.LocationViewHolder> {
    private ArrayList<Location> locations;

    public LocationAdapter(ArrayList<Location> locations) {
        this.locations = locations;
    }

    @NonNull
    @Override
    public LocationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LocationViewHolder(LocationItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull LocationViewHolder holder, int position) {
        holder.bind(locations.get(position));
    }

    @Override
    public int getItemCount() {
        return locations.size();
    }

    class LocationViewHolder extends RecyclerView.ViewHolder {

        private LocationItemBinding binding;

        public LocationViewHolder(@NonNull LocationItemBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void bind(Location location) {
            binding.locationTv.setText(location.getLocation1());
            binding.locationTv2.setText(location.getLocation2());
        }
    }


}
