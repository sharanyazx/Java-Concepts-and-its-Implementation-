


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      // Input frpm user
        Scanner sc = new Scanner(System.in);
        
        // Take user input for category choice
        System.out.println("Enter 'c' for Coffee, 't' for Tea, 's' for Soups, 'b' for Beverages:");
        char category = sc.next().charAt(0);
        
        // Process based on the category chosen
        if (category == 'c') {
            System.out.println("Choose 1 for Espresso, 2 for Cappuccino, 3 for Latte:");
            int coffeeChoice = sc.nextInt();
            switch (coffeeChoice) {
                case 1: System.out.println("Enjoy your Espresso Coffee!"); break;
                case 2: System.out.println("Enjoy your Cappuccino Coffee!"); break;
                case 3: System.out.println("Enjoy your Latte Coffee!"); break;
                default: System.out.println("INVALID OPTION!"); break;
            }
        } else if (category == 't') {
            System.out.println("Choose 1 for Plain Tea, 2 for Assam Tea, 3 for Ginger Tea:");
            int teaChoice = sc.nextInt();
            switch (teaChoice) {
                case 1: System.out.println("Enjoy your Plain Tea!"); break;
                case 2: System.out.println("Enjoy your Assam Tea!"); break;
                case 3: System.out.println("Enjoy your Ginger Tea!"); break;
                default: System.out.println("INVALID OPTION!"); break;
            }
        } else if (category == 's') {
            System.out.println("Choose 1 for Hot and Sour Soup, 2 for Veg Corn Soup, 3 for Tomato Soup:");
            int soupChoice = sc.nextInt();
            switch (soupChoice) {
                case 1: System.out.println("Enjoy your Hot and Sour Soup!"); break;
                case 2: System.out.println("Enjoy your Veg Corn Soup!"); break;
                case 3: System.out.println("Enjoy your Tomato Soup!"); break;
                default: System.out.println("INVALID OPTION!"); break;
            }
        } else if (category == 'b') {
            System.out.println("Choose 1 for Hot Chocolate, 2 for Badam Drink, 3 for Badam-Pista Drink:");
            int beverageChoice = sc.nextInt();
            switch (beverageChoice) {
                case 1: System.out.println("Enjoy your Hot Chocolate!"); break;
                case 2: System.out.println("Enjoy your Badam Drink!"); break;
                case 3: System.out.println("Enjoy your Badam-Pista Drink!"); break;
                default: System.out.println("INVALID OPTION!"); break;
            }
        } else {
            System.out.println("INVALID CATEGORY!");
        }
    }
}
