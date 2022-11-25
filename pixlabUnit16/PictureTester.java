/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  public static void testKeepOnlyBlue() {
	  Picture beach = new Picture("beach.jpg");
	    beach.explore();
	    beach.keepOnlyBlue();
	    beach.explore();
  }
  public static void testFixUnderwater() {
	  Picture beach = new Picture("water.jpg");
	    beach.fixUnderwater();
	    beach.explore();
  }
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  public static void testMirrorVerticalRightToLeft() {
	  Picture caterpillar = new Picture("caterpillar.jpg");
	    
	    caterpillar.mirrorVerticalRightToLeft();
	    caterpillar.explore();
  }
  public static void testMirrorHorizontal() {
	  Picture motorcycle = new Picture("redMotorcycle.jpg");
	  motorcycle.mirrorHorizontal();
	  motorcycle.explore();
  }
  public static void testMirrorHorizontalBotToTop() {
	  Picture motorcycle = new Picture("redMotorcycle.jpg");
	  motorcycle.mirrorHorizontalBotToTop();
	  motorcycle.explore();
  }
  public static void testMirrorDiagonal() {
	  Picture beach = new Picture("beach.jpg");
	  beach.mirrorDiagonal();
	  beach.explore();
  }
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  public static void testMirrorArms() {
	  Picture snowman = new Picture("snowman.jpg");
	  snowman.explore();
	  snowman.mirrorArms();
	  snowman.explore();
	  }
  public static void testMirrorGull() {
	  Picture seagull = new Picture("seagull.jpg");
	  seagull.explore();
	  seagull.mirrorGull();
	  seagull.explore();
  }
  public static void testNegate() {
	  Picture temple = new Picture("temple.jpg");
	  temple.negate();
	  temple.explore();
  }
  
  public static void testGrayscale() {
	  Picture temple = new Picture("beach.jpg");
	  temple.grayscale();
	  temple.explore();
  }
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    Picture seagull1 = new Picture("seagull.jpg");
    seagull1.negate();
    canvas.copy(seagull1, 235, 325, 238, 345, 30, 20);
    Picture seagull2 = new Picture("seagull.jpg");
    seagull2.grayScale();
    seagull2.mirrorDiagonal();
    canvas.copy(seagull2, 235, 325, 238, 345, 200, 200);
    Picture seagull3 = new Picture("seagull.jpg");
    seagull3.zeroBlue();
    canvas.copy(seagull3, 235, 325, 238, 345, 400, 400);
    canvas.explore();
  }
  public static void testCopy() {
	  Picture swan = new Picture("seagull.jpg");
	  swan.copy(swan, 235, 325, 238, 345, 30, 20);
	  swan.explore();
  }
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
   // // to run
  //  testZeroBlue();
  DigitalPicture p = new Picture();
   // testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
   // testNegate();
   // testGrayscale();
   // testFixUnderwater();
   // testMirrorVertical();
 // testMirrorVerticalRightToLeft();
   // testMirrorHorizontal();
   // testMirrorHorizontalBotToTop();
  //testMirrorDiagonal();
   // testMirrorTemple();
   // testMirrorArms();
   // testMirrorGull();
    //testMirrorDiagonal();
   // testCollage();
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
