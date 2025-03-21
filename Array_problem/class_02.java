import java.util.Scanner;

public class SumWholeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Please enter a positive whole number.");
        } else {
            int sum = 0;
            
            for (int i = 0; i <= n; i++) {
                sum += i;
            }
            
            System.out.println("Sum of whole numbers from 0 to " + n + " is: " + sum);
        }

        scanner.close();
    }
}
