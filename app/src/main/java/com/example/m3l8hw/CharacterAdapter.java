package com.example.m3l8hw;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.m3l8hw.databinding.CharacterItemBinding;

import java.util.ArrayList;

public class CharacterAdapter extends RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder> {
    private ArrayList<Character> characters;
    private OnClick listener;


    public CharacterAdapter(ArrayList<Character> characters, OnClick listener) {
        this.characters = characters;
        this.listener = listener;
    }

    @NonNull
    @Override
    public CharacterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CharacterViewHolder(CharacterItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CharacterViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.bind(characters.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onClick(characters.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return characters.size();
    }

    class CharacterViewHolder extends RecyclerView.ViewHolder {
        private CharacterItemBinding binding;

        public CharacterViewHolder(@NonNull CharacterItemBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void bind(Character character) {
            binding.characterImageview.setImageResource(character.getCharacter_image());
            binding.characterAliveTv.setText(character.getCharacter_alive());
            binding.characterNameTv.setText(character.getCharacter_name());
        }
    }

}
