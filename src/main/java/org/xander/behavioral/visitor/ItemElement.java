package org.xander.behavioral.visitor;

public interface ItemElement {

    int accept(ShoppingCartVisitor visitor);
}