# Overview

- We all talk about the way that we do things in our everyday work, hobbies, and home life and recognize repeating patterns all the time.

- These "patterns" can also happen in programming.

- Software engineers face common problems during the development of various software programs. E.g:- When we tell a colleague how we accomplish a tricky bit of programming so that the colleague doesn't have to recreate it from scratch.

- In the past, there were no standards to instruct them how to design and proceed. This becomes a significant problem when a new memeber (experienced or unexperienced) joins a team and is assigned to do a task. It takes a lot of effort to become familiar with the existing product.

- Design patterns are aimed towards Object-Oriented Programming languages.

- Designing object-oriented software is hard, and designing reusable object-oriented software is even harder. Design patterns address the above issues and makes a common platform for all developers. They help by providing a standard and give directions on how to solve common software problems.

# Definitions

- Some useful definitions of design patterns have emerged as the literature in this field has expanded.

- "Design patterns are recurring solutions to design problems you see over and ove."

- "Design patterns constitute a set of rules describing how to accomplish certain tasks in the realm of software development."

- "Design patterns focus more on reuse of recurring architectural design themes, while frameworks focus on detailed design and implementation."

- "A pattern addresses a recurring design problem that arises in specific design situations and presents a solution to it."

- "Patterns identify and specify abstractions that are above the level of single classes and instances, or of components."

- Design patterns represent the best practices used by experienced object-oriented software developers:-
    
    - Solutions to general problems that software developers faced during software development.
    
    - Solutions are obtained by trial and error by numerous software developers over quite a substantial period of time.

- Design patterns are not just about the design of objects:-

    - They are also about interaction between objects.

    - They include strategies for object inheritance and containment.

- Design patterns can exist at many levels, from very low-level specific solutions to broadly generalized system issues.

# History

- The concept of design patterns originated from Christopher Wolfgang Alexander (Austria) who was an architect:-

    - He initially applied this to architecture for buildings and towns, but, not computer programming for writing software.

- "Each pattern describes a problem which occurs over and over again in our environment, and then describes the core of the solution to that problem, in such a way that you can use this solution over a million times over, without ever doing it the same way twice." (Alexander)

- In 1994-95, the "Gan of Four" applied Alexander's concept to software development.

    - Erich Gamma, Richard Helm, Ralph Johnson and John Vlissides.

    - Soltions are expressed in terms of objects and inefaces instead of walls and doors.

- They published "Design Patterns - Elements of Reusable Object-Oriented Software":-

    - Applied the idea of patters to software design - calling them design patterns.
    
    - Described a structure within which to catalog and describe design patterns.

    - Catalogues 23 such patterns.

    - Postulated object-oriented strategies and approaches based on these design patterns.

- Gang of four did not create the patterns described in the book:-

    - They identified patterns that already existed within the software community.

    - Patterns that reflected what had been learnt about high-quality designs for specific problems.

# Four Essential Elements

- A design pattern has four essential elements.

## 1. Pattern Name

- A handle we can use to describe a design problem, its solutions, and consequences in a word or two.

- Lets us design at a higher level of abstraction.

- Makes it easier to think about designs and to communicate them and their trade-offs to others.

## 2. Problem

- Explains the problem and its context.

- Might describe specific design problems such as how to represent algorithms as objects.

- Might describe a class or object structure that is symptomatic of an inflexible design.

- Sometimes the problem will include a list of conditions that must be met before it makes sense to apply the pattern.

## 3. Solution

- Describes the elements that make up the design, their relationships, responsibilites, and collaborations.

- Does not describe a particular concrete design or implementation.

    - A pattern is like a template that can be applied in many different solutions.

    - The pattern provides an abstract description of a design problem and how a general arrangement of elements (classes and objects) solves it.

## 4. Consequences

- The results and trade-offs of applying the pattern.

- Critical for evaluating design alternatives and for understanding the costs and benefits of applying the pattern.

- Often concern space and time trade-offs.

- May address language and implementation issues as well.

- Includes its impact on a system's flexibility, extensibility, or portability regarding software reuse.