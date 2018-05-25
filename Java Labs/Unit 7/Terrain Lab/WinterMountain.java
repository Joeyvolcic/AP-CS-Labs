
public class wintermountain extends Mountain {
		private int temp;
	public wintermountain(int l, int w,int mountains, int temp) {
		super(l, w, mountains);
		this.temp = temp;
	}
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}

}
