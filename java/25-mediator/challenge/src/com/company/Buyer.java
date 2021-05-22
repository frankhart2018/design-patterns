package com.company;

public abstract class Buyer {
    // This class holds the buyer
    protected Mediator mediator;
    protected String name;
    protected int price;

    public Buyer(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void bid(int price);
    public abstract void cancelTheBid();
    public abstract void auctionHasEnded();
}

class AuctionBuyer extends Buyer {
    // Implementation of bidding process, there is an option to bid and an option to cancel the bidding
    public AuctionBuyer(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void bid(int price) {
        this.price = price;
    }

    @Override
    public void cancelTheBid() {
        this.price--;
    }

    @Override
    public void auctionHasEnded() {
        System.out.println("Received message that auction is over: " + name);
    }
}
