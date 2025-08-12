package org.example;

// Parent class
class Vehicle {
    protected String brand = "Generic Vehicle";

    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}


// Child class
class Car extends Vehicle {
    private String modelName = "Mustang";

    public void display() {
        System.out.println("I am a " + brand + " " + modelName);
    }
}
