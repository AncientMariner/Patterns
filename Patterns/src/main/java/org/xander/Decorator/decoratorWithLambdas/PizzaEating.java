package org.xander.Decorator.decoratorWithLambdas;

import static org.xander.Decorator.decoratorWithLambdas.PizzaDecorator.bakePizza;

public class PizzaEating {
    public static void main(String[] args) {
//        old way
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


        String anotherFinishedPizza = PizzaDecorator.bakePizza(new BasicPizza(), (p) -> Pizza.withChickenTikka(p), (p) -> Pizza.withProsciutto(p));
        String oneMoreFinishedPizza = PizzaDecorator.bakePizza(new BasicPizza(), (pizza) -> Pizza.withChickenTikka(pizza), (pizza) -> Pizza.withProsciutto(pizza), (pizza) -> Pizza.withSpecial(pizza, "bacon and sausage"));
    }
}
