//*****************************************************************************
//Class for a playing card
//Suits: 0 = Hearts, 1 = Diamonds, 2 = Spades, 3 = Clubs
//
//*****************************************************************************
public class Card
{
    private int number;
    private int suit;
    
    public Card(int n, int s)
    {
        number = n;
        suit = s;
    }
    public int getNumber()
    {
        return number;
    }
    public int getSuit()
    {
        return suit;
    }
    public String toString()
    {
        String output = "Number: " + number + "\nSuit: ";
        if(suit == 0)
            output += "Hearts";
        else if(suit == 1)
            output += "Diamonds";
        else if(suit == 2)
            output += "Spades";
        else if(suit == 3)
            output += "Clubs";
        return output;
    }
}