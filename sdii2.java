import java.util.Scanner;

public class sdii2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Read an integer
        System.out.print("Enter an integer: ");
        int inputInt = scanner.nextInt();
        scanner.nextLine(); // consume the newline character after nextInt()

        // Read a double
        System.out.print("Enter a double: ");
        double inputDouble = scanner.nextDouble();

        // Output the inputs
        System.out.println("You entered:");
        System.out.println("String: " + inputString);
        System.out.println("Integer: " + inputInt);
        System.out.println("Double: " + inputDouble);

        scanner.close();
    }
}
