```java []
public class Person{    
    String name;
    int Age;
    
	
	Person(String name,int Age){
	    this.name= "Sharanya";
	    this.Age=18;
	}
	void display(){
	    System.out.println("Hi My name is "+name);
	    System.out.println("My age is "+Age);
	}
	public static void main(String [] args){
	    Person p=new Person("Sharanya",18);
	    p.display();
	}
}

```

```java []
import java.util.*;
public class Person{    
    String name;
    int Age;
    
	
	Person(String name,int Age){
	    this.name= name;
	    this.Age=Age;
	}
	void display(){
	    System.out.println("Hi My name is "+name);
	    System.out.println("My age is "+Age);
	}
	public static void main(String [] args){
	    Scanner sc=new Scanner(System.in);
	    String name=sc.nextLine();
	    int Age =sc.nextInt();
	    Person p=new Person(name,Age);
	    p.display();
	}
}

```

```java []

public class Rectangle
{
    int length;
    int width;
    int Area(int length, int width){
       int area = length*width;
       return area;
   }
   int Perimeter(int length, int width){
       int perimeter =2*(length + width);
       return perimeter;
   }
	public static void main(String[] args) {
	    Rectangle r =new Rectangle();
	    
	    System.out.println( r.Area(1,2));
	    System.out.println(r.Perimeter(4,5));
		
	}
}
```

```java []import java.util.*;
public class Rectangle
{
    
    int Area(int length, int width){
       int area = length*width;
       return area;
   }
   int Perimeter(int length, int width){
       int perimeter =2*(length + width);
       return perimeter;
   }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    Rectangle r =new Rectangle();
	    System.out.println( "Enter length ");
	    int l=sc.nextInt();
	    System.out.println( "Enter Width");
	    int w=sc.nextInt();
	    System.out.println( "Area of rectangle "+r.Area(l,w));
	    System.out.println("Perimeter of rectangle  "+r.Perimeter(l,w));
		
	}
}
```
