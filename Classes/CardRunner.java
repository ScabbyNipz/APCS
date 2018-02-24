//Runner to use the deck of cards

public class CardRunner
{
    public static void main(String[] args)
    {
        Deck cards = new Deck();
        System.out.println("Card 1: " + cards.drawCard().toString());
    }
}