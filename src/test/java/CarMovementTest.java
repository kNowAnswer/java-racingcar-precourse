import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarMovementTest {

	@Test
	@DisplayName("숫자에 따른 자동차 상태 테스트 - Out of Range")
	void carStatusOutOfRange() {
		assertThat(new CarMovement(0, 11).getStatus()).isEqualTo(CarStatus.STOP);
	}

	@Test
	@DisplayName("숫자에 따른 자동차 상태 테스트 - Stop")
	void carStatusStop() {
		assertThat(new CarMovement(0, 3).getStatus()).isEqualTo(CarStatus.STOP);
	}

	@Test
	@DisplayName("숫자에 따른 자동차 상태 테스트 - Go")
	void carStatusGo() {
		assertThat(new CarMovement(0, 4).getStatus()).isEqualTo(CarStatus.GO);
	}
}
