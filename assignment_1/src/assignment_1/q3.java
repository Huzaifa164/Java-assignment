package assignment_1;
import java.util.Scanner;

public class q3 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter principal amount:");
		double principal = scn.nextInt();
		System.out.println("Enter rate of interest:");
		double rateOfInterest = scn.nextInt();
		System.out.println("Enter the time period in years:");
		double timePeriod = scn.nextInt();
		double finalAmount = principal * ((int)Math.pow(1+(rateOfInterest/100), timePeriod));
		System.out.println(finalAmount);
		double compoundInterest = finalAmount - principal;
		System.out.println("The compound interest is " + compoundInterest);
	}
}
