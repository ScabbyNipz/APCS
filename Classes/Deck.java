//

public class Deck
{
    private int cardCount;
    private Card[] deck;
    
    public Deck()
    {
        cardCount = 52;
        deck = new Card[cardCount];
        fillDeck();
    }
    private void fillDeck()
    {
        //0=Hearts, 1=Diamonds, 2=Spades, 3=Clubs
        //0=Ace - 12=King
        int count = 0;
        for(int suit = 0; suit < 4; suit++)
        {
            for(int face = 0; face < 13; face++)
            {
                deck[count] = new Card((face + 1), suit);
                count++;
            }
        }
    }
    public int getCardCount()
    {
        return cardCount;
    }
    public Card drawCard()
    {
        Card topCard = deck[0];
        cardCount--;
        Card[] temp = new Card[cardCount];
        for(int i = 0; i < temp.length; i++)
        {
            temp[i] = new Card(deck[i + 1].getNumber(),deck[i+1].getSuit());
        }
        deck = new Card[cardCount];
        for (int i = 0; i < temp.length; i++)
        {
            deck[i] = new Card(temp[i].getNumber(), temp[i].getSuit());
        }
        return topCard;
    }
    public String toString()
    {
        String output = "";
        for (int i = 0; i < deck.length; i++)
        {
            output += deck[i].toString() + "\n";
        }
        return output;
    }
}