# Java Interfaces and Abstract Classes Lab

A Java project demonstrating the use of interfaces and abstract classes in an appliance management system.

## Overview
Models home appliances using Java abstract classes and interfaces, showcasing polymorphism and the design benefits of separating contract (interface) from implementation (abstract class).

## Features
- Maintainable interface defining service contract
- Abstract Appliance base class
- Refrigerator and WashingMachine concrete implementations
- Polymorphic appliance collection and testing

## Technologies Used
- **Language:** Java (JDK 8+)
- **IDE:** Eclipse

## Project Structure
```
src/
+-- Maintainable.java       # Interface defining maintenance contract
+-- Appliance.java          # Abstract base appliance class
+-- Refrigerator.java       # Concrete refrigerator implementation
+-- WashingMachine.java     # Concrete washing machine implementation
+-- TestAppliances.java     # Main class testing polymorphic behavior
```

## Usage
```bash
javac src/*.java -d out/
java -cp out/ TestAppliances
```

## Author
Kandy Kochar
