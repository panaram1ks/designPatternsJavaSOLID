package factory.selfexercises.factorymethod;

import org.checkerframework.checker.units.qual.C;

import java.util.Date;

public class Car {

    Date age;
    Integer mileage;
    String name;

    private Car() {
    }

    public static Car newCar(String name, Integer mileage){
        Car car = new Car();
        car.name = name;
        car.mileage = mileage;
        return car;
    }

    public static Car newCar(Integer mileage, Date age){
        Car car = new Car();
        car.mileage = mileage;
        car.age = age;
        return car;
    }
}
