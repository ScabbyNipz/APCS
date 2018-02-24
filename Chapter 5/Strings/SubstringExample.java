//****************************************************************************
//
//
//
//****************************************************************************
import java.util.Scanner;

public class SubstringExample
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String sentence;
        int start, end;
        
        System.out.print("Enter a String: ");
        sentence = scan.nextLine();
        System.out.print("Enter start: ");
        start = scan.nextInt();
        System.out.print("Entere end: ");
        end = scan.nextInt();
       
        System.out.println(sentence.substring(start));
        System.out.println(sentence.substring(start, end));
    }
}