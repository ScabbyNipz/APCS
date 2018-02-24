//*****************************************************************************
//
// Hanaway, Ryan J
//
//
//*****************************************************************************
import java.util.Scanner;
public class TotalWordCounter
{
    public static void main(String[] args)
    {
     Scanner scan = new Scanner(System.in);
        String input;
        char space = ' ';
        int i, count = 1;
        
        System.out.println("Enter a String ");
        input = scan.nextLine();
        
        for(i = 0; i < input.length(); i++)
        {
         if (input.charAt(i) == space) 
            count++;
        }
        System.out.println("There are " + count + " words.");
    }
}