
public class Card {
	private int rank;
	private int suit;

	public Card(int rank, int suit) {
		this.rank = rank;
		this.suit = suit;
	}

	public static Card[] makeDeck() {
		Card[] cards = new Card[52];
		int index = 0;
		for (int suit = 0; suit <= 3; suit++) {
			for (int rank = 1; rank <= 13; rank++) {
				cards[index] = new Card(rank, suit);
				index++;
			}
		}
		return cards;
	}

	public int getRank() {
		return this.rank;
	}

	public int getSuit() {
		return this.suit;
	}

	public void compareTo(Card card) {
		if (this.rank == card.getRank()) {
			System.out.println("The Cards are the same.");
		} else if (this.rank > card.getRank()) {
			if (this.rank == 0) {
				System.out.println("Card is grater.");
			} else {
				System.out.println("Card 2 is grater.");
			}
		} else {
			if (card.rank == 0) {
				System.out.println("Card2 is grater.");
			} else {
				System.out.println("Card  is grater.");
			}
		}
	}

	public static void suitHist(Card[] cards) {
		int[] suits = { 0, 0, 0, 0 };
		for (Card card : cards) {
			suits[card.getSuit()] += 1;
		}
		System.out.print(suits);
	}

	public static boolean hasFlush(Card[] cards) {
		int suit = cards[0].getSuit()
		for (Card card : cards){
			if(card.getSuit() != suit) {
				return false;
			}
			
		}
		return true;
	}

	public static void main(String[] args) {

	}
}

