package com.company;

public class HotelKeeper {
    public Menus getNonVegMenu() {
        Hotel nonVegRestaurant = new NonVegRestaurant();
        return nonVegRestaurant.getMenus();
    }

    public Menus getVegMenu() {
        Hotel vegRestaurant = new VegRestaurant();
        return vegRestaurant.getMenus();
    }

    public Menus getBothMenus() {
        Hotel bothRestaurant = new VegNonBothRestaurant();
        return bothRestaurant.getMenus();
    }
}
