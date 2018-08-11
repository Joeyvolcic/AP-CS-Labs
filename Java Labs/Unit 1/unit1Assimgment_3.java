package unit1assignments;

public class unit1Assimgment_3 {

	public static void main(String [] args){
		
		System.out.println("*******************************************");
		System.out.println("              mesure converter             ");
		System.out.println("*******************************************");
		
		
		
		    double miles = 1;                  
	        double feet = 1;                   
	        double feetPerMile = 5280; 
	        double kilomiters = 1;
	        double milesperkilomiter = 0.621371;
	        double pound = 1;
	        double kilogram = 1;
	        double gallon = 1;
	        double liter = 1;
	        double literspergallon = 3.78541;
	        double gallonperliter = 0.264172;		
	        double kilogramperpound = 0.453592;	
	        double poundperkilogram = 2.20462;
	        double kilometerspermiles = 1.60934;
	        double pascal = 1;
	        double torr = 1;
	        double torrperpascal = 0.00750062;
	        double pascalspertorr = 133.322;
	       	System.out.println(miles + " miles = " + (miles*feetPerMile)+ " feet ");
	       	System.out.println(feet + " feet = " + (feet/feetPerMile)+ " mile");
	       	System.out.println( );
	       	System.out.println(kilomiters+ " Kilometer = " + (kilomiters*milesperkilomiter)+" mile");
	       	System.out.println( miles +" mile = " + (miles*kilometerspermiles)+ " kilometers");
	    	System.out.println( );
	       	System.out.println( pound +" pound = " + (pound*poundperkilogram )+ " kilogram");
	       	System.out.println(kilogram + " kilogram = "+ (kilogram*kilogramperpound)+ " pound");
	    	System.out.println( );
	     	System.out.println(liter + "liter = " + (liter*gallonperliter)+ " gallon");
		    System.out.println(gallon + "gallon = " + (gallon*literspergallon)+  "liter");
			System.out.println( );
		    System.out.println(pascal + "pascal = "+ (pascal*torrperpascal)+ " torr");
		    System.out.println(torr + "torr = " + (torr*pascalspertorr)+ " pascal");
		
		
		
		
		
		
		
	}
}
