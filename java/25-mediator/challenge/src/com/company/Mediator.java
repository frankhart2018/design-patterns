package com.company;

import java.util.ArrayList;
import java.util.List;

public interface Mediator {
    public void addBuyer(Buyer buyer);
    public void findHighestBidder();
}

class AuctionMediator implements Mediator {
    // This class implements the mediator interface and holds all the buyers in
    // an arraylist, we can add buyers and find the highest bidder
    private List<Buyer> buyers = new ArrayList<Buyer>();

    @Override
    public void addBuyer(Buyer buyer) {
        buyers.add(buyer);
        System.out.println(buyer.name + " was added to the buyers list.");
    }

    @Override
    public void findHighestBidder() {
        int maxBid = 0;
        Buyer winner = null;

        for(Object a: buyers) {
            Buyer b = (Buyer) a;
            if(b.price > maxBid) {
                maxBid = b.price;
                winner = b;
            }
        }

        System.out.println("The auction winner is " + winner.name + ". He paid " + winner.price + "$ for the item.");

        for(Object a: buyers) {
            Buyer b = (Buyer) a;
            b.auctionHasEnded();
        }
    }
}
