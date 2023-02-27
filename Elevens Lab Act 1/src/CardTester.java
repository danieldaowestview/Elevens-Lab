/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card c = new Card("King", "Spades", 10);
		Card c2 = new Card("King", "Spades", 10);
		Card c3 = new Card("Queen", "Hearts", 10);
		System.out.println(c.getRank());
		System.out.println(c.getSuit());
		System.out.println(c.getPointValue());
		System.out.println(c.matches(c2));
		System.out.println(c.toString());
		System.out.println(c2.getRank());
		System.out.println(c2.getSuit());
		System.out.println(c2.getPointValue());
		System.out.println(c2.matches(c3));
		System.out.println(c2.toString());
		System.out.println(c3.getRank());
		System.out.println(c3.getSuit());
		System.out.println(c3.getPointValue());
		System.out.println(c3.matches(c2));
		System.out.println(c3.toString());
	}
}
