package com.jana;

public class Weapon extends Item{
    private int damage;
    private String type;

    public Weapon(String name, int quantity, String type, int damage) {
        super(name, quantity);
        this.damage = damage;
        this.type = type;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                getName()+getQuantity()+
                "damage=" + damage +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public void displayInfo() {

    }
}
