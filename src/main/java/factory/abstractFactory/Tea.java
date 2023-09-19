package factory.abstractFactory;

/**
 * @author E.Parominsky 19/09/2023 12:22
 */
public class Tea implements HotDrink{

    @Override
    public void consume() {
        System.out.println("This tea is delicious");
    }
}
