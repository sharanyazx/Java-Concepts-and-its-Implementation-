
```java []
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			System.out.print("enter value");
		char ch=sc.next().charAt(0);
		//int b= sc.nextInt();
		//System.out.print("enter value");
	  
		
		if((ch >= 'a' && ch <='z') || (ch >= 'a' && ch<='z' ))
		{
		    if((ch =='a'|| ch=='e'|| ch =='i'|| ch=='o' || ch =='u')||( ch=='A'||ch =='E'|| ch=='I'||ch =='O'|| ch=='U'))
		    {
		        System.out.print("vowel and alph");
		    }
		    else {
		        System.out.print(" alph");
		    }
		}
		    else{ 
		        System.out.print("not alph");
		    }
		    
		}
}
```

```java []
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   int  year = 2000;
		if((year %400==0 )|| (year%4==0 && year%100!=0)) 
		{
		    System.out.print("leap");
		}
		else {
		    System.out.print(" not leap");
		
}
}
}
```

```java []
/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    float x =60f;
	    float y=4f;
	    float c= y*12;
	    float profit= x-c;
	    if(c>x){
	        System.out.printf("%.2f profit",profit);
	    }
	    else {
	        System.out.printf("%.2f loss",profit);
	    }
	    
	 }
}



```

```java []
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a = sc.nextInt();
	    int b =sc.nextInt();
	    int c=(100 -a)+b;
	    int d = b-a;
	   
	    if(a>b) {
	            System.out.print(c);
	    }
	    else{
	        System.out.print(d);
	    }
	 }
}
```

``` java []

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int d = 400;
	    int year= d/365;
	    int week = (d%365)/7;
	    int days=(d%365)%7;
	    System.out.println( year + "year");
	     System.out.println(  week + "week" );
	      System.out.println(  days + "days");
	 }
}



```
``` java []

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int d = 60;
	    int hr= d/3600;
	    int min = (d%3600)/60;
	    int sec=(d%3600)%60;
	    System.out.println( hr + "hr");
	     System.out.println(  min+ "min" );
	      System.out.println(  sec+ "sec");
	 }
}



``` 

```java []

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    long d = 8096;
	    long days=d /(24 * 3600);
	    long hr= d/3600;
	    long min = (d%3600)/60;
	    long sec=(d%3600)%60;
	    System.out.println( hr + "hr");
	     System.out.println(  min+ "min" );
	      System.out.println(  sec+ "sec");
	      System.out.println(  days+ "days");
	 }
}
```
