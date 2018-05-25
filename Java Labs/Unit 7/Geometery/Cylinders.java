
public class cylinders {
	private static double R;
	private static double H;
	
	public cylinders(int radius, int height) {
		R = radius;
		H = height;
	}
	public static double cylinderVolume(double r, double h) {
		R = r;
		H = h;
		double volume = (3.1415 * (Math.pow(2, R)) * H);
		return volume;
	}
	public static double cyllinderSurface(double r, double h) {
		R = r;
		H = h;
		double surface = (2 * ((3.1415) * H) +  (3.1415 * (Math.pow(2, R))));
		return surface;
	}
}
