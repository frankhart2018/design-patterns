package com.company;

public class AlertStateContext {
    private MobileAlertState currentState;

    public AlertStateContext() {
        currentState = new Vibration();
    }

    public void setCurrentState(MobileAlertState state) {
        this.currentState = state;
    }

    public void alert() {
        currentState.alert();
    }
}
