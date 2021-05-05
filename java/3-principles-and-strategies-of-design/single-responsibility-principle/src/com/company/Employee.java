package com.company;

import javax.xml.crypto.Data;

public class Employee {
    private String employeeId;
    private String name;
    private String address;
    private Data dateOfJoining;

    // Both of these functions are not the responsibility of an Employee
    // and hence this class breaks the Single Responsibility Principle
//    public boolean isPromotionDueThisYear() {
//        // Promotion logic
//    }
//
//    public double calcIncomeTaxForCurrentYear() {
//        // Income tax logic
//    }

    // Getters / setters for all member variables
}
