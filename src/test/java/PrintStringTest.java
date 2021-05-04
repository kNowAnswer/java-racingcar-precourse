import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PrintStringTest {

	@Test
	@DisplayName("RaceResults 횟수에 따른 결과 출력")
	void printRaceResultsByIndex() {
		Car car1 = new Car("A", Arrays.asList(1, 2, 3, 4));
		Car car2 = new Car("B", Arrays.asList(5, 6, 7, 1));
		Car car3 = new Car("C", Arrays.asList(3, 4, 3, 4));
		Cars cars = new Cars(Arrays.asList(car1, car2, car3));
		RaceResults raceResults = cars.race();
		for (int i = 1; i <= 4; i++) {
			System.out.println(raceResults.printRaceResult(i));
		}
		assertThat(raceResults.printRaceResult(1)).contains("A:").contains("B:-").contains("C:");
		assertThat(raceResults.printRaceResult(2)).contains("A:").contains("B:--").contains("C:-");
		assertThat(raceResults.printRaceResult(3)).contains("A:").contains("B:---").contains("C:-");
		assertThat(raceResults.printRaceResult(4)).contains("A:-").contains("B:---").contains("C:--");
	}

	@Test
	@DisplayName("RaceResults 결과 출력")
	void printRaceResults() {
		Car car1 = new Car("A", Arrays.asList(1, 2, 3, 4));
		Car car2 = new Car("B", Arrays.asList(5, 6, 7, 1));
		Car car3 = new Car("C", Arrays.asList(3, 4, 3, 4));
		Cars cars = new Cars(Arrays.asList(car1, car2, car3));
		RaceResults raceResults = cars.race();
		System.out.println(raceResults.printRaceResult());
		assertThat(raceResults.printRaceResult()).contains("A:-").contains("B:---").contains("C:--");
	}

	@Test
	@DisplayName("시도 횟수에 따른 차 Racing 결과 출력")
	void printRaceResultByIndex() {
		Car pobi = new Car("pobi", Arrays.asList(3, 3, 4, 4, 4));
		RaceResult pobiResult = pobi.race();
		assertThat(pobiResult.printRaceResult(1)).isEqualTo("pobi:");
		assertThat(pobiResult.printRaceResult(2)).isEqualTo("pobi:");
		assertThat(pobiResult.printRaceResult(3)).isEqualTo("pobi:-");
		assertThat(pobiResult.printRaceResult(4)).isEqualTo("pobi:--");
		assertThat(pobiResult.printRaceResult(5)).isEqualTo("pobi:---");
	}

	@Test
	@DisplayName("차 Racing 결과 출력")
	void printRaceResult() {
		Car pobi = new Car("pobi", Arrays.asList(3, 3, 4, 4, 4));
		RaceResult pobiResult = pobi.race();
		assertThat(pobiResult.printRaceResult()).isEqualTo("pobi:---");
	}

}
