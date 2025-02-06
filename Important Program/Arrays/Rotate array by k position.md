## Rotate array by k position

``` java []
import java.util.*;
public class RotateElement {
    public static void main(String args[]) {
        int a[] = {1, 4, 6, 3, 8, 2, 90, 56};

        int k = 4;
        System.out.println("Key value is " + k);
        rotation(a,k);
        System.out.print("Rotation" + " ");
        System.out.println(Arrays.toString(a));
    }

    public static void rotation(int a[],int k){
        k=k%a.length;
        reversed(a,0,a.length-1);
        reversed(a,0,k-1);
        reversed(a,k,a.length-1);
    }
        public static void reversed(int a[],int start,int end) {
            while(start<end){
                int temp=a[start];
                a[start]=a[end];
                a[end]=temp;
                start++;
                end--;
        }
    }
}
```
## Output
``` java []
Key value is 4
Rotation [8, 2, 90, 56, 1, 4, 6, 3]

Process finished with exit code 0
```
