public class CallingCard extends Card {
	
	private int cardNum;
	private int pin;
	
	public CallingCard(String n, int inCardNum, int inPin) {
		super(n);
		cardNum = inCardNum;
		pin = inPin;
	}
	
	public String format() {
		return super.format() + "\nCard number: " + cardNum + "\nPIN: " + pin;
	}
	
	public String toString() {
		return super.toString() + " [cardNum=" + cardNum + "] [pin=" + pin + "]";
	}
	
	public boolean equals(Object otherObject) {
		if (!super.equals(otherObject)) {
			return false;
		}
		CallingCard other = (CallingCard) otherObject;
		return cardNum == other.cardNum && pin == other.pin;
	}
	
}
