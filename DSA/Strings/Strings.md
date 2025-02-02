## String concatenation
````java []
public class Main
{
	public static void main(String[] args) {
	    String s1="hello";
	      String s2="world";
	      String con=s1+s2;
		System.out.println(con);
	}
}
````
````java []
helloworld
````
## Finding Length
````java []

public class Main
{
	public static void main(String[] args) {
	    String s1="hello";
	      String s2="world";
	      String con=s1+s2;
	      int length=con.length();
		System.out.println(length);
	}
}
````
````java []
10

````
## CharAt
````java []

public class Main
{
	public static void main(String[] args) {
	    String s1="hello";
	      String s2="world";
	      String con=s1+s2;  // helloworld
	      int length=con.length(); // 10
	      char c=con.charAt(7); // at index 7 " r"
		System.out.println(c);
	}
}
````
````java []
r
````
## Comparing 2 String
````java []

public class Main
{
	public static void main(String[] args) {
	    String s1="hello";
	      String s2="HELLO";
	     
	      
		System.out.println(s2.equals(s1));
	}
}
````
````java []
false
````

## Ignore case and comparinf
````java []

public class Main
{
	public static void main(String[] args) {
	    String s1="hello";
	      String s2="HELLO";
	     
	      
		System.out.println(s2.equalsIgnoreCase(s1));
	}
}
````
````java []
true
````

## Upper to Lower and  lower to upper 
````java []

public class Main
{
	public static void main(String[] args) {
	    String s1="hello";
	      String s2="HELLO";
	     
	    System.out.println(s1.toUpperCase()); 
		System.out.println(s2.toLowerCase());
	}
}
````
````java []
HELLO
hello

````
## Index Of
````java []

public class Main
{
	public static void main(String[] args) {
	    String s1="hello";
	    System.out.println(s1.indexOf('l')); 
		
}
}
````
````java []
2
````
## Last Index for repeating letters
````java []

public class Main
{
	public static void main(String[] args) {
	    String s1="hello";
	    System.out.println(s1.lastIndexOf('l')); 
		
}
}
````
````java []
3
````
## Starts with Ends With
````java []

public class Main
{
	public static void main(String[] args) {
	    String s1="Hello Sharanya";
	    System.out.println("Start of Sentence = " +s1.startsWith("Hello Sharanya")); 
		
}
}
````
````java []
Start of Sentence = true

````
## Substring
````java []

public class Main
{
	public static void main(String[] args) {
	    String s1="Hello Sharanya";
	   
	     System.out.println("Substring = " +s1.substring(5)); 
		
}
}
````
````java []
Sharanya
````
## Trimming Sentence start and end of  "
````java []

public class Main
{
	public static void main(String[] args) {
	    String s1="  Hello Sharanya   ";
	   
	     System.out.println("Trim = " +s1.trim()); 
		
}
}
````
````java []
Trim = Hello Sharanya

````
## Replace character
````java []

public class Main
{
	public static void main(String[] args) {
	    String s1="Hello Sharanya";
	   
	     System.out.println(" Replace = " +s1.replace('l','L')); 
		
}
}
````
````java []
Trim = HeLLo Sharanya

````
## Replace All
````java []

public class Main
{
	public static void main(String[] args) {
	    String s1="Hello Sharanya";
	   
	     System.out.println(" Replace = " +s1.replaceAll("Hello","Welcome")); 
		
}
}
````
## Reversing String
````java []

public class Main
{
	public static void main(String[] args) {
	    String s1="Hello Sharanya";
	    String rev="";
	    for(int i=s1.length()-1;i>=0;i--){
	       
	            rev+=s1.charAt(i);
	        
	    }
	   
	     System.out.println("Reverse   ="  + rev); 
		
}
}
````
````java []
Reverse   =aynarahS olleH

````
## Number of  Occurance
````java []

public class Main
{
	public static void main(String[] args) {
	    String name="Sharanya";
	    char ch ='a';
	    int count=0;
	    for(int i=0;i<name.length();i++){
	       
	            if(name.charAt(i)==ch){
	                count+=0;
	                count++;
	            }
	    }
	   
	     System.out.println("Occurance  "  + count); 
		
}
}
````
````java []
Occurance  3

````
````java []
````
````java []
````
````java []
````
````java []
````
````java []
````
````java []
````
````java []
````
````java []
````
````java []
````
````java []
````
````java []
````
````java []
````
````java []
````
````java []
````
````java []
````
````java []
````

