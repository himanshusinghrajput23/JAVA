import java.util.Scanner;

public class firstlastdigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int firstDigit = number;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }
        int lastDigit = number % 10;
        System.out.println("The first digit : " + firstDigit);
        System.out.println("The last digit : " + lastDigit);
    }
}