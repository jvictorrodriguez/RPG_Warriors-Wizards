package org.example.RPG_game.model;

public abstract class Character implements Attacker{

    protected final static String E_HP="❤️";
    protected final static String E_STRENGTH="💪";
    protected final static String E_STAMINA="🪫";
    protected final static String E_INTELLIGENCE="🧠";
    protected final static String E_MANA="🪄";
    /*
    Aunque la clase sea abstracta y no se pueda instanciar,
    necesita su constructor para que las subclases puedan usar los atributos
    Para crear una subclase primero se debe crear la superclase.
    Si no existe constructor de la superclase existe internamente
    un constructor vacío por defecto
     */
    static int idCounter=1;
    private int id;
    private String name;
    protected int hp;
    private boolean isAlive;

    public Character(String name, int hp) {
        this.id = idCounter++;
        this.name = name;
        setHp(hp);
        this.isAlive = true;
    }

    public Character() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }


    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public void decreaseHp(int damage){
        hp -= damage>hp ? hp: damage;
    }

    public abstract void increaseEnergy();
    public abstract void decreaseEnergy();


    public abstract void print();

    @Override
    public String toString() {
        return

                "id=" + id +
                ", name='" + name + '\'' +
                ", hp=" + hp +
                ", isAlive=" + isAlive +
                '}';
    }
}
