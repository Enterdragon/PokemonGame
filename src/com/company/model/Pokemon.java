package com.company.model;

public class Pokemon {

    private String name = "Pika";
    private int level = 12;
    private String type = "Electric";
    private PokemonBreed breed = PokemonBreed.PIKACHU;

    public Pokemon() {}

    public Pokemon(PokemonBreed breed, int level, String type, String name) {
        this.breed = breed;
        this.level = level;
        this.type = type;
        this.name = name;
    }

//    public Pokemon(PokemonBreed breed, int level, String type) {
//        this(breed, level, type, breed);
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PokemonBreed getBreed() {
        return breed;
    }

    public void setBreed(PokemonBreed breed) {
        this.breed = breed;
    }
}
