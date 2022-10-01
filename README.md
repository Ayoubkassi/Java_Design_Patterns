# Java_Design_Patterns
Craete 23 design pattern using Java language 

## Design principles 

---

what every developer should know is that design patterns utilize certain set of these key design principles 

**By learning design principles you are learning the mindset that developers had when they solved the problems that where later identified as patterns**

* one of the point to know is that design principles favor abstraction over implementation.
* patterns are designed to use interfaces
* patterns favor aggregation over inheritance
	* aggregation means a collection of things that are not part of it
		* independent
		* e.g. airpanes at an airport
	* composition means something is a part of another thing 
		* cannot exist independent of the parent
		* e.g. wheels on an airplane

___

## Design Principles that will be in the code

* Programming to an interface
* Favor Composition over Inheritance
* Delegation principles 
* Single Responsibility
* Open Closed Design
* Liskov Substitution
* Interface Segregation
* Dependency Injection (Inversion)


---

## Design Smells

**Structures in the design that indicate violation of fundamental design principles and negatively impact design quality**

### General Design Smells

- Rigidity
	- the tendency of sofware to be difficult to change
	- a signle change causes a cascade of subsequent changes in dependent modules
	- the more modules that must be changed the more rigid the design

- Fragility
	- the tendency of software to break in many places when a single change is made
	- as the fragility of a module increases , the likelihood that a change will introduce unexpected problems rise

- Immobility
	- contains parts that could be useful in other systems , but the effort and risk of separating them from the original system are too great

- Opacity
- Needless repetition
- Viscosity
- Needless Complexity


---

> Smells in java code

* Several classes that duplicate 90% of each other
	* use inheritance to remove duplication
* too many public classes , members , and methods
	* violates encapsulation
* classes that are too large
	* combining every single concept in your application into one massive class
* design smells often end up creating code that is
	* hard to read
	* breaks easily
	* hard to maintain (adding new feautues or doing basuc bug fixing)


--- 

### Introduction to some main concept of computer science

> always favor interface over implementation that can be achieve by the abstarct class or the interface and polymorphism


Polymorphism
---

* I know this is probably redundant, but just to make sure we are on the same page , imagine an abstract class Animal , with two concrete implementations , Dog and Cat .

* programing to an implemntation would be :

Dog d = new Dog();
d.bark();

* declaring the variable **d** as type Dog forces us to code a concrete implementation


* programing to an interface/supertype would be:
	Animal animal = new Dog();
	animal.makeSound();



<span style="color:blue">from **java8** the gap between using abstract class or interface has been reduced by **default mthods**</span>.

* variables in interfaces are public static final
	* abstarct class can have other acces modifiers for variables (private , protected, etc)

	* also for methods

* utilize abstract classes to establish a relationship between interrelated objects
	* when u want to share code among several closely related classes then this common state or behavior can be put in the abstract class

* utilize interfaces to establish a relationship between unrelated classes

* utilize interface if u want to take advantage of multiple inheritance

* **one is not better than the other**

* u may create an interface and then have an abstract class implement that interface 

