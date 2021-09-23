
public class PaymentTerminal {

	private double money;  // amount of cash
	private int affordableMeals; // number of sold affordable meals
	private int heartyMeals;  // number of sold hearty meals
	private static final double AFFORDABLE_MEAL_PRICE = 2.5;
	private static final double HEARTY_MEAL_PRICE = 4.3;

	public PaymentTerminal() {
		// register initially has 1000 euros of money
		this.money = 1000;
	}

	public double eatAffordably(double payment) {
		// an affordable meal costs 2.50 euros
		// increase the amount of cash by the price of an affordable mean and return the change
		// if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
		if (payment >= AFFORDABLE_MEAL_PRICE) {
			money += AFFORDABLE_MEAL_PRICE;
			affordableMeals++;
			return payment - AFFORDABLE_MEAL_PRICE;
		} else {
			return payment;
		}
	}

	public boolean eatAffordably(PaymentCard card) {
		if (card.takeMoney(AFFORDABLE_MEAL_PRICE)) {
			affordableMeals++;
			return true;
		} else {
			return false;
		}
	}

	public boolean eatHeartily(PaymentCard card) {
		if (card.takeMoney(HEARTY_MEAL_PRICE)) {
			heartyMeals++;
			return true;
		} else {
			return false;
		}
	}

	public double eatHeartily(double payment) {
		// a hearty meal costs 4.30 euros
		// increase the amount of cash by the price of a hearty mean and return the change
		// if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
		if (payment >= HEARTY_MEAL_PRICE) {
			money += HEARTY_MEAL_PRICE;
			heartyMeals++;
			return payment - HEARTY_MEAL_PRICE;
		} else {
			return payment;
		}
	}

	public void addMoneyToCard(PaymentCard card, double sum) {
		if (sum >= 0) {
			card.addMoney(sum);
			this.money += sum;
		}
	}

	@Override
	public String toString() {
		return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
	}
}
