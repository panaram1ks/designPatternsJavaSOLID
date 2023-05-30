package bridge.exercise;

interface Action {
    String methodMove();
}

abstract class Transport {
    public Action action;
    public Transport(Action action) {
        this.action = action;
    }
    public String showHowToMove(){
        return action.methodMove();
    }
}

class BoatAction implements Action {
    @Override
    public String methodMove() {
        return "swim";
    }
}
class FlyAction implements Action {
    @Override
    public String methodMove() {
        return "fly";
    }
}
class CarAction implements Action {
    @Override
    public String methodMove() {
        return "drive";
    }
}

class Boat extends Transport {
    public Boat(Action action) {
        super(action);
    }
}
class Fly extends Transport {
    public Fly(Action action) {
        super(action);
    }
}
class Car extends Transport{
    public Car(Action action) {
        super(action);
    }
}

public class Demo2 {
    public static void main(String[] args) {
        System.out.println(new Car(new CarAction()).showHowToMove());
        System.out.println(new Fly(new FlyAction()).showHowToMove());
        System.out.println(new Boat(new BoatAction()).showHowToMove());
    }
}
