# Arrays
## Reverse an Array
````java []

public class Main {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int n = a.length;
        System.out.print("Original ");
        // Print the array in normal order
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        
        System.out.println(); // For a line break between normal and reversed prints
        
        // Print the array in reverse order
        System.out.print("Reversed ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}

````
```` java []
Original 1 2 3 4 5 
Reversed 5 4 3 2 1 
````
## Maximum Minimum in an array
````java []
public class Main
{
	public static void main(String[] args) {
	int a[]={1,2,3,4,5};
	int max=a[0];
	int min=a[0];
	int n=a.length;
	for(int i=0;i<n;i++){
	    if(a[i]>max){
	        max=a[i];
	        
	    }
	    
	     if(a[i]<min){
	         min=a[i];
	        
	    }
	}
	
	System.out.println(max);
	        
	        System.out.print(min);
	}
}
````
## Searching in an array
````java []

public class Main
{
	public static void main(String[] args) {
	int a[]={1,2,3,4,5};
	int target=4;
	int n=a.length;
	for(int i=0;i<n;i++){
	    if(a[i]==target){
	        	System.out.println("Element Found "+i);
	        
	    }
	     
}
 
}
}
````
## Output
```` java []
Element Found 3

````
````java []
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size ");
        // Read the size of the array
        int n = sc.nextInt();
        int[] a = new int[n]; // Create an array of size n
        
        // Read the array elements
        System.out.print("Enter elements  ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        // Read the target value
        System.out.print("Enter Target ");
        int target = sc.nextInt();
        
        // Variable to track if target is found
        boolean found = false;

        // Search for the target in the array
        for (int i = 0; i < n; i++) {
            if (a[i] == target) {
                found = true;
                break; // Exit the loop when the target is found
            }
        }

        // Output the result after the loop
        System.out.println(found);
        
         // Always good practice to close the scanner
    }
}
````

````java []
Enter size 4
Enter elements  1
2
3
4
Enter Target 8
false

````

## Ascending Order
### using built in  function
````java []
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int a[] = {5,65,3,28,3,1};
        int n = a.length;
        System.out.print("Original ");
        // Print the array in normal order
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        
        System.out.println(); // For a line break between normal and reversed prints
        
         Arrays.sort(a);
         System.out.print("Ascending" );
         for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        }
    }

````
````java []
Original 5 65 3 28 3 1 
Ascending1 3 3 5 28 65 
````

### Manual Sorting
````java []
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int a[] = {5,65,3,28,3,1};
        int n = a.length;
        System.out.print("Original ");
        // Print the array in normal order
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        
        System.out.println(); // For a line break between normal and reversed prints
        
         int temp;
         System.out.print("Ascending " );
         for (int i = 0; i < n; i++) {
             for(int j=0;j<n;j++){
                 // Sorting 
                 if(a[i]<a[j]){  // comparing 65 and 5
                     temp=a[i];  // temp store 65
                     a[i]=a[j];  // a[i] store 5
                     a[j]=temp; // a[j] store temp value
                     
                    
                     
                 }
             }
           
        }
       for (int i = 0; i < n; i++){
           System.out.print(a[i] + " " );
       }
        }
    }




````
````java []
Original 5 65 3 28 3 1 
Ascending1 3 3 5 28 65 
````
## Remove Duplicates
````java []
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int a[] = {5,65,3,2,3,2};
        int n = a.length;
        System.out.print("Original ");
        // Print the array in normal order
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        
        System.out.println(); // For a line break between normal and reversed prints
        
        
         System.out.print("Duplicate " );
         for (int i = 0; i < n; i++) {
             for(int j=i+1;j<n;j++){
                 if(a[i]==a[j]){
                      System.out.print(" "+a[i]);
                     
                 }
                 
             }
             
             
        }
    }
}


````
````java []
Original 5 65 3 2 3 2 
Duplicate  3 2
````
## Second Largest Element
````java []
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int a[] = {5,65,3,28,3,1};
        int n = a.length;
        System.out.print("Original ");
        // Print the array in normal order
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        
        System.out.println(); // For a line break between normal and reversed prints
        
         Arrays.sort(a);
         System.out.println("Ascending " );
         for (int i = 0; i < n; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println("Second Largest " + a[n-2]);
        }
    }
````
````java []
Original 5 65 3 28 3 1 
Ascending 
1 
3 
3 
5 
28 
65 
Second Largest 65

````
### Manual
````java []
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int a[] = {5,65,3,28,3,1};
        int n = a.length;
        System.out.print("Original ");
        // Print the array in normal order
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        
        System.out.println(); // For a line break between normal and reversed prints
        
         int temp;
         System.out.print("Ascending " );
         for (int i = 0; i < n; i++) {
             for(int j=0;j<n;j++){
                 // Sorting 
                 if(a[i]<a[j]){  // comparing 65 and 5
                     temp=a[i];  // temp store 65
                     a[i]=a[j];  // a[i] store 5
                     a[j]=temp; // a[j] store temp value
                     
                    
                     
                 }
             }
           
        }
       for (int i = 0; i < n; i++){
           System.out.println(" "+a[i]);
       }
       System.out.println("Second Largest Element " + a[n-1]);
        }
    }


````
````java []
Original 5 65 3 28 3 1 
Ascending  1
 3
 3
 5
 28
 65
Second Largest Element 65

````
````java []
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int b[]={6,7,8,9,10};
        int aa = a.length;
        int bb=b.length;
        System.out.print("Original ");
        // Print the array in normal order
        System.out.print("First array ");
        for (int i = 0; i < aa; i++) {
            System.out.println(a[i] );
        }
        System.out.print("Second array " );
        for (int j = 0; j < bb; j++) {
            System.out.print( b[j] );
        }
        
        int cc=aa+bb;
        int c[]=new int[cc];
        for(int i=0;i<aa;i++){
            c[i]=a[i];
        }
        for(int j=0;j<bb;j++){
            c[aa + j]=b[j];
        }
        System.out.println("Merged array " );
        for(int i=0;i<cc;i++){
            
                
                System.out.print(c[i]+" ");
                
            
        }
        
    }
}
        
        
````
## Merge two Array
````java []
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int b[]={6,7,8,9,10};
        int aa = a.length;
        int bb=b.length;
      
        // Print the array in normal order
        System.out.println();
        System.out.print("First array ");
        for (int i = 0; i < aa; i++) {
            System.out.print(a[i] +" ");
        }
        System.out.println();
        System.out.print("Second array " );
        for (int j = 0; j < bb; j++) {
            System.out.print( b[j] +" ");
        }
        
        int cc=aa+bb;
        int c[]=new int[cc];
        for(int i=0;i<aa;i++){
            c[i]=a[i];
        }
        for(int j=0;j<bb;j++){
            c[aa + j]=b[j];
        }
        System.out.println();
        System.out.print("Merged array " );
        for(int i=0;i<cc;i++){
            
                
                System.out.print(c[i]+" ");
                
            
        }
        
    }
}
        
        
````
````java []

First array 1 2 3 4 5 
Second array 6 7 8 9 10 
Merged array 1 2 3 4 5 6 7 8 9 10 
````
````java []
````
````java []
````
````java []
````
````java []
````
````java []
````
````java []
````
````java []
````
````java []
````
````java []
````
````java []
````
````java []
````
````java []
````
````java []
````
````java []
````
````java []
````
````java []
````
````java []
````
````java []
````
````java []
````
````java []
````
````java []
````
````java []
````
````java []
````
````java []
````
