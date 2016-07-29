package it.morfoza.java101.pokemon;


public class Main {

    public static void main(String[] args) {
        Pokemon pokemon1 = new Pokemon("Pikachu", 1000, 100);
        Pokemon pokemon2 = new Pokemon("Charizard", 500, 200);
        Pokemon pokemon3 = new Pokemon("Bulbasuar", 200, 300);

        System.out.println(pokemon1);
        System.out.println(pokemon2);
        System.out.println(pokemon3);

        pokemon2.attack(pokemon1);


        System.out.println("Pokemony po walce");
        System.out.println(pokemon1);
        System.out.println(pokemon2);
        System.out.println(pokemon3);

        System.out.println("Czy Pokemon żyje?");
        if (pokemon1.isAlive()) {
            System.out.println(pokemon1.toString() + " is alive");
        } else {
            System.out.println(pokemon1.toString() + " is unconscious");
        }


    }

}
