

/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 * 
 */
public class Calculations
{
    public static void main(String[ ] args)
    {
       
    	int a=25;
    	int b=9;
    	int c=16;
    	
    	double A=43.21;
    	double B=3.14;
    	double C=5;
    
    	
    	// Addition
        System.out.println("Addition");
        System.out.println( a +" + "+ b+ " = " + (a + b) );
        System.out.println( A + " + " + B + " + " + C + " = " + (A + B + C) );
        //System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.println(c + " - " + b + " - " + a + " = " + (c - b - a) );
        System.out.println(B + " - " + C +  " = " + (B - C) );
        //System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println(a + " * " + b + " = " + (a * b) ); 
        System.out.println(B + " * " + C + " * " + C + " = " +(B * C * C) );
        //System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println(b + " / " + a + " = " + (b / a) );
        System.out.println(A + " / " + C + " = " + (A / C) );
        //System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.println(c + " % " + b + " = " + (c % b) );
        System.out.println(C + " % " + B + " = "+ (C % B) );
        //System.out.println();
      
        System.out.println(a + "*" + a +  "/" + b + "-" + c + "=" + (a*a/b-c));
        System.out.println(b + "-" + b + "/" + c + "*" + a + "=" +(b % b/c + a));
        
        
        System.out.println(15 / 2.5 * -2 +10 / 5);
        System.out.println(234 % 6 % 12 + 3);
        System.out.println((46.2 / 11) - 3 + 24 % (17 - 2 * 3));
        System.out.println(480 / 10 / 12 + 200 *.5 - 20 % 8);
        
    } // end of main method
} // end of class
