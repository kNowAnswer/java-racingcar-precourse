import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PrintStringTest {

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
