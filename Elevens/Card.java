public class Card
{
	private String suit;
	private String rank;
	private int pointValue;

	public Card(String cardRank, String cardSuit, int cardPointValue) {
		suit = cardSuit;
		rank = cardRank;
		pointValue = cardPointValue;
	}

	public String suit() {
		return suit;
   }

	public String rank() {
		return rank;
	}
	
	public int pointValue() {
		return pointValue;
	}
	
	public boolean equals(Card other) {
	    if (suit() == other.suit() && rank() == other.rank() && pointValue() == other.pointValue())
	        return true;
	    else
	        return false;
	}
	
	public String toString() { 
	    return rank + " of " + suit + "(pointValue = " + pointValue + ")";
	}
}