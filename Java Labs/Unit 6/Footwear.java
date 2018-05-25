import java.util.ArrayList;
import java.util.Scanner; 
import java.io.File; 
import java.io.IOException; 

public class Footwear{
		 	public static void main(String[] args) throws IOException { 
		 		ArrayList <String> ShoeType  = new ArrayList<String>();
		 		ArrayList <Double> size  = new ArrayList<Double>();
		 		ArrayList <Integer> id  = new ArrayList<Integer>();
		 		ArrayList <String> colour  = new ArrayList<String>();
		 		ArrayList <Object> shoe  = new ArrayList<Object>();

		 		
		 		String token = "";
		 		String token2 = "";  
		 		String token3 = "";  
		 		String token4 = ""; 
		 		int count = 0;
		 		Scanner input = new Scanner(System.in);
		 		Scanner inFile = new Scanner(new File("footwear.txt"));
		 		while (inFile.hasNext()) { 
		 			token = inFile.next();
		 			token2 = inFile.next();
		 			token3 = inFile.next();
		 			token4 = inFile.next();
		 			ShoeType.add(token);
		 			size.add(Double.parseDouble(token2));
		 			id.add(Integer.parseInt(token3));
		 			colour.add(token4);
		 			new Footwear(ShoeType.get(count), size.get(count), id.get(count), token4);
		 			shoe.add(new Footwear(ShoeType.get(count), size.get(count), id.get(count), colour.get(count)));
		 			count++;
		 			
		 		} 
		 		inFile.close();
		 			System.out.print(shoe.toString());
		 			for(int a = 0; a <shoe.size(); a++) {
		 				if(ShoeType.get(a).equals("Boot")) {
		 					System.out.println(shoe.get(a));
		 				}
		 			}
		 			for(int a = 0; a <shoe.size(); a++) {
		 				if(ShoeType.get(a).equals("Athletic")) {
		 					colour.set(a,"Blue");
		 					shoe.set(a, new Footwear(ShoeType.get(a), size.get(a), id.get(a),colour.get(a)));
		 				}
		 			}
		 			System.out.print(shoe.toString());
		 		}

	private String myStyle;
	private double mySize;
	private Integer mySKU;
	private String myColor;
	/**
	 * Constructor
	 * @param myStyle
	 * @param mySize
	 * @param integer
	 */
	 public Footwear(String myStyle, double mySize, Integer integer, String myColor){
		 this.myStyle = myStyle;
		 this.mySize = mySize;
		 this.mySKU = integer;
		 this.myColor = myColor;
	 }
	 
	 /**
	  * accessor method for the instance variable myStyle
	  * @param myStyle
	  * @return
	  */
	 public String getStyle(){
		 return  this.myStyle;
	 }
	 
	 /**
	  * accessor method for the instance variable mySize
	  * @param mySize
	  * @return
	  */
	 public double getSize(){
		 return  this.mySize;
	 }
	 
	 /**
	  * accessor method for the instance variable mySKU
	  * @param mySKU
	  * @return
	  */
	 public Integer getSKU(){
		 return  this.mySKU;
	 }
	 
	 /**
	  * method that returns the word "unspecified"
	  * @return
	  */
	 public String getColor(){
		 return this.myColor;
	 }
	 
	 /**
	  * method that prints out the size of the shoes (including 1/2 sizes)
	  * @return
	  */
	 public String printSize(){
		 if((int)(mySize) == mySize){
			 return "size " + (int)mySize;
		 }
		 else return "size " + (int)mySize + "-1/2";
	 }
	 
	 /**
	  * method that allows the class to print out the shoe type and size
	  */
	 public String toString(){
		
			 return getSKU() + " - " + getStyle() + " (" + printSize() + ") - Color: " + getColor() + System.lineSeparator();
	 }
	}


