package org.example.RPG_game.model;

import org.example.RPG_game.enums.AttackType;

public class Statistics {
    private Attacker character1;
    private AttackType attackType1;
    private  int levelAttack1;
    private int hpCharacter2;
    private AttackType attackType2;
    private Attacker character2;
    private  int levelAttack2;
    private int hpCharacter1;


    public Statistics(Attacker character1, AttackType attackType1, int levelAttack1, int hpCharacter2,
                      AttackType attackType2, Attacker character2, int levelAttack2, int hpCharacter1) {
        this.character1 = character1;
        this.attackType1 = attackType1;
        this.levelAttack1 = levelAttack1;
        this.hpCharacter2 = hpCharacter2;
        this.attackType2 = attackType2;
        this.character2 = character2;
        this.levelAttack2 = levelAttack2;
        this.hpCharacter1 = hpCharacter1;
    }
}
