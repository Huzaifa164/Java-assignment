package assignment_1;
import java.util.Scanner;

public class q3 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter principal amount:");
		int principal = scn.nextInt();
		System.out.println("Enter rate of interest:");
		int rateOfInterest = scn.nextInt();
		System.out.println("Enter the time period in years:");
		int timePeriod = scn.nextInt();
		int finalAmount = principal * ((int)Math.pow(1+(rateOfInterest/100), timePeriod));
		System.out.println(finalAmount);
		int compoundInterest = finalAmount - principal;
		System.out.println("The compound interest is " + compoundInterest);
	}
}
