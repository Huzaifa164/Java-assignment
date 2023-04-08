package assignment_1;
import java.util.Scanner;

public class q2a {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1 = scn.nextInt();
		System.out.println("Enter second number:");
		int num2 = scn.nextInt();
		int binSum = num1 & num2;
		System.out.println("The binary sum of the numbers are " + binSum);
	}
}
