
public class SimpleDate {

	private int day;
	private int month;
	private int year;
	private static final int DAYS_IN_MONTH = 30;
	private static final int MONTHS_IN_YEAR = 12;

	public SimpleDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public void advance(int howManyDays) {
		day += howManyDays;
		if (day > DAYS_IN_MONTH) {
			// e.g. if this.day = 92, month should +3, day should go back to 2;
			month += day / DAYS_IN_MONTH; // recall truncation of division between int type variables.
			day = day % DAYS_IN_MONTH;
		}
		if (month > MONTHS_IN_YEAR) {
			year += month / MONTHS_IN_YEAR;
			month = month % MONTHS_IN_YEAR;
		}
	}

	// method overloading
	public void advance() {
		this.advance(1);
	}

	public SimpleDate afterNumberOfDays(int days) {
		SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
		newDate.advance(days);
		return newDate;
	}
	@Override
	public String toString() {
		return this.day + "." + this.month + "." + this.year;
	}

	public boolean before(SimpleDate compared) {
		if (this.year < compared.year) {
			return true;
		}

		if (this.year == compared.year && this.month < compared.month) {
			return true;
		}

		if (this.year == compared.year && this.month == compared.month &&
				this.day < compared.day) {
			return true;
		}

		return false;
	}

}
