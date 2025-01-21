## EVEN NUMBER
```JAVA [] import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int a= sc.nextInt();
	    for(int i=1;i<a;i++){
	        if(i%2==0){
		  System.out.println(i);
	}
}
}
}
```
## ODD AND EVEN 
```JAVA []
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int a= sc.nextInt();
	    for(int i=1;i<a;i++){
	        if(i%2==0){
		  System.out.print(i);
	        }
	 
	     }
	     System.out.println();
	     for(int i=1;i<a;i++){
	         if(i%2!=0){
	         
	         System.out.print(i);
	 }
}
}
}
```

## Factorial
```java []
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n= sc.nextInt();
	    int fact =1;
	    for(int i=1;i<=n;i++){
	        fact = fact * i;
	    }
	    System.out.println(fact);
	}
}
```
## Print table
```java []
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n= sc.nextInt();
	    
	    
	    for(int i=1;i<=10;i++){
	        System.out.println(n + "x" + i + "="+ i*n);
	        
	    }
	    
	}
}
```

##  Fibonacci Series
```java []
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    //int n= sc.nextInt();
	    int n1=0,n2=1,n3,i,count=10;
	    System.out.print(n1+" "+n2); 
	   for(i=2;i<count;++i)
 {    
        n3=n1+n2;    
        System.out.print(" "+n3);    
        n1=n2;    
        n2=n3;    
        }    
	    
	        
	    }
	    
	}


```
## Reverse a number
```java []
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	   
	    int n=123;
	    StringBuffer s = new StringBuffer(String.valueOf(n));
        s.reverse();
	   
	    n = Integer.parseInt(String.valueOf(s));
	    System.out.print(n);
	    }
	    
	}


```
## Sum of Even
```java []
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int a= sc.nextInt();
	    int sum=0;
	    for(int i=2;i<=a;i+=2){
	       // if(i%2==0){
	           // int resu = sum(i);
		       sum +=i;
		     
	        }
	System.out.print(sum);
}
}

```
## Palindrome
```java []
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int rem,sum =0,temp;
	    int n=sc.nextInt();
	    temp =n;
		   
       while(n>0){    
           rem=n%10; 
           sum=(sum*10)+rem;    
           n=n/10;    
           
       }    
       if(temp==sum)    System.out.println("palindrome number ");    
        else    System.out.println("not palindrome");    
}  
}  

   
```
## Count
```java []
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int count=0;
	    int n=sc.nextInt();
	    
	    while(n!=0) {
	        n=n/10;
	        ++count;
	        
    }
    System.out.print(count);
}  
}

   

   
```

## Strong Number

```java []

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int n=sc.nextInt();
	    int rem;
	    int count=0;
	    int temp=n;
	    while(n>0){
	        rem=n%10;
	        int fact=1;
	        for(int i =0;i<=rem;i++){
	            fact=fact *i;
	        }
	        count+=fact;
	        n=n/10;
	    }
	    if(count==temp)   System.out.print("Strong");
	    else System.out.print("Strong");
}  
}

   
   
```
## Strong Number
```java []

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int n=sc.nextInt();
	    int rem;
	    int count=0;
	    int temp=n;
	    while(n>0){
	        rem=n%10;
	        int fact=1;
	        for(int i =0;i<=rem;i++){
	            fact=fact *i;
	        }
	        count+=fact;
	        n=n/10;
	    }
	    if(count==temp)   System.out.print("Strong");
	    else System.out.print("Strong");
}  
}

   
   
   
```
## Automorphic
```java []
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int n=sc.nextInt();
	    int sq= n*n;
	    while(n>0){
	        if(n%10!=sq%10){
	            System.out.print(" not automorphic");
	            break;
	        }
	        n=n/10;
	        sq=sq/10;
	    }
	    if(n==0)   System.out.print("automorphic");
	   
}  
}
```
## Armstrong number
```java []
import java.util.Scanner;  
import java.lang.Math;  
public class ArmstsrongNumberExample2  
{  
//function to check if the number is Armstrong or not  
static boolean isArmstrong(int n)   
{   
int temp, digits=0, last=0, sum=0;   
//assigning n into a temp variable  
temp=n;   
//loop execute until the condition becomes false  
while(temp>0)    
{   
temp = temp/10;   
digits++;   
}   
temp = n;   
while(temp>0)   
{   
//determines the last digit from the number      
last = temp % 10;   
//calculates the power of a number up to digit times and add the resultant to the sum variable  
sum +=  (Math.pow(last, digits));   
//removes the last digit   
temp = temp/10;   
}  
//compares the sum with n  
if(n==sum)   
//returns if sum and n are equal  
return true;      
//returns false if sum and n are not equal  
else return false;   
}   
//driver code  
public static void  main(String args[])     
{     
int num;   
Scanner sc= new Scanner(System.in);  
System.out.print("Enter the number: ");  
//reads the limit from the user  
num=sc.nextInt();  
if(isArmstrong(num))  
{  
System.out.print("Armstrong ");  
}  
else   
{  
System.out.print("Not Armstrong ");  
}  
}   
}  
```

##  Adam Number
```java []
import java.util.Scanner;  
import java.lang.Math;  
public class Main 
{  
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    int rem,sum=0;
    int sq=n*n;
    System.out.println("Square  " + sq  );
    while(sq > 0)
    {
        rem=sq%10; 
        sum=(sum*10)+rem;    
        sq=sq/10;  
    }
        System.out.println("Reveresd  "+sum);
        int sqrt= (int) Math.sqrt(sum);
        System.out.println("root  "+sqrt);
        int s1=0;
        while(sqrt >0){
             rem=sqrt%10; 
             s1=(s1*10)+rem;    
             sqrt=sqrt/10;  
        }
         System.out.println("rev  " + s1);
        if(s1==n)   System.out.println("Adam");
	    else System.out.println("not");
        
        
    
}   
}
```
## Harshad Number
```java[]

```
