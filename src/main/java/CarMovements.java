import java.util.ArrayList;
import java.util.List;

public class CarMovements {
	private List<CarMovement> carMovements;

	public CarMovements() {
		this.carMovements = new ArrayList<>();
	}

	public List<CarMovement> getCarMovements() {
		return carMovements;
	}

	public void add(CarMovement carMovement) {
		this.carMovements.add(carMovement);
	}
}
