//
//
//
//
//
import java.util.Scanner;

public class SumNum
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num, sum = 0;
        System.out.print("Enter a positive integer: ");
        num = scan.nextInt();
        for(int i = 1; i <= num; i++)
        {
            sum += i;
        }
        System.out.println("The sum from 1 to " + num + " is " + i);
    }
}