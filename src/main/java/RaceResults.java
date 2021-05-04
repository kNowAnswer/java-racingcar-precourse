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
		return raceResults.get(carName);
	}

	public void report(String name, RaceResult raceResult) {
		raceResults.put(name, raceResult);
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
		return winners;
	}

	public void printWinners() {
		System.out.println(String.join(", ", winners) + "가 최종 우승했습니다.");
	}

	public String printRaceResult() {
		StringBuilder sb = new StringBuilder();
		for (String carName : raceResults.keySet()) {
			RaceResult raceResult = getResult(carName);
			sb.append(raceResult.printRaceResult());
			sb.append("\n");
		}
		return sb.toString();
	}

	public String printRaceResult(int index) {
		StringBuilder sb = new StringBuilder();
		for (String carName : raceResults.keySet()) {
			RaceResult raceResult = getResult(carName);
			sb.append(raceResult.printRaceResult(index));
			sb.append("\n");
		}
		return sb.toString();
	}
}
