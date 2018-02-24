//
//
//
//
//
//
import java.util.Scanner;
public class MorePractice
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[] occurs = new int[16];
        int input = 0;
        
        System.out.println("Enter number between 0-15: ");
        input = scan.nextInt();
        
        while (!(input <= 0 && input >= 15))
        {
        System.out.println("Enter number between 0-15: ");
        input = scan.nextInt();
        if(!(input <= 0 && input >= 15)){
            occurs[input] ++;
        }else{
            break;
        }
        }
        for(int i = 0; i < occurs.length; i++)
            System.out.println(i + " was entered " + occurs[i] + " times.");

    }
}