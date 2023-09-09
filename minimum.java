import java.util.Scanner;

public class minimum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        System.out.println("Enter the third number:");
        int num3 = scanner.nextInt();
        int min = Math.min(num1, Math.min(num2, num3));
        System.out.println("The minimum of the three numbers is: " + min);
    }
}
