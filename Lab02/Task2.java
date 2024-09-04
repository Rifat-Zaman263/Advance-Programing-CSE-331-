import java.util.Scanner;
public class Task2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int N1 = number;
        int N2 = 0;

        if (number < 0) {
            System.out.println(number + " is not a palindrome.");
            return;
        }
        while (number > 0) {
            int digit = number % 10;
            N2 = N2 * 10 + digit;
            number /= 10;
        }
        if (N1 == N2) {
            System.out.println(N1 + " is a palindrome.");
        } else {
            System.out.println(N1 + " is not a palindrome.");
        }
    }
}
