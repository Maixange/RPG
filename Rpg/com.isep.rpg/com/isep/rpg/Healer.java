package com.isep.rpg;

import java.util.List;

public class Healer extends SpellCaster {
    public List<Hero> heroes;
    public int aim;

    public boolean attack() {
        return attack(new Enemy());
    }
    public boolean heal(List<Hero> heroes,int aimedHero) {
        this.heroes = heroes;
        this.aim = aimedHero;
        return attack();
    }

    @Override
    public boolean attack(Enemy enemy) {
        if(manaPoints>diminuerMana){
            manaPoints = manaPoints - diminuerMana;
            heroes.get(aim).addLifePoints(weaponDamage);
            return true;
        }
        else{
            System.out.println("Vous n'avez pas assez de mana");
            return false;
        }
    }


}
