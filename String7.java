import java.util.Scanner;

public class String7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        String lowerCaseStr = str.toLowerCase();
        String upperCaseStr = str.toUpperCase();
        String toggledCaseStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == lowerCaseStr.charAt(i)) {
                toggledCaseStr += upperCaseStr.charAt(i);
            } else {
                toggledCaseStr += lowerCaseStr.charAt(i);
            }
        }
        System.out.println("The string with toggled case is: " + toggledCaseStr);
    }
}