package assignment_1;
import java.util.Scanner;

public class q10 {
	public static void main() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number1:");
		int number1 = scn.nextInt();
		System.out.println("Enter number2:");
		int number2 = scn.nextInt();
		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;
		System.out.println("number1: " + number1);
		System.out.println("number2: " + number2);
	}
}
