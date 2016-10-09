package org.xander.behavioral.Visitor;

public interface ItemElement {

    int accept(ShoppingCartVisitor visitor);
}