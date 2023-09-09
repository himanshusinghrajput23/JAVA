import java.util.*;

public class fourth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 5 == 0 && number % 11 == 0) {
            System.out.println("The number is divisible by 5 and 11.");
        } else {
            System.out.println("The number is not divisible by 5 and 11.");
        }
    }
}