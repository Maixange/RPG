package com.isep.rpg;

public class Hunter extends Hero {

    private int arrow;


    public Hunter(int arrow) {
        this.arrow = arrow;
    }



    @Override
    public boolean attack(Enemy enemy) {
        if(arrow>0){
            arrow-=1;
            enemy.reduceLifePoints(weaponDamage);
            return true;
        }
        else{
            System.out.println("Vous n'avez pas assez de flèches");
            return false;
        }

    }



    public int getArrow() {
        return arrow;
    }

    @Override
    public void increaseArrowOrMana() {
        arrow+=20;
    }
}

