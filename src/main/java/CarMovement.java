public class CarMovement {
	private static final int STOP_MIN_NUM = 0;
	private static final int STOP_MAX_NUM = 3;
	private static final int GO_MIN_NUM = 4;
	private static final int GO_MAX_NUM = 9;
	private final int index;
	private final int number;

	public CarMovement(int index, int number) {
		this.index = index;
		this.number = number;
	}

	public CarStatus getStatus() {
		if (getNumber() >= STOP_MIN_NUM && getNumber() <= STOP_MAX_NUM) {
			return CarStatus.STOP;
		}
		if (getNumber() >= GO_MIN_NUM && getNumber() <= GO_MAX_NUM) {
			return CarStatus.GO;
		}
		return CarStatus.STOP;
	}

	public int getIndex() {
		return index;
	}

	public int getNumber() {
		return number;
	}
}
