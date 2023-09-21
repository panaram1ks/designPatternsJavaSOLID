package factory.selfexercises.abstractFactory;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Dog implements CreatureAction {
    private static final Logger logger = LogManager.getLogger(Dog.class);

    @Override
    public String move() {
        logger.warn("Hop hop Bark Bark");
        System.out.println("Hop hop Bark Bark");
        return "Dog";
    }
}
