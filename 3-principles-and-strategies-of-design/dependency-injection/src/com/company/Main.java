package com.company;

interface Service {
    void write(String message);
}

class ServiceA implements Service {

    @Override
    public void write(String message) {
        System.out.println("Hello World");
    }
}

class Client {
    private Service myService;

    // Injects via the constructor
    public Client(Service service) {
        this.myService = service;
    }

    public void doSomething() {
        myService.write("This is a message");
    }

    // Injects via setter method
    public void setService(Service service) {
        this.myService = service;
    }
}

public class Main {
    public static void main(String[] args) {
        Service service = new ServiceA(); // The injector
        Client client = new Client(service); // Injects via constructor
        client.doSomething();
        client.setService(service);
    }
}
