package org.example.RPG_game.model;

public class Warrior extends Character implements Attacker{
    private final int WARRIOR_MAX_HP=200;
    private final int WARRIOR_MIN_HP=100;
    private final int WARRIOR_MAX_STAMINA=50;
    private final int WARRIOR_MIN_STAMINA=10;
    private final int WARRIOR_MAX_STRENGTH=10;
    private final int WARRIOR_MIN_STRENGTH=1;


    private int stamina;
    private int stregth;

    public Warrior(String name, int hp,int stamina, int stregth) {
        super(name, hp);
        setStamina(stamina);
        setStregth(stregth);
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        System.out.println("stamina before ternacio "+ stamina);
    this.stamina=  WARRIOR_MIN_STAMINA <= stamina && stamina>=WARRIOR_MIN_STAMINA ? stamina: WARRIOR_MAX_STAMINA;

        System.out.println("stamina after ternacio "+ stamina);
//        salary = salary < SALARY_LIMIT ? salary : SALARY_LIMIT;
//        super.setSalary(salary);

    }

    public int getStregth() {
        return stregth;
    }

    public void setStregth(int stregth) {
        this.stregth = stregth;
    }

    @Override
    public int attack() {
        return 0;
    }

    @Override
    public void heavyAttack() {

    }

    @Override
    public void weakAttack() {

    }

    @Override
    public String toString() {
        return "Warrior{" +
                "stamina=" + stamina +
                ", stregth=" + stregth +
                "} " + super.toString();
    }
}
