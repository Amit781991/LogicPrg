package s2;

import java.util.Scanner;

public class S11 {
	public void m1(int n) {
		try {
			System.out.println(10/n);
		}catch(ArithmeticException e) {
			System.err.println("Not divisible by: "+n);
		}
	}
	
	public void m2(int[] x,int n)  {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 element");
		for (int i = 0; i < x.length; i++) {
			x[i] = sc.nextInt();
		}
		try {
			System.out.println(x[n]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("Array out of bounds index: "+n);
		}
	}
	public static void main(String[] args)  {
		
		S11 sc = new S11();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		int[] x = new int[5];
		System.out.println("Statement - Hello");
		sc.m1(n);
		sc.m2(x,n);
		System.out.println("Statement - Continue");
		s.close();
	
	
	}

}
