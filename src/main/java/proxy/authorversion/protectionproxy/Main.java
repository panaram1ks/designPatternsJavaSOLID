package proxy.authorversion.protectionproxy;

public class Main {

    public static void main(String[] args) {
        Car car = new Car(new Driver(12));
        car.drive();

        Car carProxy = new CarProxy(new Driver(12));
        carProxy.drive();
    }
}
