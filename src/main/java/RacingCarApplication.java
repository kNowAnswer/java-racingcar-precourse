import java.util.Scanner;

public class RacingCarApplication {
	private static final String INPUT_MSG = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
	private static final String TRY_MSG = "시도할 회수는 몇회인가요?";
	private static final String RESULT_MSG = "실행 결과";

	public static void main(String[] args) {

		System.out.println(INPUT_MSG);
		Scanner scanner = new Scanner(System.in);
		String userCars = scanner.nextLine();
		String[] carsArray = userCars.split(",");
		System.out.println(TRY_MSG);
		int count = scanner.nextInt();
		System.out.println();

		Cars cars = new Cars();
		for (String carName : carsArray) {
			cars.add(new Car(carName, count));
		}
		RaceResults raceResults = cars.race();
		System.out.println(RESULT_MSG);
		for (int i = 1; i <= count; i++) {
			System.out.println(raceResults.printRaceResult(i));
		}
		raceResults.printWinners();

	}
}
