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
## Harshad Number (0r Nivin)



1. **Input Number**: 
   - We initialize `num` with the number to check.
   - `originalNum` stores the original value of the number since `num` will be modified in the loop.

2. **Sum of Digits Calculation**:
   - Use a `while` loop to calculate the sum of the digits.
   - **Steps**:
     - Extract the last digit using `num % 10` and add it to `sum`.
     - Remove the last digit using `num / 10`.

3. **Harshad Condition**:
   - After calculating the sum of the digits, check if the original number is divisible by the sum of its digits:
     - \( \text{originalNum} \mod \text{sum} == 0 \).

4. **Output**:
   - If divisible, print that it is a Harshad Number.
   - Otherwise, print that it is not.

---





``` java []
public class Main{
    public static void main(String[] args) {
        int num = 111;
        int rem=0;
        int sum=0;
        int temp= num;
        while(num!=0){
            rem=num%10;
            sum+=rem;
            num/=10;

        }
        if(temp%sum==0)  System.out.println("HARSHAD NUMBER");
        else System.out.println(" NOT HARSHAD NUMBER");
    }
}
```
### **Example Walkthrough**


1. **Initial Values**: 
   - `num = 156`, `originalNum = 156`, `sum = 0`.

2. **Calculate Sum of Digits**:
   - **Iteration 1**:
     - `rem = num % 10 = 156 % 10 = 6`.
     - `sum = sum + rem = 0 + 6 = 6`.
     - `num = num / 10 = 156 / 10 = 15`.
   - **Iteration 2**:
     - `rem = num % 10 = 15 % 10 = 5`.
     - `sum = sum + rem = 6 + 5 = 11`.
     - `num = num / 10 = 15 / 10 = 1`.
   - **Iteration 3**:
     - `rem = num % 10 = 1 % 10 = 1`.
     - `sum = sum + rem = 11 + 1 = 12`.
     - `num = num / 10 = 1 / 10 = 0`.

3. **Check Harshad Condition**:
   - \( \text{originalNum} \mod \text{sum} = 156 \mod 12 = 0 \).

4. **Output**:
   - Since the result is \( 0 \), `156` is a Harshad Number.

---

### **Visual Summary**

| Iteration | `num` | `rem = num % 10` | `sum = sum + rem` | `num = num / 10` |
|-----------|-------|------------------|-------------------|------------------|
| 1         | 156   | 6                | 6                 | 15               |
| 2         | 15    | 5                | 11                | 1                |
| 3         | 1     | 1                | 12                | 0                |

### **Final Check**
- \( \text{originalNum} \mod \text{sum} = 156 \mod 12 = 0 \).
- **Result**: `156` is a Harshad Number.





## ABUNDANT NUMBER
### **Abundant Number in Java**

An **Abundant Number** is a number for which the sum of its proper divisors (excluding the number itself) is greater than the number. 

For example:
- \( 12 \) is an abundant number because the sum of its proper divisors \( (1 + 2 + 3 + 4 + 6) = 16 > 12 \).

---

```java []
public class Main{
    public static void main(String[] args) {
        int num = 12;
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if (num%i==0){
                sum+=i;
            }
        }

        
        if(sum>num)  System.out.println("ABUNDANT NUMBER");
        else System.out.println(" NOT ABUNDANT NUMBER");
    }
}
```
---

### **Step-by-Step Explanation**

#### **1. Input Number**
- We choose \( \text{num} = 12 \) to check if it's an abundant number.
- **Reasoning**: The number we are analyzing is **12**. We'll determine if the sum of its proper divisors exceeds 12.

---

#### **2. Find Proper Divisors**
- **Logic**: A proper divisor of a number \( n \) is any number smaller than \( n \) that divides \( n \) without leaving a remainder.
- **Code Logic**:
  ```java
  for (int i = 1; i <= num / 2; i++) {
      if (num % i == 0) { // Check if i is a divisor
          sum += i;
      }
  }
  ```
