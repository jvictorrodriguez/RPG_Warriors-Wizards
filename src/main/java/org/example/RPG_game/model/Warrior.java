package org.example.RPG_game.model;

import org.example.RPG_game.enums.AttackType;



public class Warrior extends Character{
    public final static int WARRIOR_MAX_HP = 200;
    public final static int WARRIOR_MIN_HP = 100;
    public final static int WARRIOR_MAX_STAMINA = 50;
    public final static int WARRIOR_MIN_STAMINA = 10;
    public final static int WARRIOR_MAX_STRENGTH = 10;
    public final static int WARRIOR_MIN_STRENGTH = 1;


    private int stamina;
    private int strength;

    public Warrior(String name, int hp, int stamina, int strength) {
        super(name, hp);
        setStamina(stamina);
        setStrength(strength);
    }

    public Warrior() {
    }


    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = WARRIOR_MIN_STAMINA < stamina
            && stamina < WARRIOR_MAX_STAMINA ? stamina : WARRIOR_MAX_STAMINA;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = WARRIOR_MIN_STRENGTH < strength
                && strength < WARRIOR_MAX_STRENGTH ? strength : WARRIOR_MAX_STRENGTH;
    }

    public void setHp(int hp) {
        this.hp = WARRIOR_MIN_HP < hp &&
                hp< WARRIOR_MAX_HP ? hp: WARRIOR_MAX_HP;
    }

    @Override
    public void increaseEnergy() {
        stamina += 1;
    }

    @Override
    public void decreaseEnergy() {
        stamina -= 5;
    }


    @Override
    public Statistics attack(Character adversary) {
        System.out.println("Warrior attacks");
        if (stamina < 5)
            return weakAttack(adversary);
        return heavyAttack(adversary);
    }
    @Override
    public Statistics weakAttack(Character adversary) {
        int damage = getStrength() / 2;
        adversary.decreaseHp(damage);
        increaseEnergy();
        if (adversary.getHp() == 0) adversary.setAlive(false);
        return new Statistics(this, AttackType.WEAK_ATTACK, damage, adversary, adversary.getHp());
    }
    @Override
    public Statistics heavyAttack(Character adversary) {
        System.out.println("Heavy Attack");
        int damage = getStrength();
        adversary.decreaseHp(damage);
        decreaseEnergy();
        if (adversary.getHp() == 0) adversary.setAlive(false);
        return new Statistics(this, AttackType.HEAVY_ATTACK, damage, adversary, adversary.getHp());
    }

    @Override
    public String toString() {
        return "Warrior " + getName() +
                " stamina=" + stamina +
                ", strength=" + strength +
                super.toString();
    }

    public void print() {
        System.out.printf("\nWarrior: %-20s HP: %8s%s  Strength:     %8s %S    Stamina: %5s%S\n",
                getName(), getHp(), E_HP,getStrength(),E_STRENGTH, getStamina(),E_STAMINA);
    }
}
