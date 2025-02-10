
public class Main
{ 
  public static int fib(int n) 
    { 
        if (n <= 1) return n; 
        return fib(n-1) + fib(n - 2); 
    } 
 
    public static void main(String args[]) 
    { 
        int n = 6; 
        System.out.println("Fibannaci of "+ n);
        for(int i=0;i<n;i++)  System.out.print(" "+fib(i));  // output 0 1 1 2 3 5
    } 
} 
