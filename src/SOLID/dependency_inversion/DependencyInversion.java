package SOLID.dependency_inversion;

//DIP

// 1 High-level modules should not depend on low-level modules.
// Both should depend on abstraction.

// 2 Abstractions should not depend on details.
// Details should depend on abstraction.

enum Relationship {
    PARENT, CHILD, SIBLING
}

class Person {
    public String name;

    public Person(String name) {
        this.name = name;
    }
}
