``` java []
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Set <Integer> set = new HashSet<>();
	    int[]a = {1,2,2,3,6,1};
	    int[]b = {6,7 ,8,9,6,4,2};
	      for(int i:a) set.add(i);
	      for(int i:b) set.add(i);
	    System.out.println(set);
	    for(int i:set) System.out.print(i+" ");
	}
}
```
# Output
```
[1, 2, 3, 4, 6, 7, 8, 9]
1 2 3 4 6 7 8 9
```
