import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int result = findSingleDigitSum(number);

        System.out.println("Sum of digits until single digit: " + result);
    }

    public static int findSingleDigitSum(int number) {
        int sum = number;

        while (sum > 9) {
            int temp = sum;
            sum = 0;

            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }
        }

        return sum;
    }
}