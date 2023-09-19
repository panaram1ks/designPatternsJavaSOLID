package factory.abstractFactory;


public class TeaFactory implements HotDrinkFactory {

    @Override
    public HotDrink prepare(int amount) {
        System.out.println("Put in teal, boil water, pour " + amount +"ml, add lemon, enjoy!");
        return new Tea();
    }

}
