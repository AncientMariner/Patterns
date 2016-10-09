package org.xander.creational.Prototype;

import java.util.List;

public class PrototypePatternTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Employees emps = new Employees();
        emps.loadData();

        //Use the clone method to get the Employee object
        Employees empsNew = (Employees) emps.clone();
        Employees empsNew1 = (Employees) emps.clone();
        List<String> list = empsNew.getEmpList();
        list.add("Richard");

        List<String> list1 = empsNew1.getEmpList();
        list1.remove("Jack");

        System.out.println("cloned from original List: " + emps.getEmpList());
        System.out.println("cloned List with a new element: " + list);
        System.out.println("second cloned List without an element: " + list1);
    }

}