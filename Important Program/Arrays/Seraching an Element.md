``` java []
public class PresentorNot {

    public static boolean contains(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(contains(arr, 3));  // true
        System.out.println(contains(arr, 6));  // false
    }
}
```
# Output
```
true
false
```
