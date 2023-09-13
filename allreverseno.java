import java.util.*;

public class allreverseno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}