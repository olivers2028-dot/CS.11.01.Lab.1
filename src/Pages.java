import java.util.Scanner;

public class Pages {
    public static void main(String[] args) {
        System.out.println("Welcome to \"Pages before Giving Up\" Calculator!");   // Prints welcome banner

        Scanner scanner = new Scanner(System.in);
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
        System.out.println("Pages you, a " + age + "-year-old, should read before giving up: " + (100-age));    // Output


    }
}
