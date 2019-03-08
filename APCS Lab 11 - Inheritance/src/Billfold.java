public class Billfold {

	private Card card1, card2;
	
	public Billfold() {
		card1 = null;
		card2 = null;
	}
	
	public void addCard(Card inCard) {
		if (card1 == null) {
			card1 = inCard;
		}
		else if (card2 == null) {
			card2 = inCard;
		}
	}
	
	public String formatCards() {
		return "[" + card1.format() + "|" + card2.format() + "]";
	}
	
	public int getExpiredCardCount() {
		int counter = 0;
		if (card1.isExpired()) counter++;
		if (card2.isExpired()) counter++;
		return counter;
	}
}
