package assignment_1;
import java.util.Scanner;

public class q4 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = scn.nextInt();
		System.out.println("Enter the power:");
		int power = scn.nextInt();
		
		int counter = 1;
		int result = number;
		while(counter < power) {
			result *= number;
			counter++;
		}
		System.out.println("The answer is " + result);
	}
}
