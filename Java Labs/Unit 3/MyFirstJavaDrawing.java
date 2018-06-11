
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class MyFirstJavaDrawing extends Canvas
{
   public MyFirstJavaDrawing()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Drawing LAB ", 35, 35 );
      window.setColor(Color.YELLOW);

      window.fillOval(300, 100, 200, 100);
      //Fill in your drawing code here.
      
   }

  
}