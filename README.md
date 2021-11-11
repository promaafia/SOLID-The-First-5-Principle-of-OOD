# SOLID-The-First-5-Principle-of-OOD

 
## Introduction of OOD
OOD stands for **Object-Oriented Design**. It is a process to design software applications or computing systems using an object-oriented method. OOD serves as part of the object-oriented programming (OOP) process or lifecycle.

## What Is SOLID?
As product engineers, we generally need to manage changes in prerequisites or another component being developed or some augmentation on an element in the upkeep stage. Compose code that is not difficult to expand and keep up with and make our lifeless agonizing. Strong is a bunch of decisions that guide us on the most proficient method to accomplish that in object-arranged programming. Utilizing SOLID rules, you can stay away from terrible plans in your code and give all-around organized engineering to your plan. An awful plan prompts an unyielding and fragile codebase, a straightforward and little change can bring about bugs with a terrible plan.


Strong is an abbreviation of five arrangements of rules that were proposed by **Robert C Martin** otherwise known as **"Uncle Bob"** in the year 2000 to compose high firm, viable, and extensible programming frameworks.

## What SOLID stands for:
    S – Single Responsibility Principle (SRP)
    O – Open-Closed Principle (OCP)
    L – Liskov Substitution Principle (LSP)
    I – Interface Segregation Principle (ISP)
    D – Dependency Inversion Principle (DIP)

![Image 1](https://github.com/promaafia/SOLID-The-First-5-Principle-of-OOD/blob/master/Image/1.PNG)

## Single Responsibility Principle
Single Responsibility Principle (SRP) states that,
    
    Each class/module has a single responsibility. Software class, function module, etc. should have only one reason to change responsibility.

This rule expects to isolate practices so that if bugs emerge because of your change, it will not influence other disconnected practices. 

How does this guideline assist us with building better programming? We should see a couple of its advantages: 

    Testing – A class with one obligation will have far less experiments. 

    Lower Coupling – Less usefulness in a solitary class will have less conditions. 
   
    Association – Smaller, efficient classes are more straightforward to look than solid ones.

## Open-Closed Principle
Open-Closed Principle (OCP) states that,

    Existing entities like classes, functions, and modules, etc. are open for extensions but closed for modification.
       
        1. Open for extension, means the class’s behavior can be extended; and
        2. Closed for modification, means the source code is set and cannot be changed.

This rule expects to broaden a class's conduct without changing the current conduct of that class. This is to try not to cause messes with any place the class is being utilized. 

## Liskov Substitution Principle
Liskov Substitution Principle (LSP) states that,
    
    Objects/methods of subclasses should behave as superclass’s method without breaking the system.

This rule expects to implement consistency so the parent class or its child class can be utilized similarly with next to no blunders. 

## Interface Segregation Principle
Interface Segregation Principle (ISP) states that,

    Clients should not force to depend on methods that it does not use. It can likewise be expressed as "Numerous customer explicit interfaces are superior to one universally useful interface"

This rule targets parting a bunch of activities into more smaller sets with the goal that a class executes **ONLY** the arrangement of activities it requires.

## Dependency Inversion Principle
Dependency Inversion Principle (DIP) states that,

    High-level (Working module) modules should not depend on low-level (which module we use as like default library function) modules. Both should depend on Abstraction.

This guideline targets reducing the reliance of a high-level class on the low-level class by presenting an interface.
    
    High level Module/class: Class that executes an activity with an apparatus. 

    Low-level Module/class: The apparatus that is expected to execute the activity 

    Abstraction: Represents an interface that associates the two Classes.

## Conclusion
In this article, we discuss about the 5 principle of **SOLID** is by all accounts a small bunch from the start, yet with consistent use, it turns into a piece of you and your code that can undoubtedly be expanded, altered, tried, and refactored with next to no issues.

