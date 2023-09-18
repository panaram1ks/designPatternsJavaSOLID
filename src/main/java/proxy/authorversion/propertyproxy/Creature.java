package proxy.authorversion.propertyproxy;

public class Creature {
//    private int agility;
private Property<Integer> agility = new Property<>(10);

    public Creature() {
//        agility = 123;
    }

    public int getAgility() {
        return agility.getValue();
    }

    public void setAgility(int value) {
        agility.setValue(value);
    }
}
