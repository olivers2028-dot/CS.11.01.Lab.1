import java.util.Scanner;

public class Dateable {
    public static void main(String[] args) {
        System.out.println("Welcome to Dateable Calculator");   // Prints welcome banner

        Scanner scanner = new Scanner(System.in);               // Start scanner

        System.out.println("Enter your age");                   // Asks for user age input

        int age = -1;                                           // Input validation
        while (age < 0){
            try{
                age = Integer.parseInt(scanner.nextLine());
            }
            catch (NumberFormatException e){
                System.out.println("Invalid input. Please enter a valid age");
            }
        }
        System.out.println("The maximum age you can date is: " + age/2 + 7);    // Output


    }
}
