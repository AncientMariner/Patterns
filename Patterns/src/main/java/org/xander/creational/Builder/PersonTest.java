package org.xander.creational.Builder;

public class PersonTest {
    public static void main(String[] args) {
        Person person = Person.newBuilder()
                .setCity("city")
                .setHomeOwner(false)
                .setStreetAddress("address")
                .build();
        System.out.println(person);

        Person value = GenericBuilder.of(Person::new)
                .with(Person::setFirstName, "Otto")
                .with(Person::setSalutation, "Doctor")
//                added for the predicate test
//                .with(Person::setFemale, true)
                .build();
        System.out.println(value);
    }
}
