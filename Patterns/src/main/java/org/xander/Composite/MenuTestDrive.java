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
        waitress.printVegetarianMenu();
    }

    private static void fillInPancakeHouseMenu(MenuComponent pancakeHouseMenu) {
        pancakeHouseMenu.add(new MenuItem(
                "Blueberry Pancakes",
                "Pancakes made with fresh blueberries, and blueberry syrup",
                true,
                3.49
        ));

        pancakeHouseMenu.add(new MenuItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59));
    }

    private static void fillInDinnerMenu(MenuComponent dinnerMenu) {
        dinnerMenu.add(new MenuItem(
                "Pasta",
                "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                true,
                3.89
        ));

        dinnerMenu.add(new MenuItem(
                "Pasta",
                "Spaghetti with Bolognese Sauce, red hot chili pepper, garlic and oregano",
                false,
                3.89
        ));

        dinnerMenu.add(new MenuItem(
                "HotDog",
                "A hot dog, with saurkraut, relish, onions, topped with cheese",
                false,
                2.05)
        );
    }

    private static void fillInDessertMenu(MenuComponent dessertMenu) {
        dessertMenu.add(new MenuItem(
                "Apple Pie",
                "Apple Pie with a flakey crust, topped with vanilla ice cream",
                true,
                1.59
        ));

        dessertMenu.add(new MenuItem(
                "Blueberry Pie",
                "Blueberry Pie with a whipped cream and mint leaves",
                true,
                2.59
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

        cafeMenu.add(new MenuItem(
                "BLT",
                "Bacon with lettuce & tomato on whole wheat",
                false,
                2.39));

        cafeMenu.add(new MenuItem(
                "Pizza",
                "Huge Mozzarella pizza with tomatoes, olives and capers",
                true,
                4.39));
    }
}
