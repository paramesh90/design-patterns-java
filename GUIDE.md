# Complete Guide to Design Patterns in Java

## Project Completion Summary

✅ **All 23 Gang of Four Design Patterns Implemented**
- 5 Creational Patterns
- 7 Structural Patterns
- 11 Behavioral Patterns

## Quick Start Guide

### 1. Compile and Run Any Pattern

```bash
# Navigate to pattern directory
cd creational/singleton

# Compile all Java files
javac *.java

# Run the client
java SingletonClient
```

### 2. Run All Patterns (One Command)

```bash
#!/bin/bash

# Creational Patterns
echo "=== CREATIONAL PATTERNS ==="
cd creational/singleton && javac *.java && java SingletonClient && cd ../..
cd creational/factory && javac *.java && java FactoryClient && cd ../..
cd creational/abstract_factory && javac *.java && java AbstractFactoryClient && cd ../..
cd creational/builder && javac *.java && java BuilderClient && cd ../..
cd creational/prototype && javac *.java && java PrototypeClient && cd ../..

# Structural Patterns
echo "\n=== STRUCTURAL PATTERNS ==="
cd structural/adapter && javac *.java && java AdapterClient && cd ../..
cd structural/bridge && javac *.java && java BridgeClient && cd ../..
cd structural/composite && javac *.java && java CompositeClient && cd ../..
cd structural/decorator && javac *.java && java DecoratorClient && cd ../..
cd structural/facade && javac *.java && java FacadeClient && cd ../..
cd structural/proxy && javac *.java && java ProxyClient && cd ../..
cd structural/flyweight && javac *.java && java FlyweightClient && cd ../..

# Behavioral Patterns
echo "\n=== BEHAVIORAL PATTERNS ==="
cd behavioral/observer && javac *.java && java ObserverClient && cd ../..
cd behavioral/strategy && javac *.java && java StrategyClient && cd ../..
cd behavioral/command && javac *.java && java CommandClient && cd ../..
cd behavioral/chain_of_responsibility && javac *.java && java ChainClient && cd ../..
cd behavioral/state && javac *.java && java StateClient && cd ../..
cd behavioral/template_method && javac *.java && java TemplateMethodClient && cd ../..
cd behavioral/iterator && javac *.java && java IteratorClient && cd ../..
cd behavioral/visitor && javac *.java && java VisitorClient && cd ../..
cd behavioral/mediator && javac *.java && java MediatorClient && cd ../..
cd behavioral/memento && javac *.java && java MementoClient && cd ../..
cd behavioral/interpreter && javac *.java && java InterpreterClient && cd ../..
```

## Pattern Directory Structure

```
design-patterns-java/
├── README.md
├── GUIDE.md (this file)
├── creational/
│   ├── singleton/
│   │   ├── Singleton.java
│   │   ├── SingletonLazy.java
│   │   ├── SingletonBillPugh.java
│   │   ├── SingletonEnum.java
│   │   └── SingletonClient.java
│   ├── factory/
│   │   ├── Shape.java
│   │   ├── Circle.java
│   │   ├── Rectangle.java
│   │   ├── Square.java
│   │   ├── ShapeFactory.java
│   │   └── FactoryClient.java
│   ├── abstract_factory/
│   │   ├── DatabaseConnection.java
│   │   ├── MySQLConnection.java
│   │   ├── PostgreSQLConnection.java
│   │   ├── DatabaseFactory.java
│   │   ├── MySQLFactory.java
│   │   ├── PostgreSQLFactory.java
│   │   └── AbstractFactoryClient.java
│   ├── builder/
│   │   ├── Pizza.java
│   │   └── BuilderClient.java
│   └── prototype/
│       ├── Shape.java
│       ├── CirclePrototype.java
│       ├── RectanglePrototype.java
│       └── PrototypeClient.java
├── structural/
│   ├── adapter/
│   ├── bridge/
│   ├── composite/
│   ├── decorator/
│   ├── facade/
│   ├── proxy/
│   └── flyweight/
└── behavioral/
    ├── observer/
    ├── strategy/
    ├── command/
    ├── chain_of_responsibility/
    ├── state/
    ├── template_method/
    ├── iterator/
    ├── visitor/
    ├── mediator/
    ├── memento/
    └── interpreter/
```

