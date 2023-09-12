import java.util.Scanner;

public class switch6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        switch (Integer.compare(number, 0)) {
            case -1:
                System.out.println(number + " is a negative number.");
                break;
            case 0:
                System.out.println(number + " is zero.");
                break;
            case 1:
                System.out.println(number + " is a positive number.");
                break;
            default:
                System.out.println("Invalid number.");
        }
    }
}