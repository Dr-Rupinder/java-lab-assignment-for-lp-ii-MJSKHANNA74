/*Implement a command-line calculator that takes arithmetic expressions as command-line
arguments and evaluates them.
Support basic arithmetic operations like addition, subtraction, multiplication, and
division. For example: java Calculator 5 + 3 */
package lp2;
import java.util.*;
 class exp2a{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		if(args[1].charAt(0)=='+') {
			int sum=Integer.parseInt(args[0])+Integer.parseInt(args[2]);
			System.out.println("Addition of "+args[0]+" and "+args[2]+" is "+sum);
		}
		else if(args[1].charAt(0)=='-') {
			int sub=Integer.parseInt(args[0])-Integer.parseInt(args[2]);
			System.out.println("Subtraction of "+args[0]+" and "+args[2]+" is "+sub);
		}
		else if(args[1].charAt(0)=='*') {
			int mul=Integer.parseInt(args[0])*Integer.parseInt(args[2]);
			System.out.println("Multiplication of "+args[0]+" and "+args[2]+" is "+mul);
		}
		else if(args[1].charAt(0)=='/') {
			int div=Integer.parseInt(args[0])/Integer.parseInt(args[2]);
			System.out.println("Division of "+args[0]+" and "+args[2]+" is "+div);
		}
		else {
			System.out.println("Your given command line argument is invalid");
		}

	}

}