## Individual Pattern Execution

### CREATIONAL PATTERNS

#### 1. Singleton Pattern
```bash
cd creational/singleton
javac *.java
java SingletonClient
```
**Output**: Demonstrates 4 singleton implementations (Eager, Lazy, Bill Pugh, Enum)

#### 2. Factory Method Pattern
```bash
cd creational/factory
javac *.java
java FactoryClient
```
**Output**: Creates different shapes using factory

#### 3. Abstract Factory Pattern
```bash
cd creational/abstract_factory
javac *.java
java AbstractFactoryClient
```
**Output**: Creates database connections for MySQL and PostgreSQL

#### 4. Builder Pattern
```bash
cd creational/builder
javac *.java
java BuilderClient
```
**Output**: Constructs complex Pizza objects step by step

#### 5. Prototype Pattern
```bash
cd creational/prototype
javac *.java
java PrototypeClient
```
**Output**: Clones shapes and demonstrates deep copying

### STRUCTURAL PATTERNS

#### 6. Adapter Pattern
```bash
cd structural/adapter
javac *.java
java AdapterClient
```
**Output**: Adapts legacy payment gateway to new interface

#### 7. Bridge Pattern
```bash
cd structural/bridge
javac *.java
java BridgeClient
```
**Output**: Decouples shapes from colors

#### 8. Composite Pattern
```bash
cd structural/composite
javac *.java
java CompositeClient
```
**Output**: Creates menu hierarchy with items and submenus

#### 9. Decorator Pattern
```bash
cd structural/decorator
javac *.java
java DecoratorClient
```
**Output**: Decorates coffee with various additions (milk, caramel, whipped cream)

#### 10. Facade Pattern
```bash
cd structural/facade
javac *.java
java FacadeClient
```
**Output**: Simplifies complex computer startup/shutdown process

#### 11. Proxy Pattern
```bash
cd structural/proxy
javac *.java
java ProxyClient
```
**Output**: Demonstrates lazy loading of images

#### 12. Flyweight Pattern
```bash
cd structural/flyweight
javac *.java
java FlyweightClient
```
**Output**: Shares vehicle objects to optimize memory

### BEHAVIORAL PATTERNS

#### 13. Observer Pattern
```bash
cd behavioral/observer
javac *.java
java ObserverClient
```
**Output**: Stock market notifies traders of price changes

#### 14. Strategy Pattern
```bash
cd behavioral/strategy
javac *.java
java StrategyClient
```
**Output**: Switches between payment strategies (Credit Card, PayPal, Crypto)

#### 15. Command Pattern
```bash
cd behavioral/command
javac *.java
java CommandClient
```
**Output**: Executes and undoes light commands

#### 16. Chain of Responsibility Pattern
```bash
cd behavioral/chain_of_responsibility
javac *.java
java ChainClient
```
**Output**: Expense requests pass through manager���director→VP chain

#### 17. State Pattern
```bash
cd behavioral/state
javac *.java
java StateClient
```
**Output**: Vending machine changes behavior based on state

#### 18. Template Method Pattern
```bash
cd behavioral/template_method
javac *.java
java TemplateMethodClient
```
**Output**: Different data processors follow same template

#### 19. Iterator Pattern
```bash
cd behavioral/iterator
javac *.java
java IteratorClient
```
**Output**: Iterates through student list

#### 20. Visitor Pattern
```bash
cd behavioral/visitor
javac *.java
java VisitorClient
```
**Output**: Calculates area and perimeter of shapes

#### 21. Mediator Pattern
```bash
cd behavioral/mediator
javac *.java
java MediatorClient
```
**Output**: Chat room coordinates communication between users

