package com.company.model;

public enum PokemonBreed {
    PIKACHU("Pikachu", "Electric"),
    CHARMANDER("Charmander", "Fire"),
    SQUIRTLE("Squirtle", "Water"),
    IVYSAUR("Ivysaur", "Grass");

    private String breed;
    private String type;

    PokemonBreed(String breed, String type) {
        this.breed = breed;
        this.type = type;
    }

    public String getBreed(){
        return this.breed;
    }
    public String getType() {
        return type;
    }
}
