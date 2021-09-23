
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
		// didn't need to account for value of cents > 100; that exception is handled by the constructor.
		return new Money(this.euros + addition.euros, this.cents + addition.cents);
	}

	public boolean lessThan(Money compared) {
		// better solution by Mooc.fi
		return (100 * this.euros + this.cents) < (100 * compared.euros + compared.cents);
	}

	public Money minus(Money decreaseBy) {
		// better solution by Mooc.fi
		int newEuro = this.euros - decreaseBy.euros;
		int newCents = this.cents - decreaseBy.cents;
		// the range of newCents is [-99,99], but it should be [0,99]
		if (newCents < 0) {
			newCents += 100;
			newEuro -= 1;
		}
		return newEuro < 0 ? new Money(0, 0) : new Money(newEuro, newCents);
	}

	public String toString() {
		String zero = "";
		if (this.cents < 10) {
			zero = "0";
		}

		return this.euros + "." + zero + this.cents + "e";
	}

}
