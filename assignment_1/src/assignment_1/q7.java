package assignment_1;
import java.util.Scanner;

public class q7 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the radius:");
		double radius = scn.nextDouble();
		double area = (Math.PI*Math.pow(radius, 2));
		System.out.println("Area: " + area);
		double circumference = (2*Math.PI*radius);
		System.out.println("Circumference: " + circumference);
	}
}
