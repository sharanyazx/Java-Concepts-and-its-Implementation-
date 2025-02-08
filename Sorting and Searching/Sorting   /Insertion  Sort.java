import java.util.*;
public class Main
{
	public static void main(String[] args) {
	int []a={2,-6,7,1,9,5,3};   // [-6, 1, 2, 3, 5, 7, 9]

	
	Insertion(a);
	System.out.println(Arrays.toString(a));
	}
	static void Insertion(int[] a){
	    for(int i=0;i<a.length-1;i++){
	        for(int j=i+1;j>0;j--){
	            if(a[j]<a[j-1]){
	                swap(a,j,j-1);
	            }
	            else break;
	        }
	    }
	    
	}
	static void swap(int a[],int start,int end){
	    int temp=a[start];
	    a[start]=a[end];
	    a[end]=temp;
	}
}
