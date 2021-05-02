package com.company;

// This breaks both single responsiblity principle
// and interface segregation principle
interface RestuarantInterface {
    public void acceptOnlineOrder();
    public void takeTelephoneOrder();
    public void payOnline();
    public void walkInCustomerOrder();
    public void payInPerson();
}

public class Main {

    public static void main(String[] args) {

    }
}
