package com.company.model;

public class Pokemon {

    private String nickName;
    private int level;
    private PokemonBreed breed;


    public Pokemon(PokemonBreed breed, int level) {
        this(breed, level, breed.getName());
    }

    public Pokemon(PokemonBreed breed, int level, String nickName) {
        this.breed = breed;
        this.level = level;
        this.nickName = nickName;
    }







    public String getNickName() {
        return this.nickName;
    }


    public String getName() {
        return this.breed.getName();
    }

    public void setName(String name) {
        this.breed.setName(name);
    }



    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }



    public String getType() {
        return this.breed.getType();
    }

    public void setType(String type) {
        this.breed.setType(type);
    }



    public PokemonBreed getBreed() {
        return breed;
    }

    public void setBreed(PokemonBreed breed) {
        this.breed = breed;
    }
}
