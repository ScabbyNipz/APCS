//*****************************************************************************
//
//
//
//*****************************************************************************
public class DiceGameRunner
{
    public static void main(String[] args)
    {
    Dice d1 = new Dice(6);
    Dice d2 = new Dice(6);
    int p1 =0;
    int p2 = 0;
    int sum1 = 0;
    int sum2 = 0;
    while(p1 < 10 && p2 < 10)
    {
        d1.roll();
        d2.roll();
        sum1 = d1.getRoll() + d2.getRoll();
        d1.roll();
        d2.roll();
        sum2 = d1.getRoll() + d2.getRoll();
        if (sum1 > sum2)
            p1++;
        else if(sum2 > sum1)
            p2++;
    }
    String output = "Player 1: " + p1 + " points \nPlayer2: " + p2 + " points";
    if (p1 > p2)
        output += "\nPlayer 1 wins!";
    else
        output+= "\nPlayer 2 wins!";
    System.out.println(output);
    }
}