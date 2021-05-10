package com.company;

public class Main {

    public static void main(String[] args) {
        HotelKeeper hotelKeeper = new HotelKeeper();

        hotelKeeper.getNonVegMenu().showMenu();
        hotelKeeper.getVegMenu().showMenu();
        hotelKeeper.getBothMenus().showMenu();
    }
}
