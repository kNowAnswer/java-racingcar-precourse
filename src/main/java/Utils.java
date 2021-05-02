import java.util.Random;

public class Utils {

	public static final int MAX = 10;

	public static int makeRandomNumber() {
		Random random = new Random();
		return random.nextInt(MAX);
	}
}
