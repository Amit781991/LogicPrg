package s2;

import java.util.Scanner;

public class Practice {

	static public final synchronized strictfp void main(String... amit) {
//	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers.");
		int i = sc.nextInt();
		int j = sc.nextInt();
		sc.close();
		if (i == 0 || j == 0) {
			System.out.println("Enter valid number");
		}
		if ((i > 0 && j > 0) || (i < 0 && j < 0)) {
			int k = i / j;
			int l = i % j;
			System.out.println("Quotient: " + k);
			System.out.println("Remainder: " + l);
		}
		if ((i < 0 && j > 0) || (i > 0 && j < 0)) {
			int k = i / j;
			int l = i % j;
			System.out.println("Quotient: " + (k * -1));
			System.out.println("Remainder: " + (l * -1));
		}
	}
}
