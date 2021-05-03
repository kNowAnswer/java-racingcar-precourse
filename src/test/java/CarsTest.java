import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarsTest {
	@Test
	@DisplayName("여러 자동차의 전진/멈춤 확인")
	void carsGoStop() {
		Car car1 = new Car("A", Arrays.asList(1, 2, 3, 4));
		Car car2 = new Car("B", Arrays.asList(5, 6, 7, 1));
		Car car3 = new Car("C", Arrays.asList(3, 4, 3, 4));
		Cars cars = new Cars(Arrays.asList(car1, car2 ,car3));
		RaceResults raceResults = cars.race();
		assertThat(raceResults.getResult("A").getGoCount()).isEqualTo(1);
		assertThat(raceResults.getResult("A").getStopCount()).isEqualTo(3);
		assertThat(raceResults.getResult("B").getGoCount()).isEqualTo(3);
		assertThat(raceResults.getResult("B").getStopCount()).isEqualTo(1);
		assertThat(raceResults.getResult("C").getGoCount()).isEqualTo(2);
		assertThat(raceResults.getResult("C").getStopCount()).isEqualTo(2);
	}
}