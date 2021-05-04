public class RaceResult {

	private static final String goMark = "-";
	private String name;
	private int go;
	private int stop;
	private CarStatuses carStatuses;

	public RaceResult(String name) {
		this.name = name;
		this.carStatuses = new CarStatuses();
	}

	public void report(CarStatus carStatus) {
		if (carStatus.isGo()) {
			this.go += 1;
		}
		if (carStatus.isStop()) {
			this.stop += 1;
		}
		carStatuses.add(carStatus);
	}

	public String getName() {
		return name;
	}

	public int getGoCount() {
		return go;
	}

	public int getStopCount() {
		return stop;
	}

	public String printRaceResult() {
		StringBuilder sb = new StringBuilder();
		sb.append(getName());
		sb.append(":");
		for (int i = 0; i < getGoCount(); i++) {
			sb.append(goMark);
		}
		return sb.toString();
	}

	public String printRaceResult(int index) {
		StringBuilder sb = new StringBuilder();
		sb.append(getName());
		sb.append(":");
		for (int i = 0; i < index; i++) {
			sb.append(carStatuses.get(i).isGo() ? goMark : "");
		}
		return sb.toString();
	}
}
