package com.company.model;

public class Pokemon {
    private String name;
    private int level;
    private PokemonBreed breed;

    public Pokemon(PokemonBreed breed, int level){
        this(breed, level, breed.getBreed());
    }
    public Pokemon(PokemonBreed breed, int level, String nickName) {
        this.breed = breed;
        this.level = level;
        this.name = nickName;
    }

    public String getName() {
        return this.name;
    }

    public int getLevel() {
        return this.level;
    }

    public String getType() {
        return this.breed.getType();
    }

    public String getBreed() {
        return this.breed.getBreed();
    }
}