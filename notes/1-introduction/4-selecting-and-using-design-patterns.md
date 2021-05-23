# Overview (Software Design Approaches)

- Designing software is normally thought of as a process of putting things together.

    - A common approach is to look immediately for objects and classes and components and then think about how they should fit together.

- A better approach is to use one that is based on design patterns.

- Start out with a conceptual understanding of the whole in order to understand what needs to be accomplished.

- Identify the patterns that are present in the whole:-

    - Thinking about our problems in terms of the patterns that are present.

    - The purpose of the patterns is to define relationship among entities.

- Starting with those patterns that create the context for others.

- Working inward from the context:-

    - Looking at the remaining patterns and at any other patterns that we might have uncovered.

    - Picking the patterns that define the context for the pattenrs that would remain.

    - Repeat.

- Finally, refining the design and implementing within the context created by applying these patterns one at a time:-

    - As we refine, we have to always consider the context implied by these patterns.

    - The implementation incorporates the details dictated by the patterns.

- Designing by adding concepts within the context of the previously presented concets is attainable:-

    - Many patterns create robust software because they define contexts within which the classes that implement them can work.

# Choosing a Pattern

- With more than 20 design patterns in the catalog to choose from, it might be hard to find the one that addresses a particular design problem.

- Here are several different approaches to finding the design pattern that is right for our problem:-

- Considering how design patterns solve design problems:-

    - Determine object granularity.

    - Specify object interfaces.

    - Understanding these concepts can help guide our search for the right pattern.

- Understanding the design patterns intent:-

    - Provided with the pattern.

    - Identifying if intent is relevant to the problem.

    - We can use the classification scheme (creational, structural, behavioural) to narrouw our search.

- Studying how patterns inter-relate:-

    - Underatanding relationships between design patterns can help direct us to the right pattern or group of patterns.

- Studying patterns of like purpose:-

    - Understanding the similarities and differences between patterns of like purpose.

- Examining a cause of redesign:-

    - Finding any issues in our problem that may cause a redesign.

    - Looking at the patterns that help us avoid the causes of redesign.

- Considering what should be variable in our design:-

    - The opposite of focussing on the causes of redesign.

    - Considering what we want to be able to change without redesign.

    - The focus here is on encapsulating the concept that varies, a theme of many design patterns.

# Using and applying a pattern

- Once we have picked a design pattern, how do we use it?

- Reading the pattern once through for an overview:-

    - Paying particular attention to the applicability and consequences of a pattern to ensure the pattern is right for our problem.

- Going back and studying the structure, participants, and collaborations of the pattern:-

    - Making sure we understand the classes and objects in the pattern and how they relate to one another.

- Looking at sample code to see a concrete example of the pattern in code:-

    - Studying the code helps us learn how to implement the pattern.

- Defining the classes:-

    - Declaring their interfaces.

    - Establishing their inheritance relationships.

    - Defining the instance variables that represent data and object references.

    - Identifying existing classes in our application that the pattern will affect, and modify them accordingly.

- Choosing names for pattern participants that are meaningful in the application context:-

    - Useful to incorporate the participant name into the name that appears in the application.

    - Helps make the pattern more explicit in the implementation.

    - E.g. If we use the strategy pattern for a text compositing algorithm, then we might have classes like SimpleLayoutStrategy or TextLayoutStrategy.

- Defining application specific names for operations in the pattern:-

    - Using the responsibilities and collaborations associated with each operation as a guide.

    - Being consistent in our naming conventions:-

        - E.g. we might ue the "Create" prefix consistently to denote a factory method.

- Implementing the operations to carry out the responsibilities and collaborations in the pattern.

# How not to use a design pattern?

- Design patterns should not be applied indiscriminately.

- Often they achieve flexibility and variability by introducing additional levels of indidrection:-

    - Can complicate a design and/or cost us some performance.

    - A design pattern should only be applied when the flexibility it affords is actually needed.

    - The consequences of the design pattern are most helpful when evaluating a pattern's benefits and liabilities.