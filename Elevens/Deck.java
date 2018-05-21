import java.util.List;
import java.util.ArrayList;
public class Deck
{
	private List<Card> cards;
	private int size;
	public Deck(String[] ranks, String[] suits, int[] values) {
		cards = new ArrayList<Card>();
		
		for (int i = 0; i < ranks.length; i++) 
		{
			for(String s : suits)
			{
				cards.add(new Card (ranks[i], s, values[i]));
			}
		}
		size = cards.size();
	}

	public boolean isEmpty() {
		if (size == 0)
		    return true;
		else
		    return false;
	}

	public int size() {
		return size;
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		if (size == 0)
		    return null;
		else
		    cards.remove(0);
		    return cards.get(0);
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}