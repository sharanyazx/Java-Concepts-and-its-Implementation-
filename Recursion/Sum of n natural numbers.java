
public class Main
{ 
  public static int recurSum(int n) 
    { 
        if (n <= 1) return n; 
        return n + recurSum(n - 1); 
    } 
 
    public static void main(String args[]) 
    { 
        int n = 6; 
        System.out.println("Sum of n natural numbers "+recurSum(n));   // output 21
    } 
} 
