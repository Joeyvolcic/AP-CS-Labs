package picturelab;

/**
 * This class contains class (static) methods that will help you test the
 * Picture class methods. Uncomment the methods and the code in the main to
 * test.
 *
 * @author Barbara Ericson
 */
public class PictureTester {

   /**
    * Method to test zeroBlue
    */
   public static void testZeroBlue() {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.zeroBlue();
      beach.explore();
   }
   /**
    * Method to get rid of green and red
    */
   public static void testKeepOnlyBlue() {
	      Picture beach = new Picture("beach.jpg");
	      beach.zeroRed();
	      beach.zeroGreen();
	      beach.explore();
   }
   /**
    * Method to negate colors
    */
   public static void testNegate() {
	   Picture beach = new Picture("beach.jpg");
	   beach.negate();
	   beach.explore();
   }
   /**
    * Method to test GrayScale
    */
   public static void testGrayscale() {
	   Picture beach = new Picture("beach.jpg");
	   beach.grayscale();
	   beach.explore();
   }
   /**
    * Method to make fish easier to see
    */
   public static void testFixWater() {
	   Picture Fish = new Picture("water.jpg"); 
	   Fish.fixUnderwater();
	   Fish.explore();
   }
   /**
    * Method to test mirrorVertical
    */
   public static void testMirrorVertical() {
      Picture caterpillar = new Picture("caterpillar.jpg");
      caterpillar.mirrorVertical();
      caterpillar.explore();
   }
   /**
    * Method to test MirrorHorizontal
    */
   public static void testMirrorHorizontal() {
	      Picture caterpillar = new Picture("caterpillar.jpg");
	      caterpillar.explore();
	      caterpillar.mirrorVertical();
	      caterpillar.explore();
   }
   /**
    * Method to test HorizontalReflection
    */
   public static void testHorizontalReflection() {
	      Picture caterpillar = new Picture("beach.jpg");
	      caterpillar.horizontalReflection();
	      caterpillar.explore();
	}
   /**
    * Method to test mirrorTemple
    */
   public static void testMirrorTemple() {
      Picture temple = new Picture("temple.jpg");
      temple.explore();
      temple.mirrorTemple();
      temple.explore();
   }
/**
    * Method to test edgeDetection
    */
   public static void testEdgeDetection() {
      Picture swan = new Picture("swan.jpg");
      swan.edgeDetection(10);
      swan.explore();
   }
   /**
    * Method to test edgeDetection2
    */
   public static void testEdgeDetection2() {
      Picture swan = new Picture("swan.jpg");
      swan.edgeDetection1(10);
      swan.explore();
   }
   /**
    * Method to test MirrorArms
    */
   public static void testMirrorArms() {
	   Picture snowman = new Picture ("snowman.jpg");
	   snowman.mirrorArms();
	   snowman.explore();
   }
   /**
    * Method to test MirrorGull
    */
   public static void testMirrorGull() {
	   Picture gull = new Picture ("seagull.jpg");
	   gull.mirrorGull();
	   gull.explore();
   }
   /**
    * Method to test mirrorHorizontalBottomToTop
    */
   public static void testHorizontalBotToTop() {
	   Picture bike = new Picture ("redMotorcycle.jpg");
	   bike .mirrorHorizontalBottomToTop();
	   bike.explore();
   }
   
   public static void testCopy()
   {
     Picture canvas = new Picture("redMotorcycle.jpg");
     canvas.createCollage();
     canvas.explore();
   }
   /**
    * Main method for testing. Every class can have a main method in Java
    */
   public static void main(String[] args) {
    // uncomment a call here to run a test
      // and comment out the ones you don't want
      // to run
      //testZeroBlue();
      //testKeepOnlyBlue(); 		//1
      //testKeepOnlyRed();
      //testKeepOnlyGreen();
      //testNegate(); 				//2
      //testGrayscale();			//3
      //testFixWater();				//4
      //testMirrorVertical();		//5
	  //testHorizontalReflection(); //6
	  //testHorizontalBotToTop();	//7
      //testMirrorTemple();	     	//8
      //testMirrorArms();			//9
      //testMirrorGull();			//10
      //testMirrorDiagonal();
      //testCollage();
      testCopy();
      //testEdgeDetection();
      //testEdgeDetection2();
      //testChromakey();
      //testEncodeAndDecode();
      //testGetCountRedOverValue(250);
      //testSetRedToHalfValueInTopHalf();
      //testClearBlueOverValue(200);
      //testGetAverageForColumn(0);
   }
}
