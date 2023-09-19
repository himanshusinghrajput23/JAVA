import java.util.Scanner;

public class String15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        System.out.println("Enter a character: ");
        char ch = scanner.next().charAt(0);
        int index = str.lastIndexOf(ch);
        if (index == -1) {
            System.out.println("The character is not found in the string.");
        } else {
            System.out.println("The last occurrence of the character is at index " + index);
        }
    }
}