//*****************************************************************************
//                      Ryan Hanaway
//                  Homework January 9, 2018
//
//
//*****************************************************************************
import java.util.Scanner;
public class Homework
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String phrase;
        System.out.print("Enter a string: ");
        phrase = scan.next();
        int total = phrase.length();
        char[] letters = new char[total];
        
        for(int i = 0; i < phrase.length(); i++)
        {
            letters[i] = phrase.charAt(i);
        }
        for(int i = 0; i < phrase.length(); i++)
            System.out.println(letters[i]);
    }
}