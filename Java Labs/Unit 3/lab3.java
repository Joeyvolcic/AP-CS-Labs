import java.util.Scanner;
 
public class lab3 {
                public static void main(String [] args) {
                               
                                System.out.println("This program will peform arthmitcs operatinos on two numbers you enter");
                                Scanner  myScan = new Scanner(System.in);
                                String INT = "";  
                                String Selection = "";
                                System.out.print("Enter Two intigers seperated by a space: ");
                                INT = myScan.nextLine();
                                int num, num1;
                               
                                num = Integer.parseInt(INT.substring(0,INT.indexOf(" ")));
                                num1 = Integer.parseInt(INT.substring(INT.indexOf(" ")+1));
                               
                                System.out.println("Select an option listed on the menus");
                                System.out.println("[A] Addition");
                                System.out.println("[S] Subtraction");
                                System.out.println("[M] Multiplication");
                                System.out.println("[D] Division");
                                System.out.println("[R] Remainder");
                                System.out.println("[Q] Quit");
                               
                                System.out.print("Enter selection A S M D R Q: " + "");
                                Selection = myScan.nextLine();
                                char S = Selection.charAt(0);
                               
                                if(S == 'A'|| S == 'a'){
                                System.out.println("Your selection was choice "+ S + " for Addition");
                                System.out.print(num + " plus " + num1 + " equals " + (num + num1));
                                }else if(S == 'S'|| S == 's'){
                                                System.out.println("Your selection was choice "+ S + " for Subtraction" );
                                                System.out.print(num + " minus " + num1 + " equals " + (num - num1));
                                }else if(S == 'M'|| S == 'm'){
                                                System.out.println("Your selection was choice "+ S + " for Multiplication" );
                                                System.out.print(num + " times " + num1 + " equals " + (num * num1));
                                }else if(S == 'D'|| S == 'd'){
                                                System.out.println("Your selection was choice "+ S + " for Division" );
                                                System.out.print(num + " divide " + num1 + " eqauls " + (num / num1));
                                }else if(S == 'R'|| S == 'r'){
                                                System.out.println("Your selection was choice "+ S + " for Remainder" );
                                                System.out.print(num + " mod " + num1 + " equals " + (num % num1));
                                }else if(S == 'Q'|| S == 'q'){
                                                System.out.println("Your selection was choice "+ S + " for Quit" );
                                                System.out.print("Program Ended");
                                }
                               
               
                               
                               
                               
                               
                               
                               
                               
                               
                               
                               
                               
                               
                               
               
                               
                               
                               
                }
 
}