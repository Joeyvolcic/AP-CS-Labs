package picturelab;

import java.awt.Color;

/**
 * Various static methods for the manipulation, analysis, and scaling of pictures are found here. 
 * 
 * @author Leon LaSpina, Bethpage High School
 */

public class PictureUtils {

   /**
    * Reduces the picture to the given dimensions
    * @param scaleMe The original image to be resized.
    * @param width The desired width of the output image.
    * @param height The desired height of the output image
    * @return A new image that has been scaled to the given dimensions.
    */
   public static Picture scaleTo(Picture scaleMe, int width, int height) {
      throw new java.lang.UnsupportedOperationException("I still need to write this.");
   }
   
   /**
    * Used to resize an image where the width and height are changed by the same scale factor.
    * @param scaleMe The original image to be resized.
    * @param width The desired width of the output image.
    * @return A new image that has been scaled to the given width, where the height has
    *          been adjusted by the same ratio.
    */
   public static Picture scaleToKeepAspectratio(Picture scaleMe, int width) {
      throw new java.lang.UnsupportedOperationException("I still need to write this.");
   }
   
   /**
    * Computes the average color
    * @param p
    * @return 
    */
   public static int averageBrightness(Picture p) {
      throw new java.lang.UnsupportedOperationException("I still need to write this.");
   }
   
   /**
    * Computes the average red, green, and blue values of all pixels in the given image.
    * @param image The source picture to analyze.
    * @return An "average color" created by instantiating a color object with the average values of red, green and blue.
    */
   public static Color averageColor(Picture image) {
      throw new java.lang.UnsupportedOperationException("I still need to write this.");
   }
   
   /**
    * Averages two images together.
    * @param image1
    * @param image2
    * @return 
    */
   public static Picture blend(Picture image1, Picture image2) {
      if(image1.getHeight()!=image2.getHeight() ||
         image1.getWidth() != image2.getWidth())
         throw new IllegalArgumentException("Dimension mismatch error: Cannot blend two images with different sizes.");
      
      throw new java.lang.UnsupportedOperationException("I still need to write this.");
   }
}
