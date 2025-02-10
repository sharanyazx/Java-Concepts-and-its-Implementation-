package demo;

public class SS {

    public static void main(String[] args) {
        int age = 15;   

        try {
            if (age >= 18) {
                System.out.print("Eligible for voting ");
            } else {
                System.out.print("Not eligible for voting ");
            }
        } catch (Exception e) {
            System.out.print("An error occurred");           // output  not eligible for voting
            
        }
    }
}
