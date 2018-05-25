
/**
 * Blank terrain.
 * 
 * 
 */
public class Terrain{

	private int length, width;

	public Terrain(int l, int w)
	{
		length = l;
		width = w;
	}


	public String terrainSize()
	{
		
		return "land has dimensions " + length + " X " + width;
	}
}


