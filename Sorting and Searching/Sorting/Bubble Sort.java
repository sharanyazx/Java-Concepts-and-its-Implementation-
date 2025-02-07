import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    int a[]={3,4,1,2,3};
    // function calling
	    BubbleSort(a);

	}
  // function to sort
	public static void BubbleSort(int []a){
	    for(int i=0;i<a.length;i++){
	        for(int j=0;j<a.length-1-i;j++){
	            if(a[j]>a[j+1]){
	            int temp=a[j];
	            a[j]=a[j+1];
	            a[j+1]=temp;
	        }
	    }
	}
	System.out.print(Arrays.toString(a));

}
}
