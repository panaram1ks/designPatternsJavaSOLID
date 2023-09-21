package factory.selfexercises.abstractFactory;


import javafx.util.Pair;
import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CreatureMachine {

    private List<Pair<String, AbstractFactory>> factories = new ArrayList<>();

    public CreatureMachine() throws Exception {
        Reflections reflections = new Reflections("");
        Set<Class<? extends AbstractFactory>> classes = reflections.getSubTypesOf(AbstractFactory.class);
        for(Class<? extends AbstractFactory> clazz : classes){
            String factoryName = clazz.getSimpleName().replace("Factory", "");
            factories.add(new Pair<>(factoryName, clazz.getDeclaredConstructor().newInstance()));
        }

        System.out.println();
    }

    public <T> CreatureAction createCreature(Class<T> clazz){
        if(clazz.getSimpleName().equals(Bird.class.getSimpleName())){
            CreatureAction bird = new BirdFactory().createAnimal();
            return bird;
        }
        if(clazz.getSimpleName().equals(Dog.class.getSimpleName())){
            CreatureAction dog = new DogFactory().createAnimal();
            return dog;
        }
        return null;
    }
}
