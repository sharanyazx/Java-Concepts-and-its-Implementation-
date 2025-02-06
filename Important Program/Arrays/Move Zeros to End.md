## Move Zeros to End
```java []
public class MoveZeros {
    public static void main(String[] args) {
        int []arr={1,0,7,4,0,2};
        int j =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0 && arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }
            else if (arr[j]!=0){
                j++;
            }

        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }

}

```
## Output
```java []
1 7 2 4 0 0 
Process finished with exit code 0
```
