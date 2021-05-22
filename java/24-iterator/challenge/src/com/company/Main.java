package com.company;

public class Main {

    public static void print(IteratorInterface iteratorInterface) {
        while (!iteratorInterface.isDone()) {
            System.out.println(iteratorInterface.next());
        }
    }

    public static void main(String[] args) {
        SubjectInterface scienceSubject = new Science();
        SubjectInterface artsSubject = new Arts();

        IteratorInterface scienceIterator = scienceSubject.createIterator();
        IteratorInterface artsIterator = artsSubject.createIterator();

        System.out.println("\nScience subjects: ");
        print(scienceIterator);

        System.out.println("\nArts subjects: ");
        print(artsIterator);
    }
}
