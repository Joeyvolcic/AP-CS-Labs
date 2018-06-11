
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
      setSize(400,400);
      setBackground(Color.CYAN);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Radio tower ", 35, 35 );
      window.setColor(Color.BLACK);
      window.drawLine(300,500,400,100);
      window.drawLine(500,500,400,100);
      window.drawLine(300,500,450,300);
      window.drawLine(500,500,350,300);
      window.drawLine(350,300,450,300);
      window.drawLine(375,200,450,300);
      window.drawLine(350,300,425,200);
      window.drawLine(375,200,425,200);
      window.setColor(Color.RED);
      window.fillOval(395,95,10,10);
      window.drawArc(365,78,40,40,90,180);
      window.drawRect(100,100,400,400);
      
}
      //Fill in your drawing code here.
      
   }

  
