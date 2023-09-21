package factory.selfexercises.factorymethod;

import java.lang.reflect.Constructor;
import java.util.Date;

public class CarFactory {

    public static Car produceCar(Date age, String name) throws Exception {
        Constructor<Car> constructor = Car.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Car car = constructor.newInstance();
        car.age = age;
        car.name = name;
        return car;
    }

    public static Car produceCar(Date age, Integer mileage) throws Exception {
        Constructor<Car> constructor = Car.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Car car = constructor.newInstance();
        car.age = age;
        car.mileage = mileage;
        return car;
    }
}
