/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	public static void main(String[] args) {
	    String[] ranks = {"jack", "queen", "king"};
        String[] suits = {"blue", "red"};
        int[] pointValues = {11, 12, 13};
        Deck d1 = new Deck(ranks, suits, pointValues); 
        Deck d2 = new Deck(ranks, suits, pointValues); 
        Deck d3 = new Deck(ranks, suits, pointValues); 
        
        d1.isEmpty();
        d2.isEmpty();
        d3.isEmpty();
        
        d1.size();
        d2.size();
        d3.size();
        
        d1.deal();
        d2.deal();
        d3.deal();
        
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

	}
}