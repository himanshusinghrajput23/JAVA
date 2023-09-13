import java.util.*;

public class count
{
    public static void main(String[] args)
    {
        int i=0;
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of n =");
        int n=sc.nextInt();
        do
        {
            n=n/10;
            count++;
        } while(n>=1);
        System.out.println("the digit counting is ="+ count ); ;
}
}