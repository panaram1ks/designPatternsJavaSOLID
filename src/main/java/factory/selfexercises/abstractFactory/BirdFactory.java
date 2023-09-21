package factory.selfexercises.abstractFactory;

public class BirdFactory implements AbstractFactory{

    @Override
    public CreatureAction createAnimal() {
        Bird bird = new Bird();
        return bird;
    }

}
