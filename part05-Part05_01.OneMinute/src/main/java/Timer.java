public class Timer {
	private ClockHand hundredthSecond;
	private ClockHand second;

	public Timer() {
		this.hundredthSecond = new ClockHand(100);
		this.second = new ClockHand(60);
	}

	public void advance() {
		hundredthSecond.advance();
		if (hundredthSecond.value() == 0) {
			second.advance();
		}
	}

	public String toString() {
		return second + ":" + hundredthSecond;
	}
}
