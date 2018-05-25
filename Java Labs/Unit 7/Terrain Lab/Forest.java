
public class Forest extends Terrain {
	private int tree;
	public Forest(int l, int w, int tree) {
		super(l, w);
		this.tree = tree;
	}
	public int getTree() {
		return tree;
	}
	public void setTree(int tree) {
		this.tree = tree;
	}

}
