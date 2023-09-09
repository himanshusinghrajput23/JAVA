import java.util.*;

public class third {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("Positive number");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Negative number");
        }
    }
}