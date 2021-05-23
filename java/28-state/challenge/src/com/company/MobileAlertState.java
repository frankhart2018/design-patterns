package com.company;

public interface MobileAlertState {
    public void alert();
}

class Vibration implements MobileAlertState {

    @Override
    public void alert() {
        System.out.println("Vibration....");
    }
}

class Silent implements MobileAlertState {

    @Override
    public void alert() {
        System.out.println("Silent....");
    }
}
