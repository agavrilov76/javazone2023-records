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

# Talk structure

- What is a record: definition, rationale and history
- Let's compare to a class ([Point.java](src/main/java/org/example/records/Point.java) vs
  [PointClass.java](src/main/java/org/example/records/PointClass.java))
- Unique record features
    - Canonical and compact
      constructors ([Rectangle.java](src/main/java/org/example/records/Rectangle.java)
      and [Address.java](src/main/java/org/example/records/Address.java))
        - Validation
        - Setting default values
    - Force immutability on collection record
      components ([Paragraph.java](src/main/java/org/example/records/Paragraph.java))
- Record polymorphism with
  interfaces ([Request.java](src/main/java/org/example/records/Request.java))
    - Using interface default methods ([Config.java](src/main/java/org/example/records/Config.java))
    - Annotations and documentation
      inheritance ([RequestApi.java](src/main/java/org/example/records/RequestApi.java))
- Use case examples
    - Statically typed documents ([Document.java](src/main/java/org/example/records/Document.java))
    - API request/response types ([Request.java](src/main/java/org/example/records/Request.java))
    - Data access
      objects ([DbTransaction.java](src/main/java/org/example/records/DbTransaction.java))
    - Tuples, local records, intermediate result in functional style
      stream ([Tuples.java](src/main/java/org/example/records/Tuples.java))
    - Map keys ([Maps.java](src/main/java/org/example/records/Maps.java))
- Immutability
    - Making a copy ([Transaction.java](src/main/java/org/example/records/Transaction.java))
    - Using builder pattern with custom annotation
      processor ([Transaction.java](src/main/java/org/example/records/Transaction.java))
        - https://github.com/Randgalt/record-builder
- Tools support
    - Records != JavaBeans:
        - fields may not be recognised by default
        - don't work as class proxies, cannot be ORM or JAX-RS entities
        - different reflection API
    - Records are final: impossible to mock using standard technique
    - IDE suggests to convert a class to a record
- Why records are important?
    - Better code using standard java language
        - No need to learn third-party libraries, track dependency updates
    - Performance
        - Java platform knows beforehand that records are immutable data carriers
        - Future improvements such as value objects: https://openjdk.org/jeps/8277163
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