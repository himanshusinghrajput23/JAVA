import java.util.Scanner;

public class String13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        String[] words = str.split(" ");
        String reversedWords = "";
        for (int i = words.length - 1; i >= 0; i--) {

            reversedWords += words[i] + " ";
        }
        System.out.println(reversedWords);
    }
}