# Overview

- Design patterns vary in their granularity, level of abstraction and how they relate to one another.

- Some patterns are often used together:-

    - Composite is often used with iterator or vistor.

- Some patterns are alternatives

    - Prototype is often an alternative to Abstract Factory.

- Some patterns result in similar designs even though the patterns have different intents:-

    - The structure diagrams of composite and decorator are similar.

- There are many design patterns and so, we need a way to organize them:-

    - Design patterns are classified into families of related patterns:-

        - Helps us learn the patterns faster, and it can direct efforts to find new patterns as well.

- The 23 design patterns have several known applicationsa nd are on a middle level of granularity:-

    - They are divided into three types:-

        - Organized by purpose (reflects what a pattern does).

    - Creational - concerns the process of object creation.

    - Structural - Deals with the composition of classes and objects.

    - Behavioural - Characterizes the ways in which classes or objects interact and distribute responsibility.

- Design patterns can also be organized by scope (whether the pattern applies primarily to classes or to objects):-

    - Class patterns deal with relationships between classes and their subclasses:-

        - These relationships are established through inheritance.

    - Object patterns deal with object relationships, which can be changed at run-time and are more dynamic:-

        - Describes how objects can be composed into larger structures using object composition or by including objects within other objects.

# Creational Patterns

- A program should not depend on how objects are created and arranged.

- Creational design pattenrs provide a way to create objects.

- In java, the simplest way to create an instance of an object is using the new operator:-

    - fred = new Fred(); // Instance of Fred class

- Creational design patterns abstract the instantiation process:-

    - The creation logic is boolean.

    - Encapsulates the knowledge about which concrete classes the system uses.

    - Programmer may call a method or use another object rather than instantiating objects directly using the new operator.

- All the system at large knows about the objects is their interfaces as defined by abstract classes:-

    - Gives the programmer a lot of flexibility in what gets created, who creates it, how it gets created, and when.

    - Lets us configure a system with "product" objects that vary widely in structure and functionality.

    - Configuration can be static (compile-time) or dynamic (run-time).

- Sometimes creational patterns are competitors:-

    - There are cases where either prototype or abstract factory could be used profitably.

- Sometimes creational patterns are complementary:-

    - Builder can use one of the other patterns to implement which components get built.

    - Prototype can use singleton in its implementation.

- Creational class patterns defer some part of the object creation to subclasses.

- Creational object patterns defer it to another object.

- There are five creational patterns.

# Structural Patterns

- Describes how classes and objects can be combined to form larger structures:-

    - Utilizes inheritance to compose interfaces or implementations.

    - Structural object patterns describe ways to assemble objects.

    - E.g:- Complex user interfaces and accounting data.

- These design patterns concern class and object composition.

- The composite design pattern desribes how to build a class hierarchy made up of classes for two kinds of objects.

- The proxy design pattern acts as a convenient surrogate or placeholder for another object:-

    - Provide a level of indirection to specific properties of objects.

- There are seven structural patterns.

# Behavioural Patterns

- These design patterns are specifically concerned with communication between objects:-

    - Characterize complex control flow that is difficult to follow at runtime.

    - Shift the focus away from flow of control to let us concentrate just on the way objects are interconnected.

- These paterns increase flexibility in carrying out this communication.

- Provide solutions on how to segregate objects to be both dependent and independent.

- Concerned with algorithms and the assignment of responsibilities between objects.

- Behavioural class patterns use inheritance to describe algorithms and flow of control:-

    - The template method is an abstract definition of an algorithm:-

        - Defines an algorithm step by step.

        - A subclass fleshes out the algorithm by defining the abstract operations.

- Behavioural object patterns desribe how a group of objects can cooperate to perform a task that no single object can carry out alone:-

    - Uses object composition rather than inheritance.

    - The mediator pattern uses a mediator object for peer object communication:-

        - Mediator provides the indirection needed for loose coupling.

- There are eleven behavioural pattenrs that we will study.