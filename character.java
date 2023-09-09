import java.util.Scanner;

public class character {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char character = scanner.next().charAt(0);

        if (Character.isAlphabetic(character)) {
            System.out.println("The character is an alphabet.");
        } else {
            System.out.println("The character is not an alphabet.");
        }
    }
}