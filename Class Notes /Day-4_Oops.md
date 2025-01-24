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
# Creating Class with attributes and calling in main method
````java []
import java.util.*;
public class Main{
    String name;
    int age;
    public static void main (String []args){
       // Main a =new Main();
        String name = "Sharanyaa";
        int age=20;
       System.out.print(name + " " +age);
        
        
        
    }
}
````

# Creating Class with attributes and calling in main method without object
````java []
import java.util.*;
public class Main{
    
      public static void oddoreven(int num){
        if(num%2!=0){
            System.out.print("odd");
        }
        else{
            System.out.print("even");
        }
        
    }
    public static void main (String []args){
        //Main m=new Main();
      // m.oddoreven(21);
      oddoreven(21);
        
        
    }
}
````

# Simple Interest using void method
````java []
import java.util.*;
public class Main{
    int p;
    int n;
    int r;
    
  void simp(int p,int n ,int r){
       int SI = (p*n*r)/100;
       //return SI;
       System.out.print(SI);
    }
    public static void main (String []args){
        Main m=new Main();
        // m.simp(1,2,3);
       //oddoreven(21);
        m.simp(50,5,40);
        
        
    }
}
````

# Simple Interest using int method
````java []
import java.util.*;
public class Main{
    int p;
    int n;
    int r;
    
   int simp(int p,int n ,int r){
       int SI = (p*n*r)/100;
       return SI;
    }
    public static void main (String []args){
        Main m=new Main();
        // m.simp(1,2,3);
        //oddoreven(21);
       System.out.print( m.simp(50,5,40));
        
        
    }
}
````
