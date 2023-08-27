package org.example.RPG_game.model;

import org.example.RPG_game.enums.AttackType;


public class Statistics {
    private Character character1;
    private AttackType attackType1;
    private  int levelAttack1;
    private Character character2;
    private int hpCharacter2;

    public Statistics(Character character1, AttackType attackType1, int levelAttack1, Character character2, int hpCharacter2) {
        this.character1 = character1;
        this.attackType1 = attackType1;
        this.levelAttack1 = levelAttack1;
        this.character2 = character2;
        this.hpCharacter2 = hpCharacter2;
    }

    @Override
    public String toString() {
        return
                character1.getName() + " does a "+  attackType1.getAttack() +
                " of strength " + levelAttack1 +
                " to " + character2.getName() +
                ", remaining life " + hpCharacter2;
    }
}
