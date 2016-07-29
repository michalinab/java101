package it.morfoza.java101.pokemon;


public class Main {

    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon("Pikachu", 1000, 100);
        Pokemon pokemon2 = new Pokemon("Charizard", 500, 200);
        Pokemon pokemon3 = new Pokemon("Bulbasuar", 200, 300);

        System.out.println(pokemon);
        System.out.println(pokemon2);
        System.out.println(pokemon3);

        pokemon3.attack(pokemon);
        pokemon3.attack(pokemon);
        pokemon3.attack(pokemon);
        pokemon3.attack(pokemon);
        pokemon3.attack(pokemon);

        System.out.println("Pokemony po walce");
        System.out.println(pokemon);
        System.out.println(pokemon2);
        System.out.println(pokemon3);

        System.out.println("Czy Pokemon żyje?");
        if (pokemon.isAlive()) {
            System.out.println(pokemon.toString() + " is alive");
        } else {
            System.out.println(pokemon.toString() + " is unconscious");
        }


    }

}
