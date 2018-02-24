//
//
//
//
//
import java.util.Random;
public class Dice
{
    Random gen = new Random();
    private int numberOfSides;
    private int side;
    
    public Dice()
    {
        numberOfSides = 6;
    }
    
    public Dice(int i)
    {
        numberOfSides = i;
        side = 1;
    }
    public void roll()
    {
        side = gen.nextInt(numberOfSides) + 1;
    }

    public int getSide()
    {
        return side;
    }
    public String toString()
    {
        return "Total number of sides: " + numberOfSides 
            + "\nCurrent side: " + side;
    }
}