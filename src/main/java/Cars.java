import java.util.List;

public class Cars {
	List<Car> cars;
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
}
