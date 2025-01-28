## Swap of two numbers without extra variable
```java []
public class SwapTwoNumbers {
    public  static void main(String [] args){
        int a=10;
        int b=20;
        a=a+b;  // a=10+20,   a=30
        b=a-b;  // b=30-20,   b=10
        a=a-b;  // a=30-10,   a=10,
        System.out.print("Swapped numbers "+a +" "+ b);

    }
}
```
## Find maximum of 3 numbers
```java []
import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    long   a= sc.nextLong();     // 5
    long   b=sc.nextLong();     // 8
    long   c= sc.nextLong();    // 10
    if(a>b && a>c)  System.out.print("Maximum is "+a);  // not satisfied  
    else if( b>a && b>c) System.out.print("Maximum is "+b);  // true
    else System.out.print("Maximum is "+c);  // not satisfied
  }
}
```

## Multiply the given two numbers without using * operator.
```java []
public class Multiply {
    public static void main (String [] args){
        int a= 9;
        int b=2;
        int multi=0;
        for(int i=1;i<=a;i++){
            multi=multi+b;
        }
        System.out.print(" Multiple of " +a+ " and "+b+ " is " +multi);
    }
}

```
