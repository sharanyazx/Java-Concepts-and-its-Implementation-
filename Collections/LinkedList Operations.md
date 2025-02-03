```java []
import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    LinkedList<String> cars = new LinkedList<String>();
    cars.add("Hello");
    cars.add("I'm");
    cars.add("Sharanya");
    
    // Use addFirst() to add the item to the beginning
    cars.addFirst("Welocome");
    System.out.println(cars);
    
    cars.addLast("Water");
    System.out.println(cars);
    
    cars.removeFirst();
    System.out.println(cars);
    
    cars.removeLast();
    System.out.println(cars);
    
    System.out.println(cars.getFirst());
    System.out.println(cars.getLast());
    
  }
}
```
