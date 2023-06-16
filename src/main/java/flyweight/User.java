package flyweight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author E.Parominsky 15/06/2023 16:19
 */
class User {
    private String fullName;

    public User(String fullName) {
        this.fullName = fullName;
    }
}

class Demo {
    public static void main(String[] args) {
        User user1 = new User("John Smith");
        User user2 = new User("Jane Smith");

        //Flyweight example, we save five bytes
       User2 user3 = new User2("John Smith");
       User2 user4 = new User2("Jane Smith");
    }
}

class User2 {
    static List<String> strings = new ArrayList<>();
    private int[] names;

    public User2(String fullName) {
        Function<String, Integer> getOrAdd = (String s) -> {
            int idx = strings.indexOf(s);
            if (idx != -1) {
                return idx;
            } else {
                strings.add(s);
                return strings.size() - 1;
            }
        };
        names = Arrays.stream(fullName.split(" ")).mapToInt(s -> getOrAdd.apply(s)).toArray();
    }
}


