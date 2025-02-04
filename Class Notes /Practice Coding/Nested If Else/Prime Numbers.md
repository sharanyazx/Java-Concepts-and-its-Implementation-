````java []
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create Scanner object to take user input
       // Ask user to input a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Check if the number is prime
        if (num <= 1) {
            System.out.println(num + " is not a prime number.");
        } else {
            boolean isPrime = true;

            // Loop from 2 to num-1
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;  // If divisible, it's not prime
                    break;  // Exit the loop early
                } else {
                    //continue ;  // If it is not divisible, continue checking
                }
            }

            // Print the result
            if (isPrime) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }

       
    }
}

````
