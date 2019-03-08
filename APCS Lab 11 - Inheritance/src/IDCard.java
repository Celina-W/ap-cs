public class IDCard extends Card {
	
	private int id;
	
	public IDCard(String n, int inId) {
		super(n);
		id = inId;
	}
	
	public String format() {
		return super.format() + "\nID number: " + id;
	}
	
	public String toString() {
		return super.toString() + " [id=" + id + "]";
	}
	
	public boolean equals(Object otherObject) {
		if (!super.equals(otherObject)) {
			return false;
		}
		IDCard other = (IDCard) otherObject;
		return id == other.id;
	}
	
}
