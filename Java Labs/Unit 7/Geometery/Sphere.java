
public class Sphere {

	private static double R;
	private static double H;
	public Sphere(int radius) {
		R = radius;
	
	}
	public static double sphereVolume(double r) {
		R = r;
		double volume;
		volume = (Math.pow(3, R) * ((3.1415 * 4) / 3)); 
		return volume;
	}

	public static double sphereSurface( double r) {
		R = r;
	 double surfaceArea = (4 * (3.1415) * Math.pow(2, R));
	 return surfaceArea;
	}
}
