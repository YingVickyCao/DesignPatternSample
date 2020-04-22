package com.hades.example.designpatterns.factory._3_factory_method.pizzza;

public class NewYorkStylePepperoniPizza extends Pizza {
    public NewYorkStylePepperoniPizza() {
        this.name = "NewYork Style Pepperoni Pizza";

        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Sliced Pepperoni");
        toppings.add("Garlic");
        toppings.add("Onion");
        toppings.add("Mushrooms");
        toppings.add("Red Pepper");
    }
}
