package com.company;

import java.util.ArrayList;

public class Main {
    private static ArrayList<Visitable> items = new ArrayList<Visitable>();

    public static double calculatePostage(Visitor visitor) {
        for(Visitable item: items)
            item.accept(visitor);

        double postage = visitor.getTotalPostage();
        return postage;
    }

    public static void main(String[] args) {
	    Visitable myBook = new Book(8.52, 1.05);
	    Visitable myCD = new CD(18.52, 3.05);
	    Visitable myDVD = new DVD(6.53, 4.02);

	    items.add(myBook);
	    items.add(myCD);
	    items.add(myDVD);

	    Visitor visitor = new USPostageVisitor();
	    double myPostage = calculatePostage(visitor);
        System.out.println("The total postage for my items shipped to the US is: " + myPostage);

        visitor = new SouthAmericanPostageVisitor();
        myPostage = calculatePostage(visitor);
        System.out.println("The total postage for my items shipped to South America is: " + myPostage);
    }
}
