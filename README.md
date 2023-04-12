<a href="https://ancientmariner.github.io/">Design Patterns</a>
===============

<h3>Design Patterns code examples</h3>
---------------------------------------------------------------------

A Pattern is a solution to a problem in a context.
---
<i>An Anti-Pattern tells you how to go from a problem to a BAD solution.</i>

Behavioral:

The <a href="https://github.com/AncientMariner/Patterns/tree/master/src/main/java/org/xander/behavioral/chainofresponsibility"> Chain of responsibility</a> In object-oriented design, the chain-of-responsibility pattern is a behavioral design pattern consisting of a source of command objects and a series of processing objects.

The <a href="https://github.com/AncientMariner/Patterns/tree/master/src/main/java/org/xander/behavioral/command">Command</a> Pattern encapsulates a request as an object, thereby letting you parametrize other objects with different requests, queue or log requests, and support undoable operations.

The <a href="https://github.com/AncientMariner/Patterns/tree/master/src/main/java/org/xander/behavioral/executearoundmethod">Execute around method</a> Execute around pattern executes a given block of code with a pre and post operations, this pattern is very useful when dealing with expensive resources and can be used to close the resources instead of relying on the callers to close the resource.

The <a href="https://github.com/AncientMariner/Patterns/tree/master/src/main/java/org/xander/behavioral/interpreter">Interpreter</a> Pattern is used to defines a grammatical representation for a language and provides an interpreter to deal with this grammar

The <a href="https://github.com/AncientMariner/Patterns/tree/master/src/main/java/org/xander/behavioral/iterator">Iterator</a> Pattern provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

The <a href="https://github.com/AncientMariner/Patterns/tree/master/src/main/java/org/xander/behavioral/mediator">Mediator</a> Allows loose coupling by encapsulating the way disparate sets of objects interact and communicate with each other. Allows for the actions of each object set to vary independently of one another.

The <a href="https://github.com/AncientMariner/Patterns/tree/master/src/main/java/org/xander/behavioral/memento">Memento</a> Memento design pattern is used when we want to save the state of an object so that we can restore later on.

The <a href="https://github.com/AncientMariner/Patterns/tree/master/src/main/java/org/xander/behavioral/monad">Monad</a> In functional programming, a monad is a structure that combines program fragments (functions) and wraps their return values in a type with additional computation.

The <a href="https://github.com/AncientMariner/Patterns/tree/master/src/main/java/org/xander/behavioral/nullobject">NullObject</a> All the objects are access via references, these references need to be checked to ensure they are not null before invoking any methods, because methods typically cannot be invoked on null references.

The <a href="https://github.com/AncientMariner/Patterns/tree/master/src/main/java/org/xander/behavioral/observer">Observer</a> Pattern defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically.

The <a href="https://github.com/AncientMariner/Patterns/tree/master/src/main/java/org/xander/behavioral/state">State</a> Pattern allows an object to alter its behavior when its internal state changes. The object will appear to change its class.

The <a href="https://github.com/AncientMariner/Patterns/tree/master/src/main/java/org/xander/behavioral/strategy">Strategy</a> Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

The <a href="https://github.com/AncientMariner/Patterns/tree/master/src/main/java/org/xander/behavioral/template">Template</a> Pattern defines the skeleton of an algorithm in a method, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm’s structure.

The <a href="https://github.com/AncientMariner/Patterns/tree/master/src/main/java/org/xander/behavioral/visitor">Visitor</a> Visitor pattern is used when we have to perform an operation on a group of similar kind of Objects. With the help of visitor pattern, we can move the operational logic from the objects to another class

Creational:

The <a href="https://github.com/AncientMariner/Patterns/tree/master/src/main/java/org/xander/creational/builder">Builder</a> The intent of the Builder design pattern is to separate the construction of a complex object from its representation

The <a href="https://github.com/AncientMariner/Patterns/tree/master/src/main/java/org/xander/creational/compound">Compound</a> pattern combines patterns with each other.

The <a href="https://github.com/AncientMariner/Patterns/tree/master/src/main/java/org/xander/creational/factory">Factory</a> Method Pattern defines an interface for creating an object, but lets subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.

The <a href="https://github.com/AncientMariner/Patterns/tree/master/src/main/java/org/xander/creational/objectpool">ObjectPool</a> Object pooling can offer a significant performance boost; it is most effective in situations where the cost of initializing a class instance is high, the rate of instantiation of a class is high, and the number of instantiations in use at any one time is low

The <a href="https://github.com/AncientMariner/Patterns/tree/master/src/main/java/org/xander/creational/prototype">Prototype</a> Prototype design pattern is used when the Object creation is a costly affair and requires a lot of time and resources and you have a similar object already existing

The <a href="https://github.com/AncientMariner/Patterns/tree/master/src/main/java/org/xander/creational/singleton">Singleton</a> Pattern ensures a class has only one instance, and provides a global point of access to it.

Structural:

The <a href="https://github.com/AncientMariner/Patterns/tree/master/src/main/java/org/xander/structural/adapter">Adapter</a> Pattern converts the interface of a class into another interface the clients expect. Adapter lets classes work together that couldn’t otherwise because of incompatible interfaces.

The <a href="https://github.com/AncientMariner/Patterns/tree/master/src/main/java/org/xander/structural/bridge">Bridge</a> Decouple an abstraction from its implementation so that the two can vary independently

The <a href="https://github.com/AncientMariner/Patterns/tree/master/src/main/java/org/xander/structural/composite">Composite</a> Pattern allows you to compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.

The <a href="https://github.com/AncientMariner/Patterns/tree/master/src/main/java/org/xander/structural/decorator">Decorator</a> Pattern attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

The <a href="https://github.com/AncientMariner/Patterns/tree/master/src/main/java/org/xander/structural/facade">Facade</a> Provide a unified interface to a set of interfaces in a subsystem. Facade Pattern defines a higher-level interface that makes the subsystem easier to use

The <a href="https://github.com/AncientMariner/Patterns/tree/master/src/main/java/org/xander/structural/flyweight">Flyweight</a> Use sharing to support large numbers of fine-grained objects efficiently

The <a href="https://github.com/AncientMariner/Patterns/tree/master/src/main/java/org/xander/structural/privateClass">PrivateClass</a> Private Class Data Pattern addresses the issue a class may have, concerning around protecting object state, where final cannot be declared

The <a href="https://github.com/AncientMariner/Patterns/tree/master/src/main/java/org/xander/structural/proxy">Proxy</a> Pattern provides a surrogate or placeholder for another object to control access to it.
