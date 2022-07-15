package s2;

import java.awt.List;
import java.io.File;
import java.util.HashSet;
import java.util.Scanner;

import javax.print.attribute.HashAttributeSet;

public class B extends A {

	public static void main(String[] args) {
//		String s = "Anagram";
//		String s1 = "Margana";
//		char[] c1 = s.toLowerCase().toCharArray();
//		char[] c2 = s1.toLowerCase().toCharArray();
//		Arrays.sort(c1);
//		Arrays.sort(c2);
//		String s2 = "";
//		String s3 = "";
//		for (int i = 0; i < c1.length; i++) {
//			for (int j = 0; j < c1.length-1; j++) {
//				if(c1[j] > c1[j+1]) {
//					 char t = c1[j];
//					c1[j] = c1[j+1];
//					c1[j+1] = t;
//				}
//			}
//		}
//		for (int i = 0; i < c1.length; i++) {
//			System.out.print(c1[i]+" ");
//			s2 = s2 + c1[i];
//		}
//		System.out.println(s2);
//		System.out.println();
//		for (int i = 0; i < c2.length; i++) {
//			for (int j = 0; j < c2.length-1; j++) {
//				if(c2[j] > c2[j+1]) {
//					char t = c2[j];
//					c2[j] = c2[j+1];
//					c2[j+1] = t;
//				}
//			}
//		}
//		for (int i = 0; i < c2.length; i++) {
//			System.out.print(c2[i] +" ");
//			s3 = s3 + c2[i];
//		}
//		System.out.println(s3);
//		System.out.println();
//		boolean e = Arrays.equals(c1, c2);
//	//	boolean e = s2.equals(s3);
//		if(e) {
//			System.out.println("Anagram");
//		} else {
//			System.out.println("Not anagram");
//		}

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the outer size");
//	//	int outer = sc.nextInt();
//		int[][] x = new int[sc.nextInt()][];
//		for (int i = 0; i < x.length; i++) {
//			System.out.println("Enter the inner size of "+i+" index.");
//	//		int inner = sc.nextInt();
//			x[i] = new int[sc.nextInt()];
//		}
//		for (int i = 0; i < x.length; i++) {
//			System.out.println("enter the "+x[i].length+" elements seperated by space");
//			for (int j = 0; j < x[i].length; j++) {
//				x[i][j] = sc.nextInt();
//			}
//		}
//		sc.close();
//		System.out.println();
//		for (int i = 0; i < x.length; i++) {
//			for (int j = 0; j < x[i].length; j++) {
//				System.out.print(x[i][j]+" ");
//			}
//			System.out.println();
//		}

//		int i = 1234;
//		int k = i;
//		System.out.println(k);
//		int count = 0;  
//		for ( count = 0; k != 0; count++) {
//			k = k/10;
//		}
//		System.out.println(count);
//		System.out.println(i);
//		int rev = 0;
//		for (int j = 0; i != 0; j++) {
//			count = i%10;
//			rev = rev*10 + count;
//			i = i/10; 
//		}
//		System.out.println(rev);

//		B b = new B();
//		try {
//			b.clone();
//		} catch (CloneNotSupportedException e) {
//			System.err.println("hello");
//		}

//		for (int i = 40; i <= 50; i++) {
//			boolean flag = false;
//			for (int j = 2; j <= i - 1; j++) {
//				if (i % j == 0) {
//					flag = false;
//					break;
//				} else 
//					flag = true;
//			}
//			if(flag) 
//				System.out.println(i);
//		}  

//		int base = 2,power = 3,result = 1;
//		for (int i = 1; i <= power; i++) {
//			result = result * base;
//		}
//		System.out.println(result);

//		int i = 1000;
//		int count = 0;
//		for (int j = 1; i != 0; j++) {
//			int digit = i % 10;
//			if (digit != 0) {
//				int a = 1;
//				for (int k = 1; k < j; k++) {
//					a =a * 2;
//				}
//				count = count+a;
//			}
//			i = i / 10;
//		}
//		System.out.println(count);

//		int i = 255;
//		String s = "";
//		for (int j = 1; i != 0; j++) {
//		int	q = i%2;
//			i = i/2; 
//			s = s + q;
//		}
//		StringBuffer sb = new StringBuffer(s);
//		sb.reverse();
//		String s1 = new String(sb);
//		System.out.println(s1);
//		int p = Integer.parseInt(s1);
//		System.out.println(p);

//		int i = 123454321;
//		int k = i;
//		int rev = 0;
//		for (int j = 1; i != 0; j++) {
//			int digit = i%10;
//			rev = rev*10+digit;
//			i = i/10;
//		}
//		System.out.println(rev+"---"+k);
//		if(k == rev) 
//			System.out.println("Palidrome");
//		else 
//			System.out.println("Not palidrome");

//		int i = 54321;
//		int rev = 0;
//		for (int j = 0; i != 0; j++) {
//			int digit = i%10;
//			rev = rev*10+digit;
//			i = i/10;
//		}
//		System.out.println(rev);
//		for (int j = 0; rev != 0; j++) {
//			int digit = rev%10;
//			System.out.println(digit);
//			rev = rev/10;
//		}
		
//		int i = 10;
//		int j = 20;
//		i = i + j;
//		j = i - j;
//		i = i - j;
//		System.out.println(i + " " + j);

//		int[] x = { 10, 5, 30, 70, 20, 40 };
//		int max = x[0];
//		int min = x[0];
//		for (int i = 0; i < x.length; i++) {
//			if (max < x[i]) {
//				max = x[i];
//			}
//			if (min > x[i]) {
//				min = x[i];
//			}
//		}
//		System.out.println(max + " " + min);
		
//		char[] ch = {'a','b','c','d'};
//		char ch = 'a',ch1 = 's';
//		String s = String.valueOf(""+ch+ch1);
//		System.out.println(s);
		
//		String s = "Hello World";
//		String[] c = s.split(" ");
//		String rev = "";
//		for (int i = 0; i < c.length; i++) {
//			rev = rev+c[c.length-i-1]+" ";
//		}
//		System.out.println(rev);
		
//		char c = 'a';
//		char ch = 'b';
//		c = (char) (c + ch);
//		ch = (char) (c-ch);
//		c = (char) (c-ch);
//		System.out.println(c+" "+ch);
		
		
		
		
	}
}