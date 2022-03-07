package com.example.m3l8hw;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.m3l8hw.databinding.FragmentLocationBinding;

import java.util.ArrayList;

public class LocationFragment extends Fragment {

    private ArrayList<Location> locations;
    private FragmentLocationBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentLocationBinding.inflate(LayoutInflater.from(requireContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        LocationAdapter locationAdapter = new LocationAdapter(locations);
        binding.locationRecycler.setAdapter(locationAdapter);
        binding.locationRecycler.setLayoutManager(new GridLayoutManager(requireContext(), 2));
    }

    private void loadData() {
        locations = new ArrayList<>();
        locations.add(new Location("Planet", "Earth (C-137)"));
        locations.add(new Location("Cluster", "Abadango"));
        locations.add(new Location("Space station", "Citadel of Ricks"));
        locations.add(new Location("Planet", "Worldender's lair"));
        locations.add(new Location("Microverse", "Anatomy Park"));
        locations.add(new Location("TV", "Interdimensional Cable"));
        locations.add(new Location("Resort", "Immortality Field Resort"));
        locations.add(new Location("Planet", "Post-Apocalyptic Earth"));
        locations.add(new Location("Planet", "Purge Planet"));
        locations.add(new Location("Planet", "Venzenulon 7"));
        locations.add(new Location("Planet", "Bepis 9"));
        locations.add(new Location("Planet", "Cronenberg Earth"));
        locations.add(new Location("Planet", "Nuptia 4"));
        locations.add(new Location("Fantasy town", "Giant's Town"));
        locations.add(new Location("Planet", "Bird World"));
        locations.add(new Location("Space station", "St. Gloopy Noops Hospital"));
        locations.add(new Location("Planet", "Earth (5-126)"));
        locations.add(new Location("Dream", "Mr. Goldenfold's dream"));
        locations.add(new Location("Planet", "Gromflom Prime"));
        locations.add(new Location("Planet", "Earth (Rpl. Dimension)"));
    }
}