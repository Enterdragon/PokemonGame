package com.company.model;

public enum PokemonBreed {
    PIKACHU("Pikachu", "Electric"),
    CHARMANDER("Charmander", "Fire"),
    SQUIRTLE("Squirtle", "Water"),
    IVYSAUR("Ivysaur", "Grass");

    private String name;
    private String type;

    PokemonBreed(String name, String type) {
        this.name = name;
        this.type = type;
    }


    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;

    }
}
