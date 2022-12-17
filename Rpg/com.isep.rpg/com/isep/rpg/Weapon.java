package com.isep.rpg;

public class Weapon extends Item{
    private int weaponDamage;


    public Weapon(String name, int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    public int getweaponDamages() {
        return this.weaponDamage;
    }
    Weapon sword = new Weapon("sword", 15);
    Weapon axe = new Weapon("axe", 25);
    Weapon staff = new Weapon("staff",20);
    Weapon arrow = new Weapon("arrow",10);

}
