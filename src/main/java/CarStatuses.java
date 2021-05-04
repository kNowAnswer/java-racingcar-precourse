import java.util.ArrayList;
import java.util.List;

public class CarStatuses {
	private List<CarStatus> carStatuses;

	public CarStatuses() {
		this.carStatuses = new ArrayList<>();
	}

	public List<CarStatus> getCarStatuses() {
		return carStatuses;
	}

	public void add(CarStatus carStatus) {
		this.carStatuses.add(carStatus);
	}

	public CarStatus get(int index) {
		return this.carStatuses.get(index);
	}
}
