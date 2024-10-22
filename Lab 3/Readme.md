# Project Overview

This project implements the **Observer Pattern** and manages event-based communication between different components. The project consists of two main folders:

## 1. Observer Folder

### Description:
The `observer` folder contains the implementation of the **Observer Design Pattern**. In this pattern, objects (observers) subscribe to a subject (the event source) to get notified when the subject's state changes.

### Files:
- `Observer.java`: An abstract class that defines the `update()` method, which will be implemented by concrete observers.
- `HexaObserver.java`: A concrete observer that converts the state to a hexadecimal string and displays it.
- `OctalObserver.java`: A concrete observer that converts the state to an octal string and displays it.
- `BinaryObserver.java`: A concrete observer that converts the state to a binary string and displays it.
- `ObserverPatternDemo.java`: A demo class that sets up the subject and observers, and simulates state changes.

### Purpose:
The purpose of this folder is to demonstrate how observers can be dynamically attached to a subject and notified of state changes. This decouples the subject from the observers and allows flexible, event-driven updates.

## 2. Management Folder

### Description:
The `management` folder contains the classes responsible for managing the subscription and notification process for events.

### Files:
- `EventManager.java`: A class that manages event listeners, allowing observers to subscribe, unsubscribe, and get notified when certain events occur (e.g., file open or save).
- `Editor.java`: A class that simulates an editor that triggers events like opening or saving files.
- `EmailNotificationListener.java`: A concrete listener that sends email notifications when an event occurs.
- `LogOpenListener.java`: A concrete listener that logs open file events to a file.
- `SmsNotificationListener.java`: A concrete listener that sends SMS notifications when an event occurs.

### Purpose:
The purpose of this folder is to manage the event system for notifying various listeners when specific events (like file operations) occur. This can be expanded to include other event types and listeners based on requirements.

---

This project demonstrates how event-driven systems work using the Observer Pattern and provides a flexible way to handle various types of notifications in a real-world application.
