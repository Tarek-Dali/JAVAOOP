package ovning004;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Card card = new Card("Hearts", "Q", 12);
		System.out.println(card.suit);
		
		/*
		 * 1. skapa en array med 52 element
		 * 2. varje element ska vara ett Card-objekt
		 * 3. varje card ska vara unikt
		 */
		
		Card[] deck = new Card[52];
		String[] suits = {"Hearts", "Clubs", "Diamonds", "Spades"};
		String[] signs = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Kn", "Q", "K", "Ace"};
		
		for(int i = 0; i < deck.length; i++) {
			deck[i] = new Card("Hearts", "Q", 12);
		}
		for(int i = 0; i < deck.length; i++) {
			System.out.println(deck[i].sign);
		} 
	}
	

}
