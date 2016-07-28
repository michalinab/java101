package it.morfoza.java101;


public class Condisional {

    public static void main(String[] args) {


        boolean b1 = true;
        boolean b2 = false;
        int s2 = 0;
        if (b1) {
            System.out.println(b1);

        } else {
            System.out.println(b2);
        }

        if (s2 == 1) {
            System.out.println(b1);

        } else {
            System.out.println(b2);
        }

        boolean boo=false;
        if (boo=false ) {
            System.out.println("lalala");

        } else {
            System.out.println("hahaha");
        }

        int wiek = 17;
        boolean jestWgimbazie = wiek >=13 && wiek<=16;
        if(jestWgimbazie){
            System.out.println("Hura!");}
            else{
            System.out.println("Nie jesteś gimnazjalistą!");
        }

            boolean niejestwgimbazie = !jestWgimbazie;
            System.out.println(niejestwgimbazie);

            if(wiek>16 && wiek <20) {
                System.out.println("liceum");
            }

            boolean nieliceum = !(wiek>16 && wiek <20);

            if(nieliceum){
                System.out.println("Jesteś już stary!!!!!");
            }



    }
}
