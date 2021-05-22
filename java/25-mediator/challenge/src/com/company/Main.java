package com.company;

public class Main {

    public static void main(String[] args) {
        AuctionMediator auctionMediator = new AuctionMediator();

        Buyer b1 = new AuctionBuyer(auctionMediator, "Jason");
        Buyer b2 = new AuctionBuyer(auctionMediator, "Ian");
        Buyer b3 = new AuctionBuyer(auctionMediator, "Myra");

        // Create and add buyers
        auctionMediator.addBuyer(b1);
        auctionMediator.addBuyer(b2);
        auctionMediator.addBuyer(b3);

        System.out.println("Welcome to the auction. Tonight we are selling a vaction to Vegas. Please bid your offers.");
        System.out.println("------------------------------------------------------------------------------------------");

        System.out.println("Waiting for the buyers' offers....");

        // Making bids
        b1.bid(1800);
        b2.bid(2000);
        b3.bid(780);

        System.out.println("------------------------------------------------------------------------------------------");
        auctionMediator.findHighestBidder();

        b2.cancelTheBid();
        System.out.println(b2.name + " has cancelled his bid!, in that case ");

        auctionMediator.findHighestBidder();
    }
}
