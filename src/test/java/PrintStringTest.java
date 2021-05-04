import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PrintStringTest {

	@Test
	@DisplayName("차 Racing 결과 출력")
	void printRaceResult() {
		Car pobi = new Car("pobi", Arrays.asList(3, 3, 4, 4, 4));
		RaceResult pobiResult = pobi.race();
		assertThat(pobiResult.printRaceResult()).isEqualTo("pobi:---");
	}

}
