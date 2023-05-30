import java.util.HashMap;
import java.util.Map;

/**
 * @author E.Parominsky 29/05/2023 10:36
 */
public class Main {
    public static void main(String[] args) {
        Map<Object, Integer> bank = new HashMap<>();
        Integer key = new Integer(100);
        int key1 = 100;
        short key2 = 100;

        bank.put(key, 1);
        bank.put(key1, 2);
        bank.put(key2, 3);

        System.out.println(bank.get(key));
        System.out.println(bank.get(key1));
        System.out.println(bank.get(key2));
    }
}
