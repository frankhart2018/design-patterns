package com.company;

public interface Player {
    // Extrinsic data
    public void assignWeapon(String weapon);

    public void mission();
}

class Terrrorist implements Player {
    // Intrinsic attribute
    private final String TASK;

    // Extrinsic attribute
    private String weapon;

    public Terrrorist() {
        this.TASK = "Plant a bomb";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Terrorist with weapon " + weapon + ": Task is " + TASK);
    }
}

class CounterTerrrorist implements Player {
    // Intrinsic attribute
    private final String TASK;

    // Extrinsic attribute
    private String weapon;

    public CounterTerrrorist() {
        this.TASK = "Diffuse a bomb";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Counter Terrorist with weapon " + weapon + ": Task is " + TASK);
    }
}
