//****************************
//Write a program that prints all natural numbers from 1 to n. 
//Where n is given by the user.
//
//***************************
import util.java.Scanner;

public class Number1
{
    public static void main(String[] args)
    {
     Scanner scan = new Scanner(System.in);
     int n = 1, count;
    System.out.prinln("Enter the number you would like to count to:";
     n = scan.nextInt();
   
    while (count <= n)
        {
        System.out.print(count + " ");
        count++;
        }
 }
}