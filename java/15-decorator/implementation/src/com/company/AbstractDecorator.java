package com.company;

public abstract class AbstractDecorator extends Component {
    protected Component com;

    public void SetTheComponent(Component c) {
        com = c;
    }

    public void doJob() {
        if(com != null) {
            com.doJob();
        }
    }
}

class ConcreteDecoratorEx_1 extends AbstractDecorator {
    public void doJob() {
        super.doJob();

        // Add additional responsibilities
        System.out.println("I am explicitly from Ex_1");
    }
}

class ConcreteDecoratorEx_2 extends AbstractDecorator {
    public void doJob() {
        System.out.println("");
        System.out.println("***START Ex-2***");

        super.doJob();

        // Add additional responsibilities
        System.out.println("Explicitly from DecoratorEx_2");
        System.out.println("***END. EX-2***");
    }
}
