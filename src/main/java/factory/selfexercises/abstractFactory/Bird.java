package factory.selfexercises.abstractFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Bird implements CreatureAction {
    private static final Logger logger = LogManager.getLogger(Dog.class);

    @Override
    public String move() {
        logger.warn("Chik chirik hop hop");
        System.out.println("Chik chirik hop hop");
        return "Bird";
    }
}
