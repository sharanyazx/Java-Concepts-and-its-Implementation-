
## 1. Square
```java []


public class Main
{
	public static void main(String[] args) {
		int n=5;
		for(int i= 0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("*");
			}
                System.out.println();
		}
	}
}
```

## 2. rectangle
```java []


public class Main
{
	public static void main(String[] args) {
		int n=5;
		int m=8;
		for(int i= 0; i<n; i++) {
			for(int j=0; j<8; j++) {
				System.out.print("* ");
			}
                System.out.println();
		}
	}
}
```

## 3. Right angle Triangle
``` java[]


public class Main
{
	public static void main(String[] args) {
		int n=10;
		//int m=8;
		for(int i= 0; i<n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("* ");
			}
                System.out.println();
		}
	}
}
```

## 4.Inverted right triangle


```java []
public class Main
{
	public static void main(String[] args) {
		int n=10;
		for(int i= 0; i<=n; i++) {
			for(int j=i-1; j<=10; j++) {
				System.out.print("*");
			}
                System.out.println();
		}
	}
}
```



## 5. Hollow Square
```java []


public class Main
{
	public static void main(String[] args) {
		int n=5;
		for(int i= 1 ;i<=n; i++) {
			for(int j=1; j<=n; j++) {
			    if(i==1|| i==n||j==1||j==n){
				System.out.print("* ");
			}  else{
			    System.out.print("  ");
			}
                
		}
		System.out.println();
	}
}
}



```


## 6.Mirror Right angle triangle
```java []


public class Main
{
	public static void main(String[] args) {
		int n=5;
		for(int i= 1 ;i<=n; i++) {
		    for(int space=1;space<=n-i;space++){
		        System.out.print("  ");  // double space mirror triangle
		    }
			for(int j=1; j<=i; j++) {
			    System.out.print("* ");
			  }
		System.out.println();
	}
}
}



```

## 7. triangle
```java []

public class Main
{
	public static void main(String[] args) {
		int n=10;
		for(int i= 1;i<=n; i++) {
		    for(int space=1;space<=n-i;space++){
		        System.out.print("  "); // single space triangle
		    }
			for(int j=1; j<=(2*i)-1; j++) {
			    System.out.print("* ");
			  }
		System.out.println();
	
}
}
}	

	


```
## 8. Inverted Mirror Right angle triangle
```java []



public class Main
{
	public static void main(String[] args) {
		int n=5;
		for(int i= n;i>=1; i--) {
		    for(int space=1;space<=n-i;space++){
		        System.out.print("  ");
		    }
			for(int j=1; j<=i; j++) {
			    System.out.print("* ");
			  }
		System.out.println();
	}
}
}


```
## 9. left arrow
```java []




public class Main
{
	public static void main(String[] args) {
		int n=5;
		for(int i= 1;i<=n; i++) {
		    for(int space=1;space<=n-i;space++){
		        System.out.print("  ");
		    }
			for(int j=1; j<=i; j++) {
			    System.out.print("* ");
			  }
		System.out.println();
	}
	for(int i= n-1;i>=1; i--) {
		    for(int space=1;space<=n-i;space++){
		        System.out.print("  ");
		    }
			for(int j=1; j<=i; j++) {
			    System.out.print("* ");
			  }
		System.out.println();
}
}
}





```
## 10.right arrow
```java []


public class Main
{
	public static void main(String[] args) {
		int n=10;
		//int m=8;
		for(int i= 0; i<n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("* ");
			}
                System.out.println();
		}
		for(int i= n; i>=1; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("* ");
			}
                System.out.println();
		}
	}
}



```

## 11.inverted right trianglr
```java []


public class Main
{
	public static void main(String[] args) {
		int n=10;
		//int m=8;
		for(int i= 0; i<n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("* ");
			}
                System.out.println();
		}
		for(int i= n; i>=1; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("* ");
			}
                System.out.println();
		}
	}
}


```
## 12.inverted  triangle
```java []


public class Main
{
	public static void main(String[] args) {
		int n=10;
		for(int i= n ;i>=1; i--) {
		    for(int space=1;space<=n-i;space++){
		        System.out.print("  "); // single space triangle
		    }
			for(int j=1; j<=(2*i)-1; j++) {
			    System.out.print("* ");
			  }
		System.out.println();
	
}
}
}	


```

