package org.example.RPG_game.model;

public class Wizard extends Character implements Attacker{

    private final int WIZARD_MAX_HP=100;
    private final int WIZARD_MIN_HP=50;
    private final int WIZARD_MAX_MANA=50;
    private final int WIZARD_MIN_MANA=10;
    private final int WIZARD_MAX_INTELLIGENCE=50;
    private final int WIZARD_MIN_INTELLIGENCE=1;

    private int mana;
    private int intelligence;

    public Wizard(String name, int hp, int mana, int intelligence) {
        super(name, hp);
        this.mana = mana;
        this.intelligence = intelligence;
    }

    public int getMana() {
        return mana;
    }

    public int getIntelligence() {
        return intelligence;
    }

    @Override
    public int getPower() {
        return getMana();
    }
}
