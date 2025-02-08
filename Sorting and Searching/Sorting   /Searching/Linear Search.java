import java.util.*;
public class Main
{
	public static void main(String[] args) {
	int []a={100,200,300,400,500};
	Scanner s= new Scanner(System.in);
		System.out.print("Elenter the Target ");
     	int target=s.nextInt();
    	//System.out.print("");
    	int flag=0;
    	for(int i=0;i<a.length;i++){
    	    if(a[i]==target){
    	        System.out.print("Element found at index "+ i);
    	        flag=1;
    	    }
    	    
    	}
    	  if(flag==0) System.out.println("Element not found ");
    	
    	
    	}
    	
	

	}
	
	
