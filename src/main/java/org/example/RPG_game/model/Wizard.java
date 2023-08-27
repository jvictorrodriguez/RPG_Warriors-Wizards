package org.example.RPG_game.model;

import org.example.RPG_game.enums.AttackType;

public class Wizard extends Character{

    public final static int WIZARD_MAX_HP=100;
    public final static int WIZARD_MIN_HP=50;
    public final static int WIZARD_MAX_MANA=50;
    public final static int WIZARD_MIN_MANA=10;
    public final static int WIZARD_MAX_INTELLIGENCE=50;
    public final static int WIZARD_MIN_INTELLIGENCE=1;

    private int mana;
    private int intelligence;

    public Wizard(String name, int hp, int mana, int intelligence) {
        super(name, hp);
        setMana(mana);
        setIntelligence(intelligence);
    }

    public void setHp(int hp) {
        this.hp = WIZARD_MIN_HP < hp &&
                hp< WIZARD_MAX_HP ? hp: WIZARD_MAX_HP;
    }

    public void setMana(int mana){
        this.mana = WIZARD_MIN_MANA < mana && mana < WIZARD_MAX_MANA ? mana : WIZARD_MAX_MANA;
    }

    public void setIntelligence(int intelligence){
        this.intelligence = WIZARD_MIN_INTELLIGENCE < intelligence
            && intelligence < WIZARD_MAX_INTELLIGENCE ? intelligence : WIZARD_MAX_INTELLIGENCE;
    }
    public int getMana() {
        return mana;
    }

    public int getIntelligence() {
        return intelligence;
    }


    @Override
    public void increaseEnergy() {
        mana+=1;
    }

    @Override
    public void decreaseEnergy() {
        mana-=5;
    }

    @Override
    public Statistics attack(Character adversary) {
        System.out.println("Wizard attacks Fireball");
        if (mana < 5)
            return weakAttack(adversary);
        return heavyAttack(adversary);
    }

    @Override
    public Statistics weakAttack(Character adversary) {
        int damage = getIntelligence() / 2;
        adversary.decreaseHp(damage);
        increaseEnergy();
        if (adversary.getHp() == 0) adversary.setAlive(false);
        return new Statistics(this, AttackType.WEAK_ATTACK, damage, adversary, adversary.getHp());
    }

    @Override
    public Statistics heavyAttack(Character adversary) {
        System.out.println("Heavy Attack");
        int damage = getIntelligence();
        adversary.decreaseHp(damage);
        decreaseEnergy();
        if (adversary.getHp() == 0) adversary.setAlive(false);
        return new Statistics(this, AttackType.HEAVY_ATTACK, damage, adversary, adversary.getHp());
    }
    public void print() {
        System.out.printf("\nWizard:  %-20s HP: %8s%S  Intelligence: %8s%S    Mana:    %5s%S\n",
                getName(),getHp(), E_HP, getIntelligence(),E_INTELLIGENCE, getMana(), E_MANA);
    }
}
