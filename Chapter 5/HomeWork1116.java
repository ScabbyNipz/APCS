//*****************************************************************************
//Enter a positive integer: 36
//The factors of 36: 1, 2, 3, 4, 6, 9, 12, 18, 36
//
//*****************************************************************************
import java.util.Scanner;
public class HomeWork1116
{
    public static void main(String[] args)
    {
       Scanner scan = new Scanner(System.in);
       int magicNumber, i;
       System.out.println("Enter an integer you wish to find the factors of: ");
       magicNumber = scan.nextInt();
       
       for (i = magicNumber; i > 0; i--)
       {
        if (magicNumber % i == 0)
            System.out.print(i + ", ");
       }
    }
}