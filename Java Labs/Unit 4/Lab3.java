
public class Lab3 {
	private float a,b,c,d;
	public Lab3(float w, float x, float y, float z) {
		a = w;	b = x;	c = y; 	d = z;
	}
	public double calcSlope() {
		return(double)(d - b)/(c - a);
	}
	public double calcDistance() {
		return(double)(Math.sqrt(Math.pow(Math.abs(c - a ), 2) + (Math.pow(Math.abs(d - b), 2))));		
	}
	public String calcMid() {
		double A, B;
		A = ((a + c)/2);
		B = ((b + d)/2);
		return(A + ", "+ B); 
		
	}
}





