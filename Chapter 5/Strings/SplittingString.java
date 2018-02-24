//
//
//
//
//
import java.util.Scanner;

public class SplittingString
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String sentence;
        int start, end, start2;
        
        System.out.print("Enter a String: ");
        sentence = scan.nextLine();
        start = 0;
        
        if ((sentence.length()%2 == 0))
        {
        end = ((((sentence.length())/2) + 1));
        start2 = end;
        System.out.println(sentence.substring(start, end));
        System.out.println(sentence.substring(start2));
        }
        
        else
        {
         end = (((sentence.length())/2));
         System.out.println(sentence.substring(start, end));
         System.out.println(sentence.substring(start2));
        }
    }
}