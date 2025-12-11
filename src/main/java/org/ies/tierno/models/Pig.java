package org.ies.tierno.models;

public class Pig extends Vehicle {
    protected String food;

    public Pig(String name, int age, String food){
        super(name, age);
        this.food = food;
    }

    @Override
    public void talk() {
        System.out.println("\n¡Oink, oink!\n");
    }

    @Override
    public void showInfo() {
        showAnimalInfo();
        System.out.print(" Raza: " + food);
    }
}
