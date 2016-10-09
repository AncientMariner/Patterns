package org.xander.behavioral.Visitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

    @Override
    public int visit(Book book) {
        int cost = 0;
        if (book.getPrice() > 50) {
            int costWithDiscount = book.getPrice() - 5;
            cost = costWithDiscount;
        } else {
            cost = book.getPrice();
        }
        System.out.println("Book ISBN::" + book.getIsbnNumber() + " cost =" + cost);
        return cost;
    }

    @Override
    public int visit(Fruit fruit) {
        int cost = fruit.getPricePerKg() * fruit.getWeight();
        System.out.println(fruit.getName() + " cost = " + cost);
        return cost;
    }

}