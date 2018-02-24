//*****************************************************************************
//
//
//
//*****************************************************************************
import java.util.Scanner;

public class Yahtee
{
    public static void main(String[] args)
    {
        Dice[] diceSet = new Dice[5];
        Scanner scan = new Scanner(System.in);
        String reroll;
        //Creates and rolls each dice.
        for(int i = 0; i < diceSet.length; i++)
        {
            diceSet[i] = new Dice();
            diceSet[i].roll();
        }
        //Prints out all values of all 5 dice.
        for(int i  = 0; i < diceSet.length; i++)
        {
            System.out.print("Dice " + (i + 1) + ": "
                + diceSet[i].getSide() + "\t");
        }
        //Ask the user which dice they would like to re-roll, in order no space
        System.out.print("\nRe-roll: ");
        reroll = scan.next();
        
        String number;
        int num;
        for(int i = 0; i < reroll.length(); i++)
        {
            number = reroll.charAt(i) + "";
            num =  Integer.parseInt(number);
            diceSet[num - 1].roll();
        }
        
        //Prints out values of all 5 dice
        for(int i  = 0; i < diceSet.length; i++)
        {
            System.out.print("Dice " + (i + 1) + ": "
                + diceSet[i].getSide() + "\t");
        }
        //Gets player 1's score, by counting the number of times each occurs
        // and returning that face and how many times 
        int count = 0;
        int highest = 0;
        int face = diceSet[0].getSide();
        for(int i  = 0; i < diceSet.length; i++)
        {
            for(int j = 0; i < diceSet.length; j++)
            {
                if (diceSet[i]==diceSet[j])
                    count++;
            }
            if (count > highest)
            {
                highest = count;
                face = diceSet[i].getSide();
            }
            count = 0;
        }
        
    }
}