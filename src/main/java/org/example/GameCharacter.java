package org.example;

//  GameCharacter class for mini challenge in exercise 3
class GameCharacter {
    protected int health;

    public GameCharacter(int health) {
        this.health = health;
    }

    public void takeDamage(int amount) {
        health -= amount;
        if (health < 0) {
            health = 0;
        }
    }

    public int getHealth() {
        return health;
    }
}

class ArmoredCharacter extends GameCharacter {

    public ArmoredCharacter(int health) {
        super(health);
    }

    @Override
    public void takeDamage(int amount) {
        int reducedAmount = amount / 2;
        super.takeDamage(reducedAmount);
    }
}
