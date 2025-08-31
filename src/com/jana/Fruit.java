package com.jana;

public class Fruit implements ItemStuff{
    private String type;
    private String name;
    private int quantity;

    public Fruit(String type, String name,int quantity) {
        this.name= name;
        this.type = type;
        this.quantity = quantity;
    }
    public String getType(){
        return type;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "type='" + type + '\'' +
                "name"+getName()+ "quantity"+getQuantity()+
                '}';
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void displayInfo() {
        System.out.println();
    }
}
