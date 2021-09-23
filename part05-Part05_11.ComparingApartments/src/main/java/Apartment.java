
public class Apartment {

	private int rooms;
	private int squares;
	private int pricePerSquare;

	public Apartment(int rooms, int squares, int pricePerSquare) {
		this.rooms = rooms;
		this.squares = squares;
		this.pricePerSquare = pricePerSquare;
	}

	/* these getters are un-necessary! */
//	public int getSquares() {
//		return squares;
//	}
//
//	public int getPrincePerSquare() {
//		return pricePerSquare;
//	}

	public boolean largerThan(Apartment compared) {
		return this.squares > compared.squares;
	}

	public int priceDifference(Apartment compared) {
		int difference = this.pricePerSquare * this.squares - compared.pricePerSquare * compared.squares;
		return difference > 0 ? difference : -difference;
	}

	public boolean moreExpensiveThan(Apartment compared) {
		return this.pricePerSquare * this.squares > compared.pricePerSquare * compared.squares;
	}
}