#### 22. Memento Pattern
```bash
cd behavioral/memento
javac *.java
java MementoClient
```
**Output**: Saves and restores document states

#### 23. Interpreter Pattern
```bash
cd behavioral/interpreter
javac *.java
java InterpreterClient
```
**Output**: Interprets boolean expressions

## Pattern Selection Quick Reference

| Pattern | Problem | Solution |
|---------|---------|----------|
| Singleton | Need single instance | Restrict instantiation |
| Factory | Create objects without classes | Delegate to factory |
| Abstract Factory | Create related families | Use factory families |
| Builder | Create complex objects | Build step by step |
| Prototype | Clone expensive objects | Use cloning |
| Adapter | Incompatible interfaces | Adapt interface |
| Bridge | Decouple abstraction | Separate implementation |
| Composite | Tree hierarchies | Composite structure |
| Decorator | Add behavior dynamically | Wrap with decorator |
| Facade | Complex subsystem | Provide simple interface |
| Proxy | Control access | Use proxy |
| Flyweight | Save memory | Share objects |
| Observer | Notify multiple objects | Define dependency |
| Strategy | Interchangeable algorithms | Encapsulate strategy |
| Command | Encapsulate requests | Package as object |
| Chain | Pass along chain | Setup handler chain |
| State | Behavior per state | Encapsulate state |
| Template | Algorithm skeleton | Override steps |
| Iterator | Sequential access | Use iterator |
| Visitor | Add operations | Use visitor |
| Mediator | Complex communication | Centralize via mediator |
| Memento | Capture state | Save memento |
| Interpreter | Define grammar | Interpret expressions |

## Learning Recommendations

### Week 1: Creational Patterns
- Day 1-2: Singleton (4 variants)
- Day 3-4: Factory Method
- Day 5: Abstract Factory
- Day 6: Builder
- Day 7: Prototype

### Week 2: Structural Patterns
- Day 1-2: Adapter, Bridge
- Day 3: Composite
- Day 4: Decorator
- Day 5: Facade
- Day 6-7: Proxy, Flyweight

### Week 3: Behavioral Patterns
- Day 1-2: Observer, Strategy
- Day 3-4: Command, Chain of Responsibility
- Day 5: State, Template Method
- Day 6: Iterator, Visitor
- Day 7: Mediator, Memento, Interpreter

## Important Notes

1. **All code is executable** - No external dependencies required
2. **Well-commented** - Each file has detailed explanations
3. **Multiple implementations** - Some patterns show variations
4. **Real-world examples** - Practical use cases included
5. **Easy to modify** - Great for learning and experimentation

## System Requirements

- Java 8 or higher
- Terminal/Command Prompt
- No IDE required (can run from command line)

## Troubleshooting

### Compilation Error
```bash
# Make sure you're in the correct directory
pwd  # Check current directory
ls   # List files to verify Java files are present
```

### Class Not Found Error
```bash
# Ensure all dependencies are compiled
javac *.java  # Compile all files first
```

### Permission Denied (on Mac/Linux)
```bash
chmod +x *.java  # Make files executable if needed
```

## Next Steps

1. Run each pattern individually
2. Study the code structure
3. Modify examples to understand better
4. Combine patterns for complex projects
5. Implement patterns in your own code

## References & Resources

- [Design Patterns: Elements of Reusable Object-Oriented Software (Gang of Four)](https://en.wikipedia.org/wiki/Design_Patterns)
- [Refactoring.Guru](https://refactoring.guru/design-patterns)
- [Head First Design Patterns](https://www.oreilly.com/library/view/head-first-design/0596007124/)
- [JavaDoc Official Documentation](https://docs.oracle.com/en/java/)

## Contributing

Feel free to enhance patterns with:
- Additional implementations
- More complex examples
- Performance comparisons
- Design pattern combinations

## License

Educational - Free to use and modify

---

**Happy Learning! 🚀**
