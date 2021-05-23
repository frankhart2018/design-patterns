package com.company;

public class Main {

    public static void main(String[] args) {
	    AlertStateContext alertStateContext = new AlertStateContext();

	    alertStateContext.alert();
	    alertStateContext.alert();

	    alertStateContext.setCurrentState(new Silent());

        alertStateContext.alert();
        alertStateContext.alert();
        alertStateContext.alert();
    }
}
