package factory.selfexercises.factorymethod;


import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception {
        Car car1 = CarFactory.produceCar(new Date(), 270_000);
        System.out.println(car1);
        Car car2 = CarFactory.produceCar(new Date(), "Mersedes");
        System.out.println(car2);
    }

}
