package com.example.m3l8hw;

import java.io.Serializable;

public class Character implements Serializable {
    private int character_image;
    private String character_alive;
    private String character_name;

    public Character(int character_image, String character_alive, String character_name) {
        this.character_image = character_image;
        this.character_alive = character_alive;
        this.character_name = character_name;
    }

    public int getCharacter_image() {
        return character_image;
    }

    public void setCharacter_image(int character_image) {
        this.character_image = character_image;
    }

    public String getCharacter_alive() {
        return character_alive;
    }

    public void setCharacter_alive(String character_alive) {
        this.character_alive = character_alive;
    }

    public String getCharacter_name() {
        return character_name;
    }

    public void setCharacter_name(String character_name) {
        this.character_name = character_name;
    }
}
