import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarsTest {
	@Test
	@DisplayName("입력 숫자에 따른 Go/Stop Count 테스트: 2 Go, 3 Stop")
	void checkCarsGoStopCount1() {
		Cars cars = new Cars(Arrays.asList(1, 2, 3, 4, 5));
		RaceResult raceResult = cars.race();
		assertThat(raceResult.getGoCount()).isEqualTo(2);
		assertThat(raceResult.getStopCount()).isEqualTo(3);
	}

	@Test
	@DisplayName("입력 숫자에 따른 Go/Stop Count 테스트: 3 Go, 2 Stop")
	void checkCarsGoStopCount2() {
		Cars cars = new Cars(Arrays.asList(0, 5, 7, 2, 5));
		RaceResult raceResult = cars.race();
		assertThat(raceResult.getGoCount()).isEqualTo(3);
		assertThat(raceResult.getStopCount()).isEqualTo(2);
	}
}
