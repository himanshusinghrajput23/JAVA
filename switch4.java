import java.util.Scanner;

public class switch4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int maximum;

        switch (Integer.compare(num1, num2)) {
            case -1:
                maximum = num2;
                break;
            case 0:
                maximum = num1;
                break;
            case 1:
                maximum = num1;
                break;
            default:
                maximum = 0;
        }

        System.out.println("The maximum of " + maximum);
    }
}