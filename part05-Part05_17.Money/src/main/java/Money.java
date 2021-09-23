
public class Money {

	private final int euros;
	private final int cents;

	public Money(int euros, int cents) {

		if (cents > 99) {
			euros = euros + cents / 100;
			cents = cents % 100;
		}

		this.euros = euros;
		this.cents = cents;
	}

	public int euros() {
		return this.euros;
	}

	public int cents() {
		return this.cents;
	}

	public Money plus(Money addition) {
		return new Money(this.euros + addition.euros, this.cents + addition.cents);
	}

	public boolean lessThan(Money compared) {
		return this.euros < compared.euros ||
				(this.euros == compared.euros && this.cents < compared.cents);
	}

	public Money minus(Money decreaseBy) {
		if (this.euros < decreaseBy.euros
				|| (this.euros == decreaseBy.euros && this.cents < decreaseBy.cents)) {
			return new Money(0, 0);
		} else {
			int newEuro = this.euros - decreaseBy.euros;
			int newCents = this.cents - decreaseBy.cents;
			// the range of newCents is [-99,99], but it should be [0,99]
			if (newCents < 0) {
				newCents += 100;
				newEuro -= 1;
			}
			return new Money(newEuro, newCents);
		}
	}
	public String toString() {
		String zero = "";
		if (this.cents < 10) {
			zero = "0";
		}

		return this.euros + "." + zero + this.cents + "e";
	}

}
