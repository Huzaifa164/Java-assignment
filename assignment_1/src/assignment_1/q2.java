package assignment_1;
import java.util.Scanner;

public class q2 {
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1 = scn.nextInt();
		System.out.println("Enter second number:");
		int num2 = scn.nextInt();
		int sum = num1 + num2;
		System.out.println("The sum is " + sum);
	}
}
