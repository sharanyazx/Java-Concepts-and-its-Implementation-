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
