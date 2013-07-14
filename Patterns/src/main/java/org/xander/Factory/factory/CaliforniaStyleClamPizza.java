package org.xander.Factory.factory;

public class CaliforniaStyleClamPizza extends Pizza {
    public CaliforniaStyleClamPizza() {
        name = "California Style Clam Pizza";
        dough = "Middle Crust Dough with raw powder";
        sauce = "Chili Sauce";

        toppings.add("Red Chili pepper");
        toppings.add("Green Chili pepper");
    }

    @Override
    void cut() {
        System.out.println("Cutting pizza into triangle slices");
    }
}
