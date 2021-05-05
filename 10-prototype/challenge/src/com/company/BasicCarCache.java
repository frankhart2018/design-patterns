package com.company;

import java.util.Hashtable;

public class BasicCarCache {

    private static Hashtable<String, Car> carMap = new Hashtable<String, Car>();

    public static Car getCar(String carId) {
        Car cachedCar = carMap.get(carId);
        return (Car) cachedCar.clone();
    }

    public static void loadCache(float latestNanoPrice, float latestFordPrice) {
        Nano nano = new Nano();
        nano.setId("1");
        carMap.put(nano.getId(), nano);

        Nano priceNano = new Nano();
        priceNano.setId("2");
        carMap.put(priceNano.getId(), priceNano);

        Ford ford = new Ford();
        ford.setId("3");
        carMap.put(ford.getId(), ford);

        Ford priceFord = new Ford();
        priceFord.setId("4");
        carMap.put(priceFord.getId(), priceFord);
    }
}
