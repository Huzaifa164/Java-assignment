package assignment_1;
import java.util.Scanner;

public class q5 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter num1:");
		int num1 = scn.nextInt();
		System.out.println("Enter num2:");
		int num2 = scn.nextInt();
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
	}
}
