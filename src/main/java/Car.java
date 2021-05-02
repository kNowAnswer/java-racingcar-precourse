public class Car {
	private static final int STOP_MIN_NUM = 0;
	private static final int STOP_MAX_NUM = 3;
	private static final int GO_MIN_NUM = 4;
	private static final int GO_MAX_NUM = 9;
	private final int number;

	public Car(int number) {
		this.number = number;
	}

	public CarStatus getStatus() {
		if (this.number >= STOP_MIN_NUM && this.number <= STOP_MAX_NUM) {
			return CarStatus.STOP;
		}
		if (this.number >= GO_MIN_NUM && this.number <= GO_MAX_NUM) {
			return CarStatus.GO;
		}
		return CarStatus.STOP;
	}
}
