import java.util.LinkedHashMap;
import java.util.Map;

public class RaceResults {
	Map<String, RaceResult> raceResults;

	RaceResults() {
		this.raceResults = new LinkedHashMap<>();
	}

	public RaceResult getResult(String carName) {
		return this.raceResults.get(carName);
	}

	public void report(String name, RaceResult raceResult) {
		this.raceResults.put(name, raceResult);
	}
}
