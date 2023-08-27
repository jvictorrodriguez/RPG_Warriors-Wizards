package org.example.RPG_game.model;



public interface Attacker {


    public Statistics attack(Character adversary);

    public Statistics weakAttack(Character adversary);
    public Statistics heavyAttack(Character adversary);


//    private Statistics heavyAttack(Character adversary) {
//        System.out.println("HeavyAttack");
//        return new Statistics(this,AttackType.HEAVY_ATTACK,this.getPower(),adversary,adversary.getPower());
//    }
//
//    private Statistics weakAttack(Attacker adversary) {
//        System.out.println("WeakAttack");
//        return new Statistics(this,AttackType.WEAK_ATTACK,this.getPower(),adversary,adversary.getPower());

    }




