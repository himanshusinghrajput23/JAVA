import java.util.*;

public class vowel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an alphabet: ");
        char ch = scanner.next().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(ch+ " is a vowel.");
                break;
            default:
                System.out.println(ch + " is a consonant.");
        }
    }
}