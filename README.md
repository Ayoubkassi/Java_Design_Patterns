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

	