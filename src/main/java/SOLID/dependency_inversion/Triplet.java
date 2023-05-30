package SOLID.dependency_inversion;

/**
 * @author E.Parominsky 29/05/2023 12:01
 */
public class Triplet<T extends Person,R extends Relationship> {

    private T parent;
    private R relationship;
    private T child;


    public Triplet(T parent, R relationship, T child) {
        this.parent = parent;
        this.relationship = relationship;
        this.child = child;
    }

    public Person getValue0(){
        return parent;
    }

    public R getValue1(){
        return relationship;
    }

    public Person getValue2(){
        return child;
    }
}
