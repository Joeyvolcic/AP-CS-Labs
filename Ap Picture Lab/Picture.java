package picturelab;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * A class that represents a picture. This class inherits from SimplePicture and
 * allows the student to add functionality to the Picture class.
 *
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture {
  ///////////////////// constructors //////////////////////////////////

   /**
    * Constructor that takes no arguments
    */
   public Picture() {
      /* not needed but use it to show students the implicit call to super()
       * child constructors always call a parent constructor 
       */
      super();
   }

   /**
    * Constructor that takes a file name and creates the picture
    *
    * @param fileName the name of the file to create the picture from
    */
   public Picture(String fileName) {
      // let the parent class handle this fileName
      super(fileName);
   }

   /**
    * Constructor that takes a file name and creates the picture
    *
    * @param file the name of the file to create the picture from
    */
   public Picture(java.io.File file) {
      // let the parent class handle this fileName
      super(file);
   }
   
   /**
    * Constructor that takes the width and height
    * 
    * @param height the height of the desired picture
    * @param width the width of the desired picture
    */
   public Picture(int width, int height) {
      // let the parent class handle this width and height
      super(width, height);
   }

   /**
    * Constructor that takes a picture and creates a copy of that picture
    *
    * @param copyPicture the picture to copy
    */
   public Picture(Picture copyPicture) {
      // let the parent class do the copy
      super(copyPicture);
   }

   /**
    * Constructor that takes a buffered image
    *
    * @param image the buffered image to use
    */
   public Picture(BufferedImage image) {
      super(image);
   }

  ////////////////////// methods ///////////////////////////////////////
   /**
    * Method to return a string with information about this picture.
    *
    * @return a string with information about the picture such as fileName,
    * height and width.
    */
   public String toString() {
      String output = "Picture, filename " + getFileName()
              + " height " + getHeight()
              + " width " + getWidth();
      return output;

   }

   /**
    * Method to set the blue to 0
    */
   public void zeroBlue() {
      Pixel[][] pixels = this.getPixels2D();
      for (Pixel[] rowArray : pixels) {
         for (Pixel pixelObj : rowArray) {
            pixelObj.setBlue(0);
         }
      }
   }

   /**
    * Removes all the red from this image.
    */
   public void zeroRed() {    
	   Pixel[][] pixels = this.getPixels2D();
	   for (Pixel[] rowArray : pixels) {
       for (Pixel pixelObj : rowArray) {
          pixelObj.setRed(0);
       }
    }
 }
   /**
    * Negates all color from the image
    */
   public void negate() {    
	   Pixel[][] pixels = this.getPixels2D();
	   for (Pixel[] rowArray : pixels) {
       for (Pixel pixelObj : rowArray) {
          pixelObj.setRed(255-pixelObj.getRed());
          pixelObj.setGreen(255-pixelObj.getGreen());
          pixelObj.setBlue(255-pixelObj.getBlue());
       }
	}
 }
   /**
    * Turns the image grayscale
    */
   public void grayscale() {
	   Pixel[][] pixels = this.getPixels2D();
	   for (Pixel[] rowArray : pixels) {
       for (Pixel pixelObj : rowArray) {
    	   int avg= (pixelObj.getRed() + pixelObj.getBlue() + pixelObj.getGreen()) / 3;
           pixelObj.setRed(avg);
           pixelObj.setGreen(avg);
           pixelObj.setBlue(avg);
        }
       }
   }
  
   public void fixUnderwater() {
	   Pixel[][] pixels = this.getPixels2D();
	   int count = 0;
	   int bluAvg = 0;
	   for (Pixel[] rowArray : pixels) {
       for (Pixel pixelObj : rowArray) {
    	count ++;
    	bluAvg += (pixelObj.getBlue());
    	 
        
        }
       }
	   bluAvg = count / bluAvg;
	  for (Pixel[] rowArray : pixels) {
	       for (Pixel pixelObj : rowArray) {
	    	   int avg= (pixelObj.getRed() + pixelObj.getBlue() + pixelObj.getGreen()) / 3;
	    	   if (pixelObj.getBlue() > avg+45) {
	    		   pixelObj.setRed(237 + pixelObj.getRed());
	               pixelObj.setGreen(16 + pixelObj.getGreen());
	               pixelObj.setBlue(42 + pixelObj.getBlue());
	            }
	    		   
	    		   
   }
	       }
	   }
   

   /**+
    * Removes all the green from this image.
    */
   public void zeroGreen() {
	   Pixel[][] pixels = this.getPixels2D();
	   for (Pixel[] rowArray : pixels) {
       for (Pixel pixelObj : rowArray) {
          pixelObj.setGreen(0);
       }
    }
   }

   /**
    * Method that mirrors the picture around a vertical mirror in the center of
    * the picture from left to right
    */
   public void mirrorVertical()
   {
     Pixel[][] pixels = this.getPixels2D();
     Pixel leftPixel = null;
     Pixel rightPixel = null;
     int width = pixels[0].length;
     for (int row = 0; row < pixels.length; row++)
     {
       for (int col = 0; col < width / 2; col++)
       {
         leftPixel = pixels[row][col];
         rightPixel = pixels[row][width - 1 - col];
         rightPixel.setColor(leftPixel.getColor());
       }
     }
   }
   
   /**
    *  Creates a vertical mirror image of the this picture.
    */
   public void verticalReflection() {
      //TODO: Write this method.
   }
   
   /**
    * Converts this image into a horizontal mirror image of itself.
    */
   public void horizontalReflection() {
	   Pixel[][] pixels = this.getPixels2D();
	      Pixel topPixel = null;
	      Pixel bottomPixel = null;
	      int width = pixels[0].length;
	     for (int col = 0; col < (pixels.length/2); col++) {
	    	  for (int row = 0; row < width; row++) {
	    		  bottomPixel = pixels[ (pixels.length-col-1)][row];
	    		  topPixel = pixels[col][row];
	    		  bottomPixel.setColor(topPixel.getColor());
	         }
	      }
	   }
	   
   /**
    * Mirrors the image from bottom to top
    */
   public void mirrorHorizontalBottomToTop()
   {
       Pixel[][] pixels = this.getPixels2D();
       Pixel topPixel = null;
       Pixel bottomPixel = null;
       int height = pixels.length;
       for (int row = 0; row < height; row++)
       {
           for (int col = 0; col < pixels[0].length; col++)
           {
               topPixel = pixels[row][col];
               bottomPixel = pixels[height - 1 - row][col];
               topPixel.setColor(bottomPixel.getColor());
           }
       }
   }
   

   /**
    * Mirror just part of a picture of a temple
    */
   public void mirrorTemple() {

      int mirrorPoint = 276;
      Pixel leftPixel = null;
      Pixel rightPixel = null;
      int count = 0;
      Pixel[][] pixels = this.getPixels2D();

      // loop through the rows
      for (int row = 27; row < 97; row++) {
         // loop from 13 to just before the mirror point
         for (int col = 13; col < mirrorPoint; col++) {
            leftPixel = pixels[row][col];
            rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
            rightPixel.setColor(leftPixel.getColor());
            count ++;
         }
      }
      System.out.println(count);
   }
   /** Mirrors the arms of the snowman */
   public void mirrorArms()
   {
     int mirrorPoint = 193;
     Pixel topPixel = null;
     Pixel bottomPixel = null;
     Pixel[][] pixels = this.getPixels2D();

     // Left arm
     for (int row = 158; row < mirrorPoint; row++)
     {
       // loop from 13 to just before the mirror point
       for (int col = 103; col < 170; col++)
       {
         topPixel = pixels[row][col];      
         bottomPixel = pixels[mirrorPoint - row + mirrorPoint][col];
         bottomPixel.setColor(topPixel.getColor());
       }
     }
     
     int mirrorPoint2 = 198;
     Pixel topPixel2 = null;
     Pixel bottomPixel2 = null;
     
     // Right arm
     for (int row = 171; row < mirrorPoint2; row++)
     {
       
       for (int col = 239; col < 294; col++)
       {
         topPixel2 = pixels[row][col];      
         bottomPixel2 = pixels[mirrorPoint2 - row + mirrorPoint2][col];
         bottomPixel2.setColor(topPixel2.getColor());
       }
     }
   }
   /**
    * Mirrors the seagull
    */  
   public void mirrorGull()

    {
        int mirrorPoint = 345;
        Pixel rightPixel = null;
        Pixel leftPixel = null;
        Pixel[][] pixels = this.getPixels2D();   
        
        // Seagull
        for (int row = 235; row < 323; row++)
        {
          for (int col = 238; col < mirrorPoint; col++)
          {
            rightPixel = pixels[row][col];      
            leftPixel = pixels[row][mirrorPoint - col + mirrorPoint/3];
            leftPixel.setColor(rightPixel.getColor());
          }
        }
      }
      
   public void copy(Picture fromPic, 
           int startRow, int startCol)
{
Pixel fromPixel = null;
Pixel toPixel = null;
Pixel[][] toPixels = this.getPixels2D();
Pixel[][] fromPixels = fromPic.getPixels2D();
for (int fromRow = 0, toRow = startRow; 
   fromRow < fromPixels.length &&
   toRow < toPixels.length; 
   fromRow++, toRow++)
{
for (int fromCol = 0, toCol = startCol; 
     fromCol < fromPixels[0].length &&
     toCol < toPixels[0].length;  
     fromCol++, toCol++)
{
  fromPixel = fromPixels[fromRow][fromCol];
  toPixel = toPixels[toRow][toCol];
  toPixel.setColor(fromPixel.getColor());
  System.out.println("Fromrow " + fromRow + " toRow " + toRow + " fromCol" + fromCol + " toCol " + toCol);
}
}   
}
      

 

public void copy2(Picture fromPic, int startRow, int endRow, int startCol, int endCol)
{
Pixel fromPixel = null;
Pixel toPixel = null;
Pixel[][] toPixels = this.getPixels2D();
Pixel[][] fromPixels = fromPic.getPixels2D();
for (int fromRow = 0, toRow = startRow; 
   fromRow < fromPixels.length &&
   toRow < endRow;
   fromRow++, toRow++)
{
for (int fromCol = 0, toCol = startCol; 
     fromCol < fromPixels[0].length &&
     toCol < endCol;  
     fromCol++, toCol++)
{
  fromPixel = fromPixels[fromRow][fromCol];
  toPixel = toPixels[toRow][toCol];
  toPixel.setColor(fromPixel.getColor());

}
} 
}

/** Method to create a collage of several pictures */
public void createCollage()
{
Picture beach = new Picture("space1.jpg");
Picture temple = new Picture("space2.jpg");
Picture seagull = new Picture("space3.jpg");
Picture snowman = new Picture("space4.jpg");
this.copy(temple,30,0);
temple.zeroBlue();
this.copy(temple,75,165);
this.copy(snowman,56,23);

Picture beachNoBlue = new Picture(beach);
beach.zeroBlue();
this.copy2(beachNoBlue,10,10,100,50);

Picture beachinverse = new Picture(beach);
beachinverse.negate();
this.copy2(beachinverse, 161, 34, 23, 23);

this.copy(beach,400,0);
this.copy(beach,500,0);



//this.write("collage.jpg");
}

public void myCollage()
{
Picture snowman = new Picture("snowman.jpg");
this.copy2(snowman,10,20, 0, 100);
this.write("mycollage.jpg");
}

   
   /**
    * Method to show large changes in color
    *
    * @param edgeDist the distance for finding edges
    */
public void edgeDetection1(int edgeDist) {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++) {
       for (int col = 0;
               col < pixels[0].length - 1; col++) {
          leftPixel = pixels[row][col];
          rightPixel = pixels[row][col + 1];
          rightColor = rightPixel.getColor();
          if (leftPixel.colorDistance(rightColor)
                  > edgeDist)
             leftPixel.setColor(Color.BLACK);
          else
             leftPixel.setColor(Color.WHITE);
       }
    }
 }
	 
		public void edgeDetection2(int edgeDist)
		{
			Pixel leftPixel = null;
			Pixel rightPixel = null;
			Pixel[][] pixels = this.getPixels2D();
			Color rightColor = null;
			for (int row = 0; row < pixels.length; row++)
			{
				for (int col = 0; col < pixels[0].length - 1; col++)
				{
					leftPixel = pixels[row][col];
					rightPixel = pixels[row][col + 1];
					rightColor = rightPixel.getColor();
					if (leftPixel.colorDistance(rightColor) > edgeDist)
						leftPixel.setColor(Color.BLACK);
					else
						leftPixel.setColor(Color.WHITE);
				}
			}
		}

		/**
		 * Method to show large changes in color, both horizontally and vertically
		 * 
		 * @param edgeDist
		 *          the distance for finding edges
		 */
		public void edgeDetection(int edgeDist)
		{
			Pixel leftPixel = null;
			Pixel nextPixel = null;
			Pixel[][] pixels = this.getPixels2D();
			Color nextColor = null;
			for (int row = 0; row < pixels.length; row++)
			{
				for (int col = 0; col < pixels[0].length; col++)
				{
					if (col < pixels[0].length - 1) {
						leftPixel = pixels[row][col];
						nextPixel = pixels[row][col + 1];
						nextColor = nextPixel.getColor();
						if (leftPixel.colorDistance(nextColor) > edgeDist) {
							leftPixel.setColor(Color.RED);
							continue;
						}
					}
					if (row < pixels.length - 1) {
						nextPixel = pixels[row+1][col];
						nextColor = nextPixel.getColor();
						if (leftPixel.colorDistance(nextColor) > edgeDist) {
							leftPixel.setColor(Color.BLUE);
							continue;
						}
					}
					leftPixel.setColor(Color.BLACK);
				}
			}
		}

   /* Main method for testing - each class in Java can have a main 
    * method 
    */
   public static void main(String[] args) {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.zeroBlue();
      beach.explore();
   }

} // this } is the end of class Picture, put all new methods before this
