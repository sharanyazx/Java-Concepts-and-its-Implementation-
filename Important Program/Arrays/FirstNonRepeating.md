```java []
public class FirstNonRepeating {
    public static void main(String args[]){
        int []a={4,2,67,91,6,1,4,2,67,7};
        for(int i=0;i<a.length;i++) {
            boolean unique = true;
            for (int j = 0; j < a.length ; j++) {
                if (i != j && a[i] == a[j ]) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                System.out.print("First non Repeating Element  " + a[i]);
                return;
            }
        }
              System.out.print(" No non repeating elements  found " );
            }
        }

```
## output
```
First non Repeating Element  91
Process finished with exit code 0
```
