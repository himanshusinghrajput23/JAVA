import java.util.Scanner;

public class month {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a month number : ");
        int month = scanner.nextInt();

        int days;

        switch (month) {
            case 1:days = 31;
                break;
            case 2:
                days = 28;
                break;
            case 3:days = 31;
                break;
            case 4:days = 30;
                break;
            case 5:days = 31;
                break;
            case 6: days = 30;
                break;   
            case 7:days = 31;
                break;
            case 8:days = 31;
                break;
            case 9:  days = 30;
                break;  
            case 10:days = 31;
                break;
            case 11:  days = 30;
                break;  
            case 12:
                days = 31;
                break;
                
            default:
                days = 0;
        }

        System.out.println("The number of days in that month is " + days);
    }
}