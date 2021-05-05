package com.company;

class RealPrinter {
    // The "delegate"

    void print() {
        System.out.println("The Delegate");
    }
}

class Printer {
    // The "delegator"
    RealPrinter p = new RealPrinter();

    // Create the delegate
    void print() {
        p.print(); // Delegation
    }
}

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print();
    }
}
