package org.xander.structural.proxy.protectionproxy;

import java.lang.reflect.Proxy;
import java.util.Hashtable;

public class MatchMakingTestDrive {
    Hashtable datingDB = new Hashtable();

    public static void main(String[] args) {
        MatchMakingTestDrive test = new MatchMakingTestDrive();
        test.drive();
    }

    public MatchMakingTestDrive() {
        initializeDatabase();
    }

    private void drive() {
        PersonBeanImpl joe = getPersonFromDatabase("Joe Javabean");
        PersonBeanImpl kelly = getPersonFromDatabase("Kelly Klosure");

        PersonBean ownerProxy = getOwnerProxy(joe);
        System.out.println("Name is " + ownerProxy.getName());
        ownerProxy.setInterests("bowling, Go");
        System.out.println("Interests set from owner proxy");

        try {
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception e) {
            System.out.println("Can't set rating from owner proxy");
            e.printStackTrace();
        }
        System.out.println(joe.getName() + " rating is " + ownerProxy.getHotOrNotRating());

        PersonBean nonOwnerProxy = getNonOwnerProxy(kelly);

        System.out.println("\nName is " + nonOwnerProxy.getName());

        try {
            nonOwnerProxy.setInterests("cars, Go");
        } catch (Exception e) {
            System.out.println("Can't set rating from non owner proxy");
            e.printStackTrace();
        }
        System.out.println(kelly.getName() + "Rating is " + nonOwnerProxy.getHotOrNotRating());
        System.out.println("Rating set from non owner proxy");
        nonOwnerProxy.setHotOrNotRating(3);
    }

    PersonBean getNonOwnerProxy(PersonBeanImpl personBeanImpl) {
        return (PersonBean) Proxy.newProxyInstance(
                personBeanImpl.getClass().getClassLoader(),
                personBeanImpl.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(personBeanImpl)
        );
    }


    PersonBean getOwnerProxy(PersonBeanImpl personBeanImpl) {
        return (PersonBean) Proxy.newProxyInstance(
                personBeanImpl.getClass().getClassLoader(),
                personBeanImpl.getClass().getInterfaces(),
                new OwnerInvocationHandler(personBeanImpl)
        );
    }


    PersonBeanImpl getPersonFromDatabase(String name) {
        return (PersonBeanImpl) datingDB.get(name);
    }

    void initializeDatabase() {
        PersonBeanImpl joe = new PersonBeanImpl();
        joe.setName("Joe Javabean");
        joe.setInterests("cars, computers, music");
        joe.setHotOrNotRating(7);
        datingDB.put(joe.getName(), joe);

        PersonBeanImpl kelly = new PersonBeanImpl();
        kelly.setName("Kelly Klosure");
        kelly.setInterests("ebay, movies, music");
        kelly.setHotOrNotRating(6);
        datingDB.put(kelly.getName(), kelly);
    }
}
