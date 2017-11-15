package com.company.model;

public enum PokemonBreed {
    PIKACHU("Pikachu"), CHARMANDER("Charmander"), SQUIRTLE("Squirtle"), IVYSAUR("Ivysaur");

    private String breed;

    PokemonBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return breed;
    }
}
