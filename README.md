# A brief explanation
### Observer Pattern
- A behavioral design pattern that defines a one-to-many dependency between objects, so that when one object changes state, all its dependents are notified and updated automatically.
- Benefits: Loose coupling, reusability, testability. 

### Factory Pattern
- A creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.
- Benefits: Encapsulation, flexibility, maintainability.

# My chosen real-world scenario
I chose the scenario where the player is notified of a new lootbox (case) that has appeared through the factory method.

# Code

## Notification system

### Observer interface
```java
public interface Observer {
    void handleEvent(List<Case> inventory); // method which handle updates in observer
}
```

### Observed interface
```java
public interface Observed {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
```

## Lootboxes system
### Case interface, which is implemented by specific case objects
```java
public interface Case {
    List<String> getContent(); // get list with possible loot from the case
    String getName(); // name getter
}
```

### CaseFactory interface, which is implemented by specific case factory objects
```java
public interface CaseFactory {
    Case createCase(); // factory method
}
```

# Reflection
Using the Observer Pattern in the gaming scenario enables real-time updates for new loot boxes, but it might introduce complexity and overhead in managing relationships. The Factory Pattern abstracts the creation process, allowing easy addition of new loot box types, but it could increase complexity and require careful maintenance when adding or modifying subclasses.

# Github link
```shell
git clone https://github.com/T4jgat/ObserverFactoryAssign4.git
```