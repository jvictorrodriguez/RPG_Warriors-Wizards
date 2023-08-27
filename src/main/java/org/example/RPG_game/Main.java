package org.example.RPG_game;


import org.example.RPG_game.model.*;
import org.example.RPG_game.model.Character;

public class Main {
    public static void main(String[] args) {

        Attacker war1= new Warrior("Warrior1",200,200, 100);
        Attacker war2= new Wizard("W2",1,1,1);
        Statistics stats1;
        stats1= war2.attack(war1);
        war1.attack(war2);


//        System.out.println(war1);
    }





}
