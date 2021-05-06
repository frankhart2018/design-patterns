package com.company;

public class Main {

    public static void main(String[] args) {
        ClassAdapter ca = new ClassAdapter();
        System.out.println("Class adapter is returning: " + ca.getInteger());

        ObjectAdapater oa = new ObjectAdapater(new IntegerValue());
        System.out.println("Object adapter is returning: " + oa.getInteger());
    }
}
