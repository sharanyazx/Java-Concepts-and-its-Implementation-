# Function to add,sub,multiply,Divide

````java []
import java.util.*;
public class Main
{
    
	public static void main(String[] args) {
	    // function call
	     Display();  
		
			}
      // get input from user and calling the other function
			static void User( ){      
			    Scanner sc = new Scanner (System.in);
			    System.out.print("Enter number =");
			    int a= sc.nextInt();
			    System.out.print("Enter number =");
			    int b= sc.nextInt();
           // function call
			    Add(a, b);
          Sub(a, b);
          Multi( a,b);
			    Div( a, b);
			    
			}
       // Function to add
			static void Add(int a,int b){  
			    System.out.print("Sum of number =");
			    int sum= a+b;
			     System.out.println(sum);
			}
       // Function to sub
			static void Sub(int a,int b){  
			    System.out.print("Subraction of number =");
			    int sub= a-b;
			    System.out.println(sub);
			    
			}
       // Function to multiply
			static void Multi(int a,int b){  
			    System.out.print("Multiply of number =");
			    int multi= a*b;
			    System.out.println(multi);
			}
       // Function to division
			static void Div(int a,int b){   
			    System.out.print("Divison of number =");
			    int div= a/b;
			    System.out.println(div);
			}
			// Function to display all the operation from user function
			static void Display(){
           // Display()  will be called at main function 
			    User();               
			    
			}
			
			
}
````
