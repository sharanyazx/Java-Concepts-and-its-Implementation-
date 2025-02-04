
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
	
	ArrayList <String> list2=new ArrayList<>();
	list2.add("Avacado");
	list2.add("licchi");
	list2.add("Mango");
    list2.add("Apricot");
    list2.add("Apple");
    
     list1.retainAll(list2); 
    System.out.println(list1);
	}
}
