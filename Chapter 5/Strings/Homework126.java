//*****************************************************************************
//
//
//
//*****************************************************************************
import java.util.Scanner;

public class Homework126
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String input; 
        char letter;
        int i, count = 0;
        
        System.out.println("Enter a String ");
        input = scan.nextLine().toLowerCase();
        System.out.println("Enter a character");
        letter = scan.next().toLowerCase().charAt(0);
        
        for(i = 0; i < input.length(); i++)
        {
         if (input.charAt(i) == letter) 
            count++;
        }
        System.out.println(letter + " occurs " + count + " times.");
    }
}