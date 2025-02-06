## Kth largest and Smallest
```java []
import java.util.*;

public class Main {
    public static void main(String args[]) {
        int arr[] = {1, 2, 6, 4, 5, 3};

        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        int n = arr.length;
        int k = 2;

        if (k <= n) {
            System.out.println("Kth Largest element: " + arr[n - k]);
            System.out.println("Kth Smallest element: " + arr[k - 1]);
        } else {
            System.out.println("Invalid value of k");
        }
    }
}
```

### Output
```java []
Sorted Array: [1, 2, 3, 4, 5, 6]
Kth Largest element: 5
Kth Smallest element: 2

Process finished with exit code 0
```
