package PizzaStore.Restaurant;

import PizzaStore.Pizza.Pizza;

public class Restaurant {
    Pizza pizza;

    public Restaurant(Pizza pizza){
        this.pizza = pizza;
    }

    public void displayInfo(){
        System.out.println("From the restaurant's menu...");
        System.out.println("---- Pizza ----");
        pizza.printPizzaInfo();
    }
}
