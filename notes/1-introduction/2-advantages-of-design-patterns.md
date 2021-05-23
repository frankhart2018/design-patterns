# Why use design patterns?

- The most commonly stated reasons for studing and utilizing design patterns are because they enable us to do the following:-

    - Use the best solutions for certain problems faced during software development:-

        - Makes it easier to reuse successful designs and architectures (software reuse).

        - Solutions have been evolved over a long period of time.

        - Learnin these patterns helps unexperienced developers to learn software design in an easy and faster way.

            - Get the benefit of learning from experience of others.

            - Can get a head start on old problems and avoid gotchas.

        - Help us to avoid reinventing the wheel.

    - Understand basic object-oriented principles that achieve high quality design:-

        - Keep classes separated and prevent them from having to know too much about one another.

        - Encapsulation, inheritance, and polymophism.

    - Improve team communications and individual learning by establishing a common platform:-

        - Design patterns provide a common point of reference during the analysis and design phase of a project.

        - Allows us to describe our programming apporach succinctly in terms that other programmers can easily understand:-

            - For example:- programmers can refer to a program that uses a singe object as the singleton pattern.

        - More junior team members see that the senior developers who know design patterns have something of value and useful to the junior members:-

            - Provides motivation for them to learn some of these powerful concepts.

    - Design patterns give a higher perspective on the problem and on the process of design and object oriented analysis and design:-

        - Frees us from dealing with the details too early.

        - Helps a designer get a design "right" faster.

    - Improve modifiability and maintainability of code:-

        - Time-tested solutions have evolved intro structures that can handle change more readily than what often first comes to mind as a solution.

        - Easier to understand code - making it easier to maintain.

        - Improved documentation resulting from common terminology.

# Problems addressed by design patterns

- Design patterns solve many of the day-to-day problems that object-oriented designers face, and in many different ways.

- How ot identify the appropriate objects to utilize/create:-

    - Object-oriented programs are made up of objects.

    - Object packages both data and hte procedures that operate on that data.

- How to specify object interfaces:-

    - Every operation declared by an object specifies the operation's name, the objects it takes as parameters, and the operation's return value.

    - An object's interface characterizes the complete set of requests that can be sent to the object.

- How to specify object implementations:-

    - An object's implementation is defined by its class.

    - The class specifies the object's internal data and representation and defines the operations the object can perform.

- Determining object granulatity:-

    - Objects can vary tremendously in size and number.

    - Can represent everything down to the hardware or all the way yp to entire applications.

    - Design patterns address the above issue:-

        - The <u>facade</u> pattern describes how to represent complete subsystems as objects.

        - The <u>flyweight</u> pattern describes how to support huge numbers of objects at the finest granularities.

        - <u>Abstract factory</u> and <u>builder</u> yield objects whose only responsibilites are creating other objects.

        - <u>Visitor</u> and <u>command</u> yield objects whose only responsibilities are to implement a request on another object or group of objects.