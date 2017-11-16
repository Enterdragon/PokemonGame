package com.company;

import com.company.model.Pokemon;

import java.util.List;

public class PokemonBattle {

    public int getLevel(List<Pokemon> myPokemon) {

        int myBattleLevel = 0;
        for (Pokemon p : myPokemon) {
            System.out.print(p.getNickName() + ", ");
            System.out.print("a " + p.getName() + ", ");
            System.out.print(p.getType() + " type, ");
            System.out.println("lvl. " + p.getLevel());
            myBattleLevel += p.getLevel();
        }

        return myBattleLevel;
    }
}
