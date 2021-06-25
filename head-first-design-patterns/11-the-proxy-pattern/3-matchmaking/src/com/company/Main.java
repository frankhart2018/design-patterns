package com.company;

import java.lang.reflect.Proxy;

public class Main {
    PersonBean[] personBeanDB = new PersonBean[5];

    public static void main(String[] args) {
        Main main = new Main();
        main.drive();
    }

    public Main() {
        createDatabase();
    }

    public void createDatabase() {
        String[] genders = {"Male", "Male", "Female", "Female", "Female"};

        for(int i = 0; i < 5; i++) {
            personBeanDB[i] = new PersonBeanImpl();
            setPersonDetails(personBeanDB[i], "Person " + String.valueOf(i), genders[i], "Interest " + String.valueOf(i), (i + 1));
        }
    }

    public void setPersonDetails(PersonBean person, String name, String gender, String interests, int rating) {
        person.setName(name);
        person.setGender(gender);
        person.setInterests(interests);
        person.setHotOrNotRating(rating);
    }

    public PersonBean getPersonFromDatabase(String name) {
        for(PersonBean person: personBeanDB) {
            if(person.getName().equals(name))
                return person;
        }

        return null;
    }

    public void drive() {
        PersonBean joe = getPersonFromDatabase("Person 2");
        PersonBean ownerProxy = getOwnerProxy(joe);
        System.out.println("Name is " + ownerProxy.getName());
        ownerProxy.setInterests("bowling, Go");
        System.out.println("Interests set from owner proxy");
        System.out.println(joe);
        try {
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception e) {
            System.out.println("Can't set rating from owner proxy");
        }
        System.out.println("Rating is " + ownerProxy.getHotOrNotRating());

        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("Name is " + nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setInterests("bowling, Go");
        } catch (Exception e) {
            System.out.println("Can't set interests from non owner proxy");
        }
        nonOwnerProxy.setHotOrNotRating(6);
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
    }

    PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person)
        );
    }

    PersonBean getNonOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person)
        );
    }
}
