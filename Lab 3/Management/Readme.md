# File Operations Notifier

This project implements a basic **Observer Design Pattern** for file operations (`open` and `save`). Various listeners (Email, SMS, Log) subscribe to events and are notified when these file operations occur.

## Features

- **Event-driven notifications** for file operations (`open`, `save`).
- Multiple listeners: 
  - Email Notification
  - SMS Notification
  - Log File Recording
- Checks and handles the following scenarios:
  - SMS length exceeds 160 characters.
  - File operations are attempted without opening a file first.

## Classes Overview

### 1. `Editor`
The `Editor` class represents the file editor. It allows subscribing to events like `open` and `save`, and it notifies the relevant listeners when these operations occur.

- **Methods**:
  - `openFile(String filePath)`: Opens a file and triggers the `open` event.
  - `saveFile()`: Saves a file and triggers the `save` event.

### 2. `EventManager`
The `EventManager` class manages the listeners for different events. It can subscribe, unsubscribe, and notify listeners for specific file operations.

- **Methods**:
  - `subscribe(String eventType, EventListener listener)`: Registers a listener for a given event.
  - `unsubscribe(String eventType, EventListener listener)`: Unregisters a listener for a given event.
  - `notify(String eventType, File file)`: Notifies all listeners of the event.

### 3. `EmailNotificationListener`
This class listens for file operations and sends a notification email to a specified address when an event occurs.

### 4. `SmsNotificationListener`
This class listens for file operations and sends an SMS notification to a specified phone number.

- **SMS Length Handling**: The message is limited to 160 characters. If the message exceeds this limit, a warning is printed.

### 5. `LogOpenListener`
This class listens for file operations and logs them to a specified file.

### 6. `EventListener` Interface
This interface defines the `update(String eventType, File file)` method that all listeners must implement.
