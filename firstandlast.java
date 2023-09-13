import java.util.Scanner;

public class firstandlast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        String numberString = String.valueOf(number);

        char firstDigit = numberString.charAt(0);
        char lastDigit = numberString.charAt(numberString.length() - 1);

        int firstDigitInt = Character.digit(firstDigit, 10);
        int lastDigitInt = Character.digit(lastDigit, 10);

        System.out.println("The first digit : " + firstDigitInt);
        System.out.println("The last digit : " + lastDigitInt);
    }
}