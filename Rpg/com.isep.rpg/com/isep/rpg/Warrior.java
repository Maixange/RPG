package com.isep.rpg;

public class Warrior extends Hero {

    public Warrior() {
//        this.weaponDamage = 16;
    }

    @Override
    public boolean attack(Enemy enemy) {
        enemy.reduceLifePoints(weaponDamage);
        return true;
    }


    @Override
    public void increaseArrowOrMana() {
        System.out.println("Votre personnage est un Warrior, ses dégâts vont augmenter.");
        increaseDamage();
    }
}
