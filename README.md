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



> from **java8** the gap between using abstract class or interface has been reduced by **default mthods**.

* variables in interfaces are public static final
	* abstarct class can have other acces modifiers for variables (private , protected, etc)

	* also for methods

* utilize abstract classes to establish a relationship between interrelated objects
	* when u want to share code among several closely related classes then this common state or behavior can be put in the abstract class

* utilize interfaces to establish a relationship between unrelated classes

* utilize interface if u want to take advantage of multiple inheritance

* **one is not better than the other**

* u may create an interface and then have an abstract class implement that interface 


## Composition 
___

**Composition is referred to HAS-A relationship between classes in Object Oriented Design**

## Aggregation
___

**Aggregartion is referred to HAS-A relationship between objects and is closely related to composition**

> The main difference is that in aggregation the child can exist independently of the parent

### Composition Over Inheritance 

* favoring object composition over class inheritance helps u keep each class encapsulated and focused on one task
* inheritance breaks encapsulation because sub classes are dependent upon the base class behavior

* most design patterns favor Composition over Inheritance 
	* Strategy
	* Decorator
	* if design patterns use composition then that means it has been tried and tested

* compostion allows for code reuse from final classes
	* impossible with inheritance because you cannot extend a final class in java

---

## The Single Responsability Principle

* **should make sure that one classat at the most is responsible for doing one task or functionality**
* the single responsablity principle is closely related to the concepts of cohesion and coupling
* low coupling means small dependenies between classes/methodes
* low cohesion means that the class does a great variety of actions

## Open Closed Principle

* classes and methodes should be open for extensions (new functionality) and closed for modification
* a class should be easily extensible without modifying the existing code
* interfaces are closed for modifications

## The Liskov Substitution Principle

* the principe defines that that object of a super class can be replaced with objects of subclasses without breaking the application

* this principle extends the Open Closed Principle 
* Simple Example is Ellipse and circle , we have super class is ellipse so we know that every circle is just a particular type of ellipse , so we will have super class ellipse and sub class circle 
	* e.g.
	```java
		public abstract class Ellipse{
			abstract int getArea();
			abstract int[] getCordinate();

			//so here for tests we could do

			Ellipse ellipse = new Circle();
			Ellipse.getArea();

		}

		class Circle extends Ellipse{
			@Override
			int getArea(){
				return 1;
			}
		}

	```


## The Interface Segregation Principle 

**Client should not be forced to depend upon interfaces that that they dont use**

* Happens mostly when a client is dependent on interface and in just only one functionality and none all the others

* The goal of interface segregation principale is to reduce the side effects and frequency of required changes by splitting the software into multiple 	, independent parts

* so if u follow this principe in java (interface) , you will implement less methods because each interface will have single functionality

* the principe is refactoring fat interface into multiple sagregated interfaces 
	* each sagredated interface contains methods which are required to a specific client

## Dependency Inversion

* **The goal is to reduce dependencies on concrete classes**
* Hight Level classes should not depend on the low level classes
	* both hight level classes and low level should depend upon abstractions

* let's say we want to implement pizza store
	* what's the first tought that pops into your head?

* start at the top and follow things down to reduce the concrete classes
* let's invert ur thinking 
	* instead at the top , start at the pizzas and think about what u can abstarct 
	* pizza is the abstraction



