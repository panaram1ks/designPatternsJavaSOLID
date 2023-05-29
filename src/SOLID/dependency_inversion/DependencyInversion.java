package SOLID.dependency_inversion;

//DIP

// 1 High-level modules should not depend on low-level modules.
// Both should depend on abstraction.

// 2 Abstractions should not depend on details.
// Details should depend on abstraction.

import java.util.ArrayList;
import java.util.List;

enum Relationship {
    PARENT, CHILD, SIBLING
}

class Person {
    public String name;

    public Person(String name) {
        this.name = name;
    }
}

class Relationships {
    private List<Triplet<Person, Relationship>> relations = new ArrayList<>();

    public List<Triplet<Person, Relationship>> getRelations() {
        return relations;
    }

    public void addParentAndChild(Person parent, Person child) {
        relations.add(new Triplet<Person, Relationship>(parent, Relationship.PARENT, child));
        relations.add(new Triplet<Person, Relationship>(child, Relationship.CHILD, parent));
    }
}

class Research {
    public Research(Relationships relationships){
        List<Triplet<Person, Relationship>> relations = relationships.getRelations();

        relations.stream().filter(x -> x.getValue0().equals("John") && x.getValue1() == Relationship.PARENT)
                .forEach(ch -> System.out.println("John has a child called " + ch.getValue2()));
    }
}

class Demo {
    public static void main(String[] args) {
        Person parent = new Person("John");
        Person child1 = new Person("Chris");
        Person child2 = new Person("Matt");

        Relationships relationships = new Relationships();
        relationships.addParentAndChild(parent, child1);
        relationships.addParentAndChild(parent, child2);

        new Research(relationships);

    }
}
