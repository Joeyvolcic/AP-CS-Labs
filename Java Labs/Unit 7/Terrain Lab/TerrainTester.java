
public class TerrainTester {
	public static void main(String []args) {
		Forest f = new Forest(100, 300, 70);
		Mountain m = new Mountain(200, 100, 10);
		wintermountain wm = new wintermountain(210,90,5,-10);
		System.out.println("The forest " + f.terrainSize() + " and has " + f.getTree() + " trees");
		System.out.println("The Mountain " + m.terrainSize() + " and has " + m.getMountains() + " mountains");
		System.out.println("The Winter Mountain" + wm.terrainSize() + " and has " + wm.getMountains() + " degrees celcius and has " + wm.getMountains() + " mountains");
	}
}
