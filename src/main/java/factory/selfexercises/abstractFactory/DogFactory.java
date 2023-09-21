package factory.selfexercises.abstractFactory;

public class DogFactory implements AbstractFactory{

    @Override
    public CreatureAction createAnimal() {
        Dog dog = new Dog();
        return dog;
    }

}
