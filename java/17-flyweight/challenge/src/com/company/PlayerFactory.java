package com.company;

import java.util.HashMap;

public class PlayerFactory {
    private static HashMap<String, Player> hm = new HashMap<String, Player>();

    public static Player getPlayer(String type) {
        Player p = null;

        if(hm.containsKey(type)) {
            p = hm.get(type);
        } else {
            switch (type) {
                case "Terrorist":
                    System.out.println("Terrorist created");
                    p = new Terrrorist();
                    break;
                case "CounterTerrorist":
                    System.out.println("Counter Terrorist created");
                    p = new CounterTerrrorist();
                    break;
                default:
                    System.out.println("Unreachable code!");
            }

            hm.put(type, p);
        }

        return p;
    }
}
