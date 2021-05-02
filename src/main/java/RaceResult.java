public class RaceResult {

	private int go;
	private int stop;

	public void report(CarStatus carStatus) {
		if (carStatus.isGo()) {
			this.go += 1;
		}
		if (carStatus.isStop()) {
			this.stop += 1;
		}
	}

	public int getGoCount() {
		return go;
	}

	public int getStopCount() {
		return stop;
	}
}
