package assignment_1;
import java.util.Scanner;

public class q6 {
	public static void main() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter length:");
		double length = scn.nextDouble();
		System.out.println("Enter breadth:");
		double breadth = scn.nextDouble();
		double area = length * breadth;
		System.out.println("The area is " + area);
	}
}
