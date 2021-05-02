import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RandomNumberTest {
	@Test
	@DisplayName("0 ~ 9 랜덤 숫자 확인")
	void makeZeroToNineNumber() {
		assertThat(Utils.makeRandomNumber()).isBetween(0, 9);
	}
}
