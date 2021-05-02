import java.util.ArrayList;
import java.util.List;

public class Car {
	private final List<CarMovement> cars;

	public Car(List<Integer> integers) {
		this.cars = mapCars(integers);
	}

	private List<CarMovement> mapCars(List<Integer> integers) {
		List<CarMovement> cars = new ArrayList<>();
		for (int i = 0; i < integers.size(); i++) {
			cars.add(new CarMovement(i, integers.get(i)));
		}
		return cars;
	}

	public RaceResult race() {
		RaceResult raceResult = new RaceResult();

		for (CarMovement car : this.cars) {
			CarStatus carStatus = car.getStatus();
			raceResult.report(carStatus);
		}

		return raceResult;
	}
}
