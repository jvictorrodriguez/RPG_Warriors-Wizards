package org.example.RPG_game.model;

public abstract class Character {

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
    private int hp;
    private boolean isAlive;

    public Character(String name, int hp) {
        this.id = idCounter++;
        this.name = name;
        this.hp = hp;
        this.isAlive = true;
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

    @Override
    public String toString() {
        return "Character{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hp=" + hp +
                ", isAlive=" + isAlive +
                '}';
    }
}
