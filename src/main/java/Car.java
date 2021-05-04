import java.util.ArrayList;
import java.util.List;

public class Car {

	private final String name;
	private final CarMovements carMovements;

	public Car(String name, int count) {
		this.name = name;
		int[] intArr = new int[count];
		for (int i = 0; i < count; i++) {
			intArr[i] = Utils.makeRandomNumber();
		}
		List<Integer> list = new ArrayList<>();
		for (int randomNum : intArr) {
			list.add(randomNum);
		}
		this.carMovements = mapCars(list);
	}

	public Car(String name, List<Integer> integers) {
		this.name = name;
		this.carMovements = mapCars(integers);
	}

	private CarMovements mapCars(List<Integer> integers) {
		CarMovements cars = new CarMovements();
		for (int i = 0; i < integers.size(); i++) {
			cars.add(new CarMovement(i, integers.get(i)));
		}
		return cars;
	}

	public RaceResult race() {
		RaceResult raceResult = new RaceResult(getName());
		for (CarMovement car : carMovements.getCarMovements()) {
			CarStatus carStatus = car.getStatus();
			raceResult.report(carStatus);
		}
		return raceResult;
	}

	public String getName() {
		return name;
	}

	public CarMovements getCarMovements() {
		return carMovements;
	}
}
