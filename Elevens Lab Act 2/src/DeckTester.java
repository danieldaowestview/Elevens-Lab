/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 * 
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = { "jack", "queen", "king" };
		String[] suits = { "blue", "red" };
		int[] pointValues = { 11, 12, 13 };
		Deck d = new Deck(ranks, suits, pointValues);
		System.out.println(d.isEmpty());
		System.out.println(d.size());
		System.out.println(d.deal());
		System.out.println(d.size());
		System.out.println(d.toString());
		String[] ranks2 = { "jack", "queen", "king" };
		String[] suits2 = { "green", "yellow" };
		int[] pointValues2 = { 11, 12, 13 };
		Deck d2 = new Deck(ranks2, suits2, pointValues2);
		String[] ranks3 = { "jack", "queen", "king" };
		String[] suits3 = { "black", "white" };
		int[] pointValues3 = { 11, 12, 13 };
		Deck d3 = new Deck(ranks3, suits3, pointValues3);
	}
}
