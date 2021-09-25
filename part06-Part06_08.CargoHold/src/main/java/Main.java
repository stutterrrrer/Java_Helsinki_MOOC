public class Main {
	public static void main(String[] args) {
		Item book = new Item("Lord of the rings", 2);
		Item phone = new Item("Nokia 3210", 1);
		Item brick = new Item("brick", 4);
		Item bonsai = new Item("bonsai", 6);
		Item wateringCan = new Item("watering can", 3);

		Suitcase wiseDelinquent = new Suitcase(10);
		wiseDelinquent.addItem(book);
		wiseDelinquent.addItem(phone);
		wiseDelinquent.addItem(brick);

		Suitcase plantEnthusiast = new Suitcase(10);
		plantEnthusiast.addItem(bonsai);
		plantEnthusiast.addItem(wateringCan);

		Hold hold = new Hold(20);
		hold.addSuitcase(wiseDelinquent);
		hold.addSuitcase(plantEnthusiast);
		System.out.println("The wiseDelinquent contains the following items:");
		wiseDelinquent.printItems();
		System.out.println("Total weight: " + wiseDelinquent.totalWeight() + " kg");
		System.out.println("Heaviest item: " + wiseDelinquent.heaviestItem());

		System.out.println(hold);
		System.out.println("The suitcases in the hold contain the following items:");
		hold.printItems();
	}
}