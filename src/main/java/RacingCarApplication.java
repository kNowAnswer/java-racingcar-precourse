import java.util.Scanner;

public class RacingCarApplication {
	public static void main(String[] args) {

		System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
		Scanner scanner = new Scanner(System.in);
		String userCars = scanner.nextLine();
		String[] carsArray = userCars.split(",");
		System.out.println("시도할 회수는 몇회인가요?");
		int count = scanner.nextInt();
		System.out.println();

		Cars cars = new Cars();
		for (String carName : carsArray) {
			cars.add(new Car(carName, count));
		}
		RaceResults raceResults = cars.race();
		System.out.println("실행 결과");
		for (int i = 1; i <= count; i++) {
			System.out.println(raceResults.printRaceResult(i));
		}
		raceResults.printWinners();

	}
}
