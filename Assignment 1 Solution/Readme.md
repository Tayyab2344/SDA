# Study Group System

This project implements a **Study Group System** where students can join study groups, and notifications are sent to members whenever a new student joins the group. The system uses the **Observer Pattern** to notify the group members about changes in the group membership.

## Diagrams Created

The following diagrams have been created to represent the structure and interactions within the system:

### 1. **Use Case Diagram**

The **Use Case Diagram** shows the interactions between the **Student** and the **System** in the context of joining a study group. The use cases include:
- **Join Group**: A student can join a study group.
- **Send Notification**: The system sends notifications to all group members when a new student joins.

### 2. **Fully Dressed Use Case**

The **Fully Dressed Use Case** describes the process and details of the **Join Group** use case:
- **Actor**: Student
- **Preconditions**: The student must be registered in the system.
- **Postconditions**: The student is added to the group, and all members are notified.
- **Basic Flow**: The student selects a group and joins. The system adds the student to the group and sends notifications.
- **Alternative Flow**: If the group is full, the student cannot join.
- **Exceptions**: The system cannot find the group; the student is informed.

### 3. **Communication Diagram**

The **Communication Diagram** illustrates the interactions between objects when a new student joins a group:
- **Objects**: Student, System, Group, NotificationService
- The Student sends a request to the System to join the group. The System adds the student to the group and notifies all members through the NotificationService.

### 4. **System Sequence Diagram (SSD)**

The **System Sequence Diagram** (SSD) shows how the **Student**, **System**, and **Notification Service** interact when a student joins a group.

#### Key Steps in SSD:
1. **Student** triggers the action to **join the group**.
2. **System** verifies the group existence, adds the student to the group, and notifies other members.
3. **Notification Service** sends a notification to all members about the new student joining the group.

### 5. **Package Diagram**

The **Package Diagram** represents the logical organization of the system into different packages.

#### Key Packages:
- **User Management**: Handles user registration and joining groups.
- **Group Management**: Manages groups, such as adding/removing members.
- **Notification**: Responsible for sending notifications when a new member joins a group.
- **Observer Pattern**: Contains the observer and notifier classes for monitoring group changes.

### 6. **Class Diagram**

The **Class Diagram** defines the structure of the main classes in the system, such as **User**, **Group**, **NotificationService**, and **Observer**.

## Code Implementation

The following classes demonstrate how the system works:

- **Group.java**: Represents a study group, handles adding members, and notifies observers.
- **Observer.java**: Interface for observers that receive notifications when a new student joins a group.
- **NotificationService.java**: Implements the Observer interface to send notifications to all group members.
- **StudyGroupApp.java**: Main class that runs the application, creating groups and joining members.

### How It Works

1. A **User** (Student) can join a group by calling the `joinGroup()` method.
2. When a user joins a group, the **Group** class adds them to the list of members and notifies all observers (NotificationService).
3. The **NotificationService** sends a notification to all members of the group, announcing the new member.

### Conclusion

This system demonstrates how to use the **Observer Pattern** to notify users in real-time when new members join a study group. It also showcases how different classes interact with each other, using the **Group**, **Observer**, and **NotificationService** components.
