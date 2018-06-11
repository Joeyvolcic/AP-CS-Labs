import java.util.Scanner;

public class lab6 {

public static void main(String[] args)
{
Scanner myScan = new Scanner(System.in);
String entery = "";
String nums = "";
int choice = 1;
int num1 = 0;
int num = 0;
int gcd = 1;

while(0 < choice && choice < 3) {
System.out.println("what would you like to do");
System.out.println("[1]GCD");
System.out.println("[2]Prime number");
System.out.println("[3]Quit");
System.out.print("Enter a selection: ");
entery = myScan.nextLine();
choice = Integer.parseInt(entery);
if(choice == 1)
{
System.out.print("Enter two numbers seperated by a space and I will find the GCD: ");
String INT = myScan.nextLine();
num = Integer.parseInt(INT.substring(0,INT.indexOf(" ")));
num1 = Integer.parseInt(INT.substring(INT.indexOf(" ")+1));
for(int r = 1; r <= num; r +=1) {
if ( num % r == 0 && num1 % r == 0) {
	 gcd = r;
}
}
System.out.println("The GCD is: " + gcd);
}
else if (choice == 2)
{
System.out.print("Enter a number and I will tell if it is a prime number: ");
nums = myScan.nextLine();
int num3 = Integer.parseInt(nums);

for(int j = 2; j < num3; j++) {
	if( num3 % j == 0) {
		System.out.println("Not prime");
		break;
	}
	if (j == num3 -1)
	{
	System.out.println("Prime");	
	}
	
}
	
	
	
}
else
{
System.out.print("Quit");
nums = myScan.nextLine();
}
}
}
}


