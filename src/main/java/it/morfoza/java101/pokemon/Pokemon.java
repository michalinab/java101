package it.morfoza.java101.pokemon;

public class Pokemon {
    private String name;
    private long hp;
    private long cp;

    public boolean isAlive(){
        if (hp>0) {
            return true;
        }else {
            return false;
        }
    };

    public Pokemon(String name, long hp, long cp) {
        this.name = name;
        this.hp = hp;
        this.cp = cp;
    }



    public String toString(){
        return "Pokemon: " + name + ", hp: " +hp + ", cp:" + cp + " " ;
    }

    public void takeAttack(long attackSrength) {
        hp-= attackSrength;
    }

    public void attack(Pokemon enemy) {
        if(this != enemy) {
            enemy.takeAttack(cp);
        }

    }
}
