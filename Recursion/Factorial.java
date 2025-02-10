
public class Main
{
	public static void main(String[] args) {
	    int num=5;
		System.out.println("factorial "+factorial(num));
	}
	public static int factorial(int num){
	    if(num==0 || num<0) return 1;
	    return num*factorial(num-1);  //output = 120
	}
}
