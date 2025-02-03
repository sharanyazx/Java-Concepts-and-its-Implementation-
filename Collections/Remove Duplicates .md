
```java []
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));

        Set <Integer> set = new HashSet<>(list); // Removes duplicates
        list.clear();
        list.addAll(set);

        System.out.println("ArrayList after removing duplicates: " + list);
    }
}
```
