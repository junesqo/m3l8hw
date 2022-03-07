package com.example.m3l8hw;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.NavHostController;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.m3l8hw.databinding.FragmentCharacterBinding;

import java.util.ArrayList;

public class CharacterFragment extends Fragment implements OnClick {
    private ArrayList<Character> characters;

    private FragmentCharacterBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentCharacterBinding.inflate(LayoutInflater.from(requireContext()), container, false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        CharacterAdapter characterAdapter = new CharacterAdapter(characters, this);
        binding.characterRecycler.setAdapter(characterAdapter);
    }

    private void loadData() {
        characters = new ArrayList<>();
        characters.add(new Character(R.drawable.rick, "Alive", "Rick Sanchez"));
        characters.add(new Character(R.drawable.morty, "Alive", "Morty Smith"));
        characters.add(new Character(R.drawable.einstein, "Dead", "Albert Einstein"));
        characters.add(new Character(R.drawable.jerry, "Alive", "Jerry Smith"));
    }

    @Override
    public void onClick(Character character) {
        NavHostFragment.findNavController(CharacterFragment.this).navigate(CharacterFragmentDirections.actionCharacterFragmentToDetailsFragment(character));
    }
}