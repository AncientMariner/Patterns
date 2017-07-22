package org.xander.behavioral.iterator;

import java.util.ArrayList;

public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinnerMenu dinnerMenu = new DinnerMenu();
        CafeMenu cafeMenu = new CafeMenu();
        ArrayList<Menu> menuArrayList = new ArrayList<Menu>();
        menuArrayList.add(pancakeHouseMenu);
        menuArrayList.add(dinnerMenu);
        menuArrayList.add(cafeMenu);

        Waitress waitress = new Waitress(menuArrayList);
        waitress.printMenu();
    }
}