## 13. Diamond shape
```java []
public class Main
{
	public static void main(String[] args) {
		int n=10;
		for(int i= 1;i<=n; i++) {
		    for(int space=1;space<=n-i;space++){
		        System.out.print("  "); // single space triangle
		    }
			for(int j=1; j<=(2*i)-1; j++) {
			    System.out.print("* ");
			  }
		System.out.println();
	
}
        for(int i= n-1 ;i>=1; i--) {
		    for(int space=1;space<=n-i;space++){
		        System.out.print("  "); // single space triangle
		    }
			for(int j=1; j<=(2*i)-1; j++) {
			    System.out.print("* ");
			  }
		System.out.println();
	
}
}
}	



```

## 14. Hollow triangle
```java []
public class Main
{
	public static void main(String[] args) {
		int n=10;
		for(int i= 1;i<=n; i++) {
		    for(int space=1;space<=n-i;space++){
		        System.out.print("  "); // single space triangle
		    }
			for(int j=1; j<=(2*i)-1; j++) {
			    if(i==1|| i==n||j==1||j==(2*i)-1){
				System.out.print("* ");
			}  else{
			    System.out.print("  ");
			}
}
        System.out.println();
}
}	
}



```
## 15. Inverted hollow triangle
```java []
public class Main
{
	public static void main(String[] args) {
		int n=10;
		for(int i= n;i>=1; i--) {
		    for(int space=1;space<=n-i;space++){
		        System.out.print("  "); // single space triangle
		    }
			for(int j=1; j<=(2*i)-1; j++) {
			    if(i==1|| i==n||j==1||j==(2*i)-1){
				System.out.print("* ");
			}  else{
			    System.out.print("  ");
			}
}
        System.out.println();
}
}	
}

	

```
## 16. Hollow diamond

```java []
public class Main
{
	public static void main(String[] args) {
		int n=10;
		for(int i= 1;i<=n-1; i++) {   // n-1
		    for(int space=1;space<=n-i;space++){
		        System.out.print("  "); // single space triangle
		    }
			for(int j=1; j<=(2*i)-1; j++) {
			    if(i==1|| i==n||j==1||j==(2*i)-1){
				System.out.print("* ");
			}  else{
			    System.out.print("  ");
			}
}
        System.out.println();
}
		for(int i= n-2;i>=1; i--) {      // n-2
		    for(int space=1;space<=n-i;space++){
		        System.out.print("  "); // single space triangle
		    }
			for(int j=1; j<=(2*i)-1; j++) {
			    if(i==1|| i==n||j==1||j==(2*i)-1){
				System.out.print("* ");
			}  else{
			    System.out.print("  ");
			}
}
        System.out.println();
}
	
}	
}

 // alternative
public class Main
{
	public static void main(String[] args) {
		int n=10;
		for(int i= 1;i<=n; i++) {
		    for(int space=1;space<=n-i;space++){
		        System.out.print("  "); // single space triangle
		    }
			for(int j=1; j<=(2*i)-1; j++) {
			    if(j==1||j==(2*i)-1){  //remove i
				System.out.print("* ");
			}  else{
			    System.out.print("  ");
			}
}
        System.out.println();
}
		for(int i= n-1;i>=1; i--) {
		    for(int space=1;space<=n-i;space++){
		        System.out.print("  "); // single space triangle
		    }
			for(int j=1; j<=(2*i)-1; j++) {
			    if(j==1||j==(2*i)-1){  // remove i
				System.out.print("* ");
			}  else{
			    System.out.print("  ");
			}
}
        System.out.println();
}
	
}	
}
```
## 17. Floyed triangle
```java []
public class Main
{
	public static void main(String[] args) {
		int n=5;
	    int k=1;
		for(int i= 1; i<=n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(k +" ");
				k++;
			}
			 
                System.out.println();
		}
	}
}


	

```
