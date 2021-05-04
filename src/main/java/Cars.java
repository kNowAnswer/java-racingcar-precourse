import java.util.ArrayList;
import java.util.List;

public class Cars {
	private List<Car> cars;

	public Cars() {
		this.cars = new ArrayList<>();
	}

	public Cars(List<Car> cars) {
		this.cars = cars;
	}

	public RaceResults race() {
		RaceResults raceResults = new RaceResults();
		for (Car car : cars) {
			RaceResult raceResult = car.race();
			raceResults.report(car.getName(), raceResult);
		}
		return raceResults;
	}

	public void add(Car car) {
		this.cars.add(car);
	}

	public List<Car> getCars() {
		return cars;
	}
}
