import java.util.*;
public class Main
{
	public static void main(String[] args) {
	int []a={100,200,300,400,500};
	Scanner s= new Scanner(System.in);
		System.out.print("Elenter the Target ");
     	int target=s.nextInt();
    	System.out.print("");
    	
    	int flag=0;
    	int start=0;
    	int end=a.length-1;
    	while(start<=end){
    	   int mid=(start+end)/2;
    	   if(a[mid]==target){
    	       System.out.print("Element found at index " + mid);
    	       flag=1;
    	       break;
    	   }
    	   else if(a[mid]>target){
    	       end=mid-1;
    	   }
    	   else {
    	       start=mid+1;
    	   }
    	}
    	   if(flag==0){
    	       System.out.println("Element not found ");
    	   }
    	}
    	
	

	}
	
	
