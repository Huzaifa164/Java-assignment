package assignment_1;
import java.util.Scanner;

public class q11 {
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the nth position:");
		int n = scn.nextInt();
		int a = 0;
		int b = 1;
		for(int i = 1; i <= n; i++) {
			if(i == 1) {
				System.out.println(a);
			}
			else if(i == 2) {
				System.out.println(b);
			}else {
				int c = a + b;
				System.out.println(c);
				a = b;
				b = c;
			}
		}
	}
}
