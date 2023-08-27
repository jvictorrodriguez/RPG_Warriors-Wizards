package org.example.RPG_game.model;

import java.lang.Character;
public interface Attacker {

    int getPower();
    default StringBuilder attack(Attacker adversary, StringBuilder sb) {

        //Todo mirar como eran los métodos genéricos
        if (this.getPower()<5)  return  weakAttack(adversary);
        return heavyAttack(adversary);

    }


    private StringBuilder heavyAttack(Attacker adversary) {
        System.out.println("HeavyAttack");
    }

    private StringBuilder weakAttack(Attacker adversary) {
        System.out.println("WeakAttack");
    }


}
