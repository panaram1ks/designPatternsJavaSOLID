package factory.selfexercises.abstractFactory;

public class Main {

    public static void main(String[] args) throws Exception {
        CreatureMachine machine = new CreatureMachine();
        CreatureAction dog = machine.createCreature(Dog.class);
        dog.move();

        CreatureAction bird = machine.createCreature(Bird.class);
        bird.move();

        System.out.println();
    }
}
