package com.company;

public interface Visitor {
    public void visit(Book book);
    public void visit(CD cd);
    public void visit(DVD dvd);

    public double getTotalPostage();
}

class USPostageVisitor implements Visitor {
    private double totalPostageForCart = 0;

    @Override
    public void visit(Book book) {
        if(book.getPrice() < 20.0)
            totalPostageForCart += book.getWeight() * 2;
    }

    @Override
    public void visit(CD cd) {
        if(cd.getPrice() < 20.0)
            totalPostageForCart += cd.getPrice() * 2.5;
    }

    @Override
    public void visit(DVD dvd) {
        if(dvd.getPrice() < 20.0)
            totalPostageForCart += dvd.getPrice() * 3;
    }

    @Override
    public double getTotalPostage() {
        return totalPostageForCart;
    }
}

class SouthAmericanPostageVisitor implements Visitor {
    private double totalPostageForCart = 0;

    @Override
    public void visit(Book book) {
        if(book.getPrice() < 30.0)
            totalPostageForCart += (book.getWeight() * 2) * 2;
    }

    @Override
    public void visit(CD cd) {
        if(cd.getPrice() < 20.0)
            totalPostageForCart += (cd.getPrice() * 2.5) * 2;
    }

    @Override
    public void visit(DVD dvd) {
        if(dvd.getPrice() < 20.0)
            totalPostageForCart += (dvd.getPrice() * 3) * 2;
    }

    @Override
    public double getTotalPostage() {
        return totalPostageForCart;
    }
}