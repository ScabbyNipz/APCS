//*****************************************************************************
// Hanaway, Ryan J.
//
//
//*****************************************************************************
import java.util.Scanner;
public class ProgrammingProject3 
{
    public static void main(String[] args)
    {
    Scanner scan = new Scanner(System.in);
    int gradeSum = 0, gradeNum = 0, gradeIn = 0;
    double average;
    while ( gradeIn >= 0)
    {
        System.out.println("Enter a grade. If you have no more grades to"
            + " report  enter -1.");
        gradeIn = scan.nextInt();
        gradeSum = gradeIn + gradeSum;
        gradeNum++;
    }
    gradeNum--;
    System.out.print("Number of assignments: " + gradeNum 
            + "\nAverage grade: " + (gradeSum) / ((double)(gradeNum + .5)));
  
    }
}