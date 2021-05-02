import static org.assertj.core.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RandomNumberTest {
	@Test
	@DisplayName("0 ~ 9 랜덤 숫자 확인")
	void makeZeroToNineNumber() {
		Random random = new Random();
		assertThat(random.nextInt(10)).isBetween(0, 9);
	}
}
