
public class Mountain extends Terrain{
		private int mountains;
	public Mountain(int l, int w, int mountains) {
		super(l, w);
		this.mountains = mountains;
	}
	public int getMountains() {
		return mountains;
	}
	public void setMountains(int mountains) {
		this.mountains = mountains;
	}
}
