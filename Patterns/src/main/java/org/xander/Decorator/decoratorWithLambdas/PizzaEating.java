package org.xander.Decorator.decoratorWithLambdas;

import static org.xander.Decorator.decoratorWithLambdas.PizzaDecorator.bakePizza;

public class PizzaEating {
    public static void main(String[] args) {
//        Pizza pizza = new ChickenTikkaPizza(new BasicPizza());
//        String finishedPizza = pizza.bakePizza();   //Basic Pizza with chicken topping
//        System.out.println(finishedPizza);

//        pizza = new ChickenTikkaPizza(new ProsciuttoPizza(new BasicPizza()));
//        finishedPizza  = pizza.bakePizza();  //Basic Pizza with prosciutto with chicken topping
//        System.out.println(finishedPizza);



//        String finishedPizza = PizzaDecorator.bakePizza(new BasicPizza(),Pizza::withChickenTikka, Pizza::withProsciutto);
        //And if you static import PizzaDecorator.bakePizza:
        String finishedPizza  = bakePizza(new BasicPizza(), Pizza::withChickenTikka, Pizza::withProsciutto);
        System.out.println(finishedPizza);


    }
}
