
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;

import javax.swing.JFrame;

public class GraphicsRunner extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public GraphicsRunner()
	{
		super("Graphics Runner");
		
		setSize(WIDTH,HEIGHT);

		
		
		getContentPane().add(new MyFirstJavaDrawing());
		
		setVisible(true);
		
	}
	
	public static void main( String args[] )
	{
		GraphicsRunner run = new GraphicsRunner();
	}
}
