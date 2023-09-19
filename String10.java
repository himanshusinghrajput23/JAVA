import java.util.Scanner;

public class String10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        String[] words = str.split(" ");
        System.out.println("Number of words: " + words.length);
    }
}