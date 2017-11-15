package com.company;

import com.company.model.Pokemon;
import com.company.model.PokemonBreed;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Pokemon> myPokemon = new ArrayList<>();
//        myPokemon.add(new Pokemon(PokemonBreed.PIKACHU, 9, "Electric"));
        myPokemon.add(new Pokemon(PokemonBreed.CHARMANDER, 15, "Fire", "Spike"));
        myPokemon.add(new Pokemon(PokemonBreed.SQUIRTLE, 12, "Water", "Bubbles"));
//        myPokemon.add(new Pokemon(PokemonBreed.IVYSAUR, 17, "Grass"));

        PokemonBattle battle = new PokemonBattle();
        int myBattleLevel = battle.getLevel(myPokemon);
        System.out.println("My Party's total level is " + myBattleLevel);

    }
}
