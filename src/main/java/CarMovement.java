public class CarMovement {
	private static final String ERROR_MSG = "CarMovement number: 0 이상 9 이하만 가능 number: ";
	private static final int STOP_MIN_NUM = 0;
	private static final int STOP_MAX_NUM = 3;
	private static final int GO_MIN_NUM = 4;
	private static final int GO_MAX_NUM = 9;
	private final int index;
	private final int number;

	public CarMovement(int index, int number) {
		validationCheck(number);
		this.index = index;
		this.number = number;
	}

	private void validationCheck(int number) {
		if (number < STOP_MIN_NUM || number > GO_MAX_NUM) {
			throw new IllegalArgumentException(ERROR_MSG + number);
		}
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
