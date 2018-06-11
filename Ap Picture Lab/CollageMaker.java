package picturelab;

/**
 * Contains various methods for creating different kinds of collages.
 * 
 * 
 * @author Barbara Ericson - Original Collage and Picture code, some of which was refactored into this class.
 * @author L. LaSpina, Bethpage High School 
 */
public class CollageMaker {
   /**
    * A pair of images is used to create a 4 by 4 collage. If the two images are A and B, then
    * the image created is AB
    *                      BA
    * 
    * @param p1 The first image, to be placed in the top left and bottom right of the output image.
    * @param p2 The second image, to be placed in the top right and bottom left of the output image.
    *  The two images do not need to have the same dimensions, but the resulting image will look better if they do.
    * @return A 2 by 2 collage of the two images with height and width equal to the sum of the heights and width of p1 and p2.
    */
   public static Picture create2By2Collage(Picture p1, Picture p2) {
      //TODO: Change the dimensions of the canvas object below to match the comments.
      //Add the images to the canvas using the copy method.
      Picture canvas = new Picture(100,100); 
      return canvas;
   }
   
   /**
    * The given picture is tinted in various ways to create 9 different images
    * and these are assembled into a three by three pattern,
    * @param p The starting image
    * @return A new image with dimensions 3 X width and height of the original.
    */
   public static Picture create3By3TintedCollage(Picture p) {
      int w = p.getWidth();
      int h = p.getHeight();
      Picture canvas = new Picture(w*3, h*3);
      //TODO - Add the tinted version of p to the canvas using copy method.      
      return canvas;
   }

   /**
    * Creates a two by two collage consisting of the original image and a horizontal reflection 
    * @param image The source image
    * @return An image with twice the width and height of image which includes 4 copies of the image, two of which are
    * mirror images.
    */
   public static Picture create2By2Mirror(Picture image) {
      Picture mirrorImage = new Picture(image);
      //TODO: relflect the mirrorImage and then copy both image and mirrorImage to a new Canvas.
      return mirrorImage;
   }
   
   /**
    * The idea of this method is to give students the chance to be creative and see what functions they can create
    * using the tools that have been developed.
    * @param image1 Source image
    * @param image2 Second source image
    * @return A new image that will wither be tinted reflections or just various tints.
    */
   public static Picture createRandomCollage(Picture image1, Picture image2) {
      //TODO - Get creative.
      return image1;
   }
   
   
   /**
    * Method to create a collage of several pictures where the names have been hard coded for demonstration purposes.
    * @return A new Picture consisting of couple of images brought together.
    */
   public static Picture createDemoCollage() {
      Picture flower1 = new Picture("flower1.jpg");
      Picture flower2 = new Picture("flower2.jpg");
      Picture canvas = new Picture("640x480.jpg");
      canvas.copy(flower1, 0, 0);
      canvas.copy(flower2, 100, 0);
      canvas.copy(flower1, 200, 0);
      Picture flowerNoBlue = new Picture(flower2);
      flowerNoBlue.zeroBlue();
      canvas.copy(flowerNoBlue, 300, 0);
      canvas.copy(flower1, 400, 0);
      canvas.copy(flower2, 500, 0);
      canvas.mirrorVertical();
      return canvas;
   }

   public static void main(String[] args) {
      //We can use main to test methods in this class.
      Picture p = new Picture("flower1.jpg").scale(0.5, 0.5);
      p.explore();
      
      Picture collage = create3By3TintedCollage(p);
      collage.explore();
   }
}
