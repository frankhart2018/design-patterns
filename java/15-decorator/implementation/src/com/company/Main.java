package com.company;

public class Main {

    public static void main(String[] args) {
        ConcreteComponent cc = new ConcreteComponent();

        ConcreteDecoratorEx_1 cd_1 = new ConcreteDecoratorEx_1();

        // Decorating ConcreteComponent object cc with ConcreteDecoratorEx_1
        cd_1.SetTheComponent(cc);
        cd_1.doJob();

        ConcreteDecoratorEx_2 cd_2 = new ConcreteDecoratorEx_2();

        // Decorating ConcreteComponent object cc with ConcreteDecoratorEx_2
        cd_2.SetTheComponent(cc);
        cd_2.doJob();
    }
}
