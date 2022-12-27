package com.jeffbalbalosa;

public class BasicHamburger extends Hamburger {
    private int countAdditionalItems;
    private double burgerPrice;

    public BasicHamburger(String rollType, double price) {  //, boolean addLettuce, boolean addTomato, boolean addCarrot
        super("Basic Hamburger", 1, rollType, price);
        burgerPrice +=price;
    }

    public void addItem(String name){
        if (countAdditionalItems < 5) {
            countAdditionalItems += 1;
        }

    }

}
