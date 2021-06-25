package com.company;

import java.rmi.Naming;

public class Main {

    public static void main(String[] args) {
        // Server side code
        try {
            GumballMachine gumballMachine = new GumballMachine("Seattle", 5);

            Naming.rebind("//" + "Seattle" + "/gumballmachine", gumballMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Client side code
        String[] location = {
                "rmi://santafe.mightygumball.com/gumballmachine",
                "rmi://boulder.mightygumball.com/humballmachine",
        };

        GumballMonitor[] monitor = new GumballMonitor[location.length];

        for(int i = 0; i < location.length; i++) {
            try {
                GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]);
                monitor[i] = new GumballMonitor(machine);
                System.out.println(monitor[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for(int i = 0; i < location.length; i++) {
            monitor[i].report();
        }
    }
}
