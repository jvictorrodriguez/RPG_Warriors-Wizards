package org.example.RPG_game.enums;

public enum AttackType {
    HEAVY_ATTACK ("Heavy attack"),
    WEAK_ATTACK("Weak attack");

    private final String attack;

    AttackType(String attack) {
        this.attack = attack;
    }

    public String getAttack() {
        return attack;
    }
}
