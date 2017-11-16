package com.company;

/**
 * public class Pokemon {

     String name;
     int level;

     PokemonBreed breed;

     public Pokemon(PokemonBreed breed, int level){
         this(breed, level, breed.getBreedName());
     }

     public Pokemon(PokemonBreed breed, int level, String nickName){
         this.name = nickName;
         this.level = level;
         this.breed = breed;
     }

     public String getName(){
         return this.name;
     }
 }
 public enum PokemonBreed {

     PIKACHU("Pikachu", "Electric"),
     SQUIRTLE("Squirtle", "Water");

     String breedName;
     String type;

     PokemonBreed(String breedName, String type){
         this.breedName = breedName;
         this.type = type;
     }

     public String getBreedName(){
         return this.breedName;
     }

     public String getType(){
         return this.type;
     }
 }
 public class PokemonBattle {


     public static void main(String args[]) {


         Pokemon p = new Pokemon(PokemonBreed.PIKACHU, 25);
         Pokemon p2 = new Pokemon(PokemonBreed.SQUIRTLE, 14);

         Pokemon p3 = new Pokemon(PokemonBreed.SQUIRTLE, 14, "water box");
         Pokemon p4 = new Pokemon(PokemonBreed.SQUIRTLE, 14, "turtle head");

         System.out.println(p.getName());
         System.out.println(p2.getName());
         System.out.println(p3.getName());
         System.out.println(p4.getName());

     }
 }
 */
public class junk {
}
