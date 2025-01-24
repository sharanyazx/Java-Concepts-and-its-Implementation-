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
### Output
````java []
Enter number =15
Enter number =5
Sum of number =20
Subraction of number =10
Multiply of number =75
Divison of number =3
````
# Area of Triangle
````java []
import java.util.Scanner;

class Triangle {
    private int b, h;

    // Method to set the base and height
    public void setBaseAndHeight(int base, int height) {
        b = base;
        h = height;
    }

    // Method to calculate the area of the triangle
    public int Area() {
        int a = b * h;
        int c = a / 2;
        return c;  // Return the calculated area
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get input for base and height
        System.out.print("Enter base: ");
        int x = sc.nextInt();
        System.out.print("Enter height: ");
        int y = sc.nextInt();
        
        // Create a Triangle object
        Triangle tr = new Triangle();
        
        // Set base and height using the setter method
        tr.setBaseAndHeight(x, y);
        
        // Call the Area method and print the result
        int result = tr.Area();
        System.out.println("The area of the triangle is: " + result);
    }
}

````
````java []
Enter base: 32
Enter height: 32
The area of the triangle is: 512
````
