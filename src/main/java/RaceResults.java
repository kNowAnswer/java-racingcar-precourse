import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RaceResults {
	private int winnerGoCount;
	private Map<String, RaceResult> raceResults;
	private List<String> winners;

	RaceResults() {
		this.winnerGoCount = 0;
		this.raceResults = new LinkedHashMap<>();
		this.winners = new ArrayList<>();
	}

	public RaceResult getResult(String carName) {
		return this.raceResults.get(carName);
	}

	public void report(String name, RaceResult raceResult) {
		this.raceResults.put(name, raceResult);
		int userGoCount = raceResult.getGoCount();
		if (winnerGoCount < userGoCount) {
			winners = new ArrayList<>();
			winnerGoCount = userGoCount;
		}
		if (winnerGoCount <= userGoCount) {
			winners.add(name);
		}
	}

	public List<String> findWinners() {
		return this.winners;
	}

	public void printWinners() {
		System.out.println(String.join(", ", this.winners) + "가 최종 우승했습니다.");
	}
}
