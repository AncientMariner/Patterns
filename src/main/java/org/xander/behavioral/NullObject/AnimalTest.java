package org.xander.behavioral.NullObject;

import java.util.ArrayList;
import java.util.List;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Dog();
        Animal nullAnimal = new NullAnimal();

        List<Animal> animals = new ArrayList<>();
        animals.add(animal);
        animals.add(nullAnimal);

        animals.forEach(Animal::makeSound);
    }
}
