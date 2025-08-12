package org.example;

public class Main {
    public static void main(String[] args) {

        // ---  1. Basic Inheritance: The extends Keyword ---
        Car myCar = new Car();
        myCar.honk();
        myCar.display();

        //  mini challenge
        System.out.println("\nMini Challenge Exercise 1");
        Bicycle bicycle = new Bicycle();
        bicycle.honk();
        bicycle.ringBell();

        // ---  2. Abstract Classes: Defining a Template ---
        System.out.println("\n");
        Circle circle1 = new Circle();
        System.out.println(circle1.display());

        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1.display());

        //  mini challenge
        System.out.println("\nMini Challenge Exercise 2");
        Dog dog1 = new Dog();
        dog1.breath();
        dog1.makeSound();

        // ---  3. Method Overriding: Providing a New Implementation ---
        System.out.println("\n");

        Editor myEditor = new Editor();
        CodeEditor myCodeEditor = new CodeEditor();
        Editor polyEditor = new CodeEditor(); // Polymorphism

        System.out.println("--- Regular Editor ---");
        myEditor.openFile();

        System.out.println("\n--- Code Editor ---");
        myCodeEditor.openFile();

        System.out.println("\n--- Polymorphic Editor ---");
        polyEditor.openFile();

        //  mini challenge
        System.out.println("\nMini Challenge Exercise 3");
        GameCharacter regular = new GameCharacter(100);
        ArmoredCharacter armored = new ArmoredCharacter(100);


        regular.takeDamage(100);
        System.out.println("Regular character takes 100 damage. New health: " + regular.getHealth());

        armored.takeDamage(100);
        System.out.println("Armored character takes 50 damage. New health: " + armored.getHealth());


        // ---  4. Inheriting Variables & Access Rules ---
        System.out.println("\nMini Challenge Exercise 4");
        CheckingAccount myChecking = new CheckingAccount(100.0);
        myChecking.deductMonthlyFee(); // This will now be run since balance instance variable is now 'protected'

    }
}