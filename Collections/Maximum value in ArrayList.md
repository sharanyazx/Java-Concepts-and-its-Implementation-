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
		System.out.println("The Maximum value in an ArrayList is = "+Collections.max(list));
	}
}
````
