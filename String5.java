import java.util.Scanner;

public class String5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string in lowercase: ");
        String str = scanner.nextLine();
        String upperCaseStr = str.toUpperCase();
        System.out.println(" uppercase is: " + upperCaseStr);
    }
}