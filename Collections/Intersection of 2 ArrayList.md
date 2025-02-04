

````java []

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	ArrayList <String> list1=new ArrayList<>();
	list1.add("Apple");
	list1.add("Orange");
	list1.add("Banana");
	list1.add("Pine");
	list1.add("Kiwi");
	System.out.println("List 1 = "+list1);
	
	ArrayList <String> list2=new ArrayList<>();
	list2.add("Avacado");
	list2.add("licchi");
	list2.add("Mango");
    list2.add("Apricot");
    list2.add("Apple");
     System.out.println("List 2 = " +list2);
     list1.retainAll(list2); 
    System.out.println("Intersection of 2 ArrayList = "+list1);
	}
}

````
````java []

List 1 = [Apple, Orange, Banana, Pine, Kiwi]
List 2 = [Avacado, licchi, Mango, Apricot, Apple]
Intersection of 2 ArrayList = [Apple]

````
