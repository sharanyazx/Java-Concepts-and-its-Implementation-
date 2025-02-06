## Removing Duplicates 
```java []
import java.util.*;
public class RemoveDuplicates {
    public static void main(String args[]){
        int a[]={1,2,3,2,4,2,6};
        System.out.print("Before Removing Duplicates ");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
            Arrays.sort(a);
        System.out.print("After Removing Duplicates");
        for (int i=0;i<a.length;i++){
           if(i==0 || a[i]!=a[i-1]){
               System.out.print(a[i]+" ");
           }
           //System.out.println();
        }
        System.out.println();
        System.out.print(" Duplicates Values ");
        for (int i=0;i<a.length-1;i++){
        if(a[i]==a[i+1]) {
            System.out.print(a[i]+" ");
        }
        }
    }

}
```
``` java[]
Before Removing Duplicates 1 2 3 2 4 2 6 
After Removing Duplicates1 2 3 4 6 
 Duplicates Values 2 2 
Process finished with exit code 0
```
