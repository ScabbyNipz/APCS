//*****************************************************************************
//
//
//
//*****************************************************************************
import java.util.Scanner;

public class Hw128
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String input, word;
        int i, count = 0;
        
        System.out.println("Enter a String ");
        input = scan.nextLine().toLowerCase();
        System.out.println("Enter another String");
        word = scan.next().toLowerCase();
 
 
        System.out.println(word + " occurs " + input.indexOf(word) + " times.");
    }
}