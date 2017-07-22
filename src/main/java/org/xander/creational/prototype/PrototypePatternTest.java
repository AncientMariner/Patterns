package org.xander.creational.prototype;

import java.util.List;

public class PrototypePatternTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Employees employees = new Employees();
        employees.loadData();

        //Use the clone method to get the Employee object
        Employees empsNew = (Employees) employees.clone();
        Employees empsNew1 = (Employees) employees.clone();
        List<String> list = empsNew.getEmpList();
        list.add("Richard");

        List<String> list1 = empsNew1.getEmpList();
        list1.remove("Jack");

        System.out.println("cloned from original List: " + employees.getEmpList());
        System.out.println("cloned List with a new element: " + list);
        System.out.println("second cloned List without an element: " + list1);
    }

}