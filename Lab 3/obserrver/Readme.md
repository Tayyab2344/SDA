# Observer Design Pattern Demo

## Overview

This project demonstrates the implementation of the **Observer Design Pattern** in Java. The Observer Pattern is a behavioral design pattern where an object, known as the *Subject*, maintains a list of its dependents (called *Observers*) and notifies them of any state changes. This pattern is useful when multiple objects need to reflect changes made to a single object.

In this demo, different observers (`HexaObserver`, `OctalObserver`, and `BinaryObserver`) are notified when the state of the `Subject` changes.

## Structure

- **Subject:** The class that contains the state and notifies observers when its state changes.
- **Observer (Abstract Class):** Defines the update method that all concrete observers must implement.
- **Concrete Observers (HexaObserver, OctalObserver, BinaryObserver):** These classes implement the `Observer` class and provide their specific update behavior.

## Classes

### 1. `Subject`
The `Subject` class holds the state and the list of observers. It has methods to attach, detach, and notify all observers of state changes.

- **Methods:**
  - `getState()`: Returns the current state of the subject.
  - `setState(int state)`: Updates the state and notifies all observers.
  - `attach(Observer observer)`: Adds an observer to the list.
  - `detach(Observer observer)`: Removes an observer from the list.
  - `notifyAllObservers()`: Notifies all attached observers when the state changes.

### 2. `Observer` (Abstract Class)
The abstract class that all observers extend. It contains a `subject` reference and an abstract `update()` method.

### 3. `HexaObserver`, `OctalObserver`, and `BinaryObserver`
These are concrete observers that override the `update()` method to provide their specific implementation:
- **HexaObserver**: Displays the state in hexadecimal format.
- **OctalObserver**: Displays the state in octal format.
- **BinaryObserver**: Displays the state in binary format.

## Example Usage

In the `ObserverPatternDemo` class, we demonstrate how to attach and detach observers, and how they react when the subject's state changes.

```java
public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();

        // Attach observers
        new HexaObserver(subject);
        OctalObserver octalObserver = new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);

        System.out.println("\nDetaching OctalObserver\n");
        subject.detach(octalObserver);

        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
