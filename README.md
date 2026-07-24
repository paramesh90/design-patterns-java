# Design Patterns in Java

A comprehensive guide to all 23 Gang of Four (GoF) design patterns with practical examples and use cases.

## Project Structure

```
design-patterns-java/
├── creational/          # Object creation patterns
│   ├── singleton/
│   ├── factory/
│   ├── abstract_factory/
│   ├── builder/
│   └── prototype/
├── structural/          # Object composition patterns
│   ├── adapter/
│   ├── bridge/
│   ├── composite/
│   ├── decorator/
│   ├── facade/
│   ├── flyweight/
│   └── proxy/
├── behavioral/          # Object collaboration patterns
│   ├── observer/
│   ├── strategy/
│   ├── command/
│   ├── chain_of_responsibility/
│   ├── iterator/
│   ├── mediator/
│   ├── memento/
│   ├── state/
│   ├── template_method/
│   ├── visitor/
│   └── interpreter/
└── README.md
```

## Design Patterns Overview

### Creational Patterns (5)
Patterns dealing with object creation mechanisms.

- **Singleton**: Restricts instantiation to a single object
  - Use Cases: Database connections, Logger, Configuration manager, Thread pools
  
- **Factory Method**: Creates objects without specifying exact classes
  - Use Cases: Database drivers, UI components, Object creation based on type
  
- **Abstract Factory**: Creates families of related objects
  - Use Cases: Cross-platform UI, Database abstraction, Document generation
  
- **Builder**: Constructs complex objects step by step
  - Use Cases: Complex object creation, Configuration objects, Fluent APIs
  
- **Prototype**: Creates objects by cloning existing objects
  - Use Cases: Deep copying, Expensive object creation, Undo/Redo functionality

### Structural Patterns (7)
Patterns dealing with object composition and relationships.

- **Adapter**: Makes incompatible interfaces compatible
  - Use Cases: Legacy code integration, Third-party API integration
  
- **Bridge**: Decouples abstraction from implementation
  - Use Cases: Multiple implementations, Platform abstraction
  
- **Composite**: Treats individual objects and compositions uniformly
  - Use Cases: Tree structures, File systems, UI hierarchies
  
- **Decorator**: Adds behaviors to objects dynamically
  - Use Cases: UI components, Stream processing, Authentication layers
  
- **Facade**: Provides simplified interface to complex subsystem
  - Use Cases: Library APIs, Subsystem simplification
  
- **Flyweight**: Shares objects to optimize memory usage
  - Use Cases: Object pooling, Character rendering, Connection pooling
  
- **Proxy**: Controls access to another object
  - Use Cases: Lazy loading, Access control, Caching

### Behavioral Patterns (11)
Patterns dealing with object collaboration and responsibility distribution.

- **Observer**: Notifies multiple objects about state changes
  - Use Cases: Event handling, MVC architecture, Real-time notifications
  
- **Strategy**: Encapsulates interchangeable algorithms
  - Use Cases: Payment methods, Sorting algorithms, Data compression
  
- **Command**: Encapsulates requests as objects
  - Use Cases: Undo/Redo, Task scheduling, Macro recording
  
- **Chain of Responsibility**: Passes request along a chain of handlers
  - Use Cases: Event handling, Request processing, Logging chains
  
- **Iterator**: Accesses elements sequentially without exposing structure
  - Use Cases: Collection iteration, Tree traversal
  
- **Mediator**: Centralizes complex communications
  - Use Cases: Dialog coordination, Chat room, Air traffic control
  
- **Memento**: Captures and externalizes object state
  - Use Cases: Undo/Redo, Save points, State snapshots
  
- **State**: Allows behavior change based on internal state
  - Use Cases: State machines, Game states, Traffic lights
  
- **Template Method**: Defines algorithm skeleton in base class
  - Use Cases: Data processing pipelines, Framework templates
  
- **Visitor**: Adds operations to objects without modifying them
  - Use Cases: Parsing, Compilation, Report generation
  
- **Interpreter**: Defines grammar and interpreter for a language
  - Use Cases: SQL parsing, Expression evaluation, Query languages

## How to Run

Each pattern has its own directory with:
- Pattern implementation files
- Example/Client code
- Detailed comments and explanations

### Compile and Run Examples

```bash
# Navigate to a pattern directory
cd creational/singleton

# Compile all Java files
javac *.java

# Run the client
java SingletonClient
```

### Running All Patterns

```bash
# For each pattern directory, compile and run the Client class
cd creational/factory && javac *.java && java FactoryClient
cd ../../../structural/decorator && javac *.java && java DecoratorClient
cd ../../../behavioral/observer && javac *.java && java ObserverClient
```

## Key Features

✅ All 23 Gang of Four patterns  
✅ Real-world use cases for each pattern  
✅ Multiple implementation approaches  
✅ Executable Java code  
✅ Detailed comments and explanations  
✅ Easy to understand examples  

## Pattern Selection Guide

| Problem | Solution Pattern |
|---------|-----------------|
| Need single instance | Singleton |
| Create objects without specifying class | Factory Method |
| Create family of related objects | Abstract Factory |
| Build complex objects gradually | Builder |
| Clone existing objects | Prototype |
| Make incompatible interfaces work together | Adapter |
| Decouple abstraction from implementation | Bridge |
| Treat individual and composite objects uniformly | Composite |
| Add responsibilities to objects dynamically | Decorator |
| Provide unified interface to subsystem | Facade |
| Share fine-grained objects | Flyweight |
| Control access to another object | Proxy |
| Notify multiple objects of state change | Observer |
| Encapsulate interchangeable algorithms | Strategy |
| Encapsulate a request as an object | Command |
| Pass request along a chain | Chain of Responsibility |
| Access collection elements sequentially | Iterator |
| Centralize complex communications | Mediator |
| Capture and restore object state | Memento |
| Alter behavior when state changes | State |
| Define algorithm skeleton in base class | Template Method |
| Add new operations without modifying objects | Visitor |
| Define grammar for a language | Interpreter |

## When to Use Each Pattern

- Use **Creational Patterns** when you need flexible object creation
- Use **Structural Patterns** when you need to compose objects efficiently
- Use **Behavioral Patterns** when you need flexible object interaction

## Learning Path

**Beginner:**
1. Singleton
2. Factory Method
3. Observer
4. Strategy

**Intermediate:**
5. Abstract Factory
6. Builder
7. Decorator
8. Command
9. State

**Advanced:**
10. Bridge
11. Composite
12. Facade
13. Proxy
14. Chain of Responsibility
15. Iterator
16. Mediator
17. Memento
18. Template Method
19. Visitor
20. Flyweight
21. Prototype
22. Interpreter

## References

- Design Patterns: Elements of Reusable Object-Oriented Software (Gang of Four)
- Head First Design Patterns
- Refactoring.Guru - Design Patterns
- JavaDoc Official Documentation

## Author

Created for learning and reference purposes.
