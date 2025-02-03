````java []
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	   List<String> list=new ArrayList<>();
		list.add("orange");
		list.add("kiwi");
		list.add("grape");
		list.add("pine");
		list.add("Apple");
		list.add("plum");
		list.add("banana");
		list.sort(null);
		System.out.println(list);
	}
}
````
### Output
````java []
[Apple, banana, grape, kiwi, orange, pine, plum]

````
````java []
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	   List<Integer> list=new ArrayList<>();
		list.add(8);
		list.add(3);
		list.add(6);
		list.add(10);
		list.add(2);
		list.add(9);
		list.add(1);
		list.sort(null);
		System.out.println(list);
	}
}
````
### Output
````java []
[1, 2, 3, 6, 8, 9, 10]

````
