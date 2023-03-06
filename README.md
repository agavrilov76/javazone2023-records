# Practical experience of using Java Records

45 min

# Abstract

Java Records is the one of the most prominent language feature introduced of the modern time.
It is not only an elegant way to declare an immutable value object type but also a tool to improve
overall code quality. Using records reduces the amount of boilerplate code, eliminates the
need for third-party dependencies and enables new language features and programming
techniques.

In this talk I want to share my positive experience of migration our codebase to used records
based on examples.

What is the key difference between a record and a class? What are the ways to validate record
instances? How to apply a builder design pattern? Why records are useful when writing functional
code? How records will work with pattern matching?

# Touch points

- What is a record: definition, rationale and history
- Let's compare to a class (see Point.java vs PointClass.java)
- Unique record features
    - Canonical and compact constructors (see Rectangle.java and Address.java)
        - Validation
        - Setting default values
    - Force immutability on collection record components (Fragment.java)
- Record polymorphism with interfaces (Request.java)
    - Using interface default methods (Config.java)
    - Annotations and documentation inheritance (RequestApi.java)
- Use case examples
    - Statically typed documents, map keys (Document.java)
    - API request/response types (Request.java)
    - Data access objects (DbTransaction.java)
    - Tuples, local records, intermediate result in functional style stream (Tuples.java)
- Immutability
    - Making a copy (Transaction.java)
    - Using builder pattern with custom annotation processor (Transaction.java)
        - https://github.com/Randgalt/record-builder
- Tools support
    - Records != JavaBeans
    - final - impossible to mock with standard library
    - IDE support
- Why records are important?
    - Better code using standard java language
    - Performance
        - Future value objects: https://openjdk.org/jeps/8277163
    - Record pattern matching (Preview)
        - https://openjdk.org/jeps/432
    - The future: 'wither', serialisation 2.0 and possibly even abstract records
        - `Point pp = p with { x = 3; }` https://github.com/openjdk/amber-docs/blob/master/eg-drafts/reconstruction-records-and-classes.md
        - Towards better
          serialisation: https://openjdk.org/projects/amber/design-notes/towards-better-serialization
        - https://twitter.com/BrianGoetz/status/1214224277467271168
- Q/A

# Links

- https://openjdk.org/jeps/359
- https://docs.oracle.com/en/java/javase/14/language/records.html