package org.xander.Composite;

public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("Pancake House Menu", "Breakfast");
        MenuComponent dinnerMenu = new Menu("Dinner Menu", "Lunch");
        MenuComponent cafeMenu = new Menu("Cafe Menu", "Dinner");
        MenuComponent dessertMenu = new Menu("Desert Menu", "Dessert!");

        MenuComponent allMenus = new Menu("All Menus", "All menus combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinnerMenu);
        allMenus.add(cafeMenu);

        fillInPancakeHouseMenu(pancakeHouseMenu);
        fillInDinnerMenu(dinnerMenu);

        dinnerMenu.add(dessertMenu);

        fillInDessertMenu(dessertMenu);
        fillInCafeMenu(cafeMenu);


        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }

    private static void fillInPancakeHouseMenu(MenuComponent pancakeHouseMenu) {
        pancakeHouseMenu.add(new MenuItem(
                "Blueberry Pancakes",
                "Pancakes made with fresh blueberries, and blueberry syrup",
                true,
                3.49
        ));
    }

    private static void fillInDinnerMenu(MenuComponent dinnerMenu) {
        dinnerMenu.add(new MenuItem(
                "Pasta",
                "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                true,
                3.89
        ));
    }

    private static void fillInDessertMenu(MenuComponent dessertMenu) {
        dessertMenu.add(new MenuItem(
                "Apple Pie",
                "Apple Pie with a flakey crust, topped with vanilla icecream",
                true,
                1.59
        ));
    }

    private static void fillInCafeMenu(MenuComponent cafeMenu) {
        cafeMenu.add(new MenuItem(
                "Burrito",
                "A large burrito, with whole pinto beans, salsa, guacamole",
                true,
                4.29));

        cafeMenu.add(new MenuItem(
                "Soup of the day",
                "Soup of the day, with a side of salad",
                true,
                3.69));
    }
}
