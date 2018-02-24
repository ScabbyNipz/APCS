//*****************************************************************************
// Read in 8 character String
//
//
//
//*****************************************************************************
import java.util.Scanner;

public class ArrayPractice
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        char[] letters = new char[8];
        String phrase;
        System.out.print("Enter an 8 character String: ");
        phrase = scan.next();
        
        for(int i = 0; i < phrase.length(); i++)
        {
            letters[i] = phrase.charAt(i);
        }
        for(int i = 0; i < letters.length; i++)
            System.out.println(letters.charAt[i]);
    }
}