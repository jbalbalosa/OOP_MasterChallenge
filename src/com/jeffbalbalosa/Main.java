package com.jeffbalbalosa;

public class Main {
    public static void main(String[] args) {
        System.out.println("Udemy: Java Programming Masterclass");
        System.out.println("Object Oriented Programming");
        System.out.println("Master Challenge");
        System.out.println("------------------------------------" );


        Hamburger hamburger = new Hamburger("Basic" , "Sausage" , 3.56, "White");
        double price = hamburger.itemizeHamburger();

        hamburger.addHamburgerAddition1("Lettuce", .27);
        hamburger.addHamburgerAddition2("Tomato", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println( "Total Burger price is " + hamburger.itemizeHamburger());


        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHealthAddition1("Egg",5.43 );
        healthyBurger.addHealthAddition2("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is " +  healthyBurger.itemizeHamburger());

        DeluxeBurger db= new DeluxeBurger();
        db.addHamburgerAddition1("Should not do this", 50.53);
        db.addHamburgerAddition2("Should not do this", 50.53);
        db.addHamburgerAddition3("Should not do this", 50.53);
        db.addHamburgerAddition4("Should not do this", 50.53);
        db.itemizeHamburger();

    }
}