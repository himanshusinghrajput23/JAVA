import java.util.Scanner;

public class String6{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string in uppercase: ");
        String str = scanner.nextLine();
        String lowerCaseStr = str.toLowerCase();
        System.out.println("The string in lowercase is: " + lowerCaseStr);
    }
}