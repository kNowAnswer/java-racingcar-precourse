import java.util.ArrayList;
import java.util.List;

public class Car {

	private final String name;
	private final List<CarMovement> carMovements;

	public Car(String name, List<Integer> integers) {
		this.name = name;
		this.carMovements = mapCars(integers);
	}

	private List<CarMovement> mapCars(List<Integer> integers) {
		List<CarMovement> cars = new ArrayList<>();
		for (int i = 0; i < integers.size(); i++) {
			cars.add(new CarMovement(i, integers.get(i)));
		}
		return cars;
	}

	public RaceResult race() {
		RaceResult raceResult = new RaceResult(getName());
		for (CarMovement car : getCarMovements()) {
			CarStatus carStatus = car.getStatus();
			raceResult.report(carStatus);
		}
		return raceResult;
	}

	public String getName() {
		return name;
	}

	public List<CarMovement> getCarMovements() {
		return carMovements;
	}
}