- **Execution for \( \text{num} = 12 \)**:
  - Loop from \( 1 \) to \( 12/2 = 6 \) (as no divisor can exceed half the number).
  - For each \( i \), check if \( 12 \mod i = 0 \):
    - \( 12 \mod 1 = 0 \) → \( 1 \) is a divisor.
    - \( 12 \mod 2 = 0 \) → \( 2 \) is a divisor.
    - \( 12 \mod 3 = 0 \) → \( 3 \) is a divisor.
    - \( 12 \mod 4 = 0 \) → \( 4 \) is a divisor.
    - \( 12 \mod 5 \neq 0 \) → Skip \( 5 \).
    - \( 12 \mod 6 = 0 \) → \( 6 \) is a divisor.
- **Proper Divisors of 12**: \( 1, 2, 3, 4, 6 \).

---

#### **3. Sum of Divisors**
- **Logic**: Add all the proper divisors found in the previous step to get their sum.
- **Code Logic**:
  ```java
  sum += i;
  ```
- **Execution for \( \text{num} = 12 \)**:
  - Add the divisors: \( 1 + 2 + 3 + 4 + 6 = 16 \).
- **Sum of Proper Divisors**: \( 16 \).

---

#### **4. Check Abundant Condition**
- **Logic**: Compare the sum of proper divisors with the input number:
  - If \( \text{sum} > \text{num} \), the number is **abundant**.
  - Otherwise, it is **not abundant**.
- **Code Logic**:
  ```java
  if (sum > num) {
      System.out.println(num + " is an Abundant Number.");
  } else {
      System.out.println(num + " is NOT an Abundant Number.");
  }
  ```
- **Execution for \( \text{num} = 12 \)**:
  - Compare \( \text{sum} = 16 \) with \( \text{num} = 12 \).
  - Since \( 16 > 12 \), \( 12 \) is an **abundant number**.

---

#### **5. Output**
- **Result**:
  - Print the conclusion based on the comparison:
    - For \( \text{num} = 12 \):
      ```
      12 is an Abundant Number.
      ```

---

### **Example Walkthrough**

#### Check if \( 15 \) is an Abundant Number:

1. **Input**: \( \text{num} = 15 \).
2. **Find Proper Divisors**:
   - Divisors of \( 15 \): \( 1, 3, 5 \).
3. **Sum of Divisors**:
   - \( 1 + 3 + 5 = 9 \).
4. **Check Condition**:
   - \( \text{sum} = 9 \), \( \text{num} = 15 \).
   - \( 9 \not> 15 \), so \( 15 \) is **not an abundant number**.
5. **Output**:
   ```
   15 is NOT an Abundant Number.
   ```

---

### **Visual Summary**

| **Number** | **Proper Divisors** | **Sum of Divisors** | **Abundant Condition** | **Result**             |
|------------|----------------------|---------------------|-------------------------|------------------------|
| 12         | 1, 2, 3, 4, 6        | 16                  | \( 16 > 12 \)          | Abundant Number        |
| 15         | 1, 3, 5              | 9                   | \( 9 \not> 15 \)       | NOT an Abundant Number |









## Print number 1 to 10 but without 5

```java []
public class Main{
    public static void main(String[] args) {
      
        for(int i=1;i<=10;i++){
            if (i!=5){
                System.out.println(i);
            }
        }

    }
}
```


## Pattern Program
```java []
    public class Main{    
        public static void main(String args[])   {    
            int i, j, row = 6;       
            for (i=0; i<row; i++)   {  
                for (j=row-i; j>1; j--)   {  
                    System.out.print(" ");   
                    }   
            for (j=0; j<=i; j++ )   {   
                System.out.print("* ");   
                
            }   
            System.out.println();   
            }   
            
        }   

        
    }
```

```java []    public class Main{    
        public static void main(String args[])   {    
            int i, j, row = 15;       
            for (i=0; i<row; i+=1)   {  
                for (j=row+i; j>1; j--)   {  
                    System.out.print(" ");   
                    }   
            for (j=0; j<=15; j++ )   {   
                System.out.print("* ");   
                
            }   
            System.out.println();   
            }   
            
        }   

        
    }  ```
