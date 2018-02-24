//*****************************************************************************
//  Hanaway Ryan J.
// Phone Number Conversion
//
//
//*****************************************************************************
import java.util.Scanner;

public class Project1MP2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a phone number with letters to convert (with"
            + "out dashes and between 9 and 13 digits)");
        String number = scan.nextLine().toLowerCase();
        
        number = number.replace('a','2');
        number = number.replace('b','2');
        number = number.replace('c','2');
        number = number.replace('d','3');
        number = number.replace('e','3');
        number = number.replace('f','3');
        number = number.replace('g','4');
        number = number.replace('h','4');
        number = number.replace('i','4');
        number = number.replace('j','5');
        number = number.replace('k','5');
        number = number.replace('l','5');
        number = number.replace('m','6');
        number = number.replace('n','6');
        number = number.replace('o','6');
        number = number.replace('p','7');
        number = number.replace('q','7');
        number = number.replace('r','7');
        number = number.replace('s','7');
        number = number.replace('t','8');
        number = number.replace('u','8');
        number = number.replace('v','8');
        number = number.replace('w','9');
        number = number.replace('x','9');
        number = number.replace('y','9');
        number = number.replace('z','9');
        
        if (number.length()== 10) //No country code
        {
            System.out.println(number.charAt(0) + number.charAt(1) 
                + number.charAt(2) + "-" + number.charAt(3) + number.charAt(4)
                + number.charAt(5) + "-" + number.charAt(6)  + number.charAt(7)
                + number.charAt(8) + number.charAt(9));
        }        
         else if(number.length()== 11) //One digit country code
        {
            System.out.println(number.charAt(0) + "-" + number.charAt(1) 
                + number.charAt(2) + number.charAt(3) + "-" + number.charAt(4)
                + number.charAt(5) + number.charAt(6) + "-" + number.charAt(7)
                + number.charAt(8) + number.charAt(9) + number.charAt(10));
        }
        else if(number.length()== 12) //2 digit country code
        {
            System.out.println(number.charAt(0) + number.charAt(1) + "-" 
                + number.charAt(2) + number.charAt(3) + number.charAt(4) + "-"
                + number.charAt(5) + number.charAt(6) + number.charAt(7) + "-"
                + number.charAt(8) + number.charAt(9) + number.charAt(10)
                + number.charAt(11));
        }
        else if(number.length()== 13) //3 digit country code
        {
            System.out.println(number.charAt(0) + number.charAt(1) 
                + number.charAt(2) + "-" + number.charAt(3) + number.charAt(4)
                + number.charAt(5) + "-" + number.charAt(6) + number.charAt(7)
                + number.charAt(8) + "-" + number.charAt(9) + number.charAt(10)
                + number.charAt(11) + number.charAt(12));
        }
        else
            System.out.println("Invalid input.");
    }
}