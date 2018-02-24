//
//
//
//
//
import java.util.Scanner;

public class FirstLastDigit
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n, i = 0;
        System.out.println("Enter a positive number: ");
        n = scan.nextInt();
        System.out.println("The last digit is: " + (n % 10));
    
        for (i = num; i < 10; i /= 10)
        {
        }
        System.out.println("The first digit is: " + i);
    }
}