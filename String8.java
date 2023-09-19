import java.util.Scanner;

public class String8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        int alphabetCount = 0;
        int digitCount = 0;
        int specialCharacterCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isAlphabetic(ch)) {
                alphabetCount++;
            }

            else if (Character.isDigit(ch)) {
                digitCount++;
            }
            else {
                specialCharacterCount++;
            }
        }
        System.out.println("Number of alphabets: " + alphabetCount);
        System.out.println("Number of digits: " + digitCount);
        System.out.println("Number of special characters: " + specialCharacterCount);
    }
}