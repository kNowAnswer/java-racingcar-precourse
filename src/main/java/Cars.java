import java.util.ArrayList;
import java.util.List;

public class Cars {
	private final List<Car> cars;

	public Cars(List<Integer> integers) {
		this.cars = mapCars(integers);
	}

	private List<Car> mapCars(List<Integer> integers) {
		List<Car> cars = new ArrayList<>();
		for (int i = 0; i < integers.size(); i++) {
			cars.add(new Car(i, integers.get(i)));
		}
		return cars;
	}

	public RaceResult race() {
		RaceResult raceResult = new RaceResult();

		for (Car car : this.cars) {
			CarStatus carStatus = car.getStatus();
			raceResult.report(carStatus);
		}

		return raceResult;
	}
}
