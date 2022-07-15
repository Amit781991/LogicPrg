package s2;

import java.util.Random;

public class A {

	public static void main(String[] args) {

//		int count = 0;
//		for (int i = 1; i <= 50; i++) {
//			boolean b = false;
//			for (int j = 2; j < i; j++) {
//				if (i % j == 0) {
//					b = false;
//					break;
//				} else {
//					b = true;
//				}
//			}
//			if (i == 2) {
//				System.out.println("The prime number is: " + i);
//				count++;
//			}
//			if (b == true) {
//				System.out.println("The prime number is: " + i);
//				count++;
//			}
//		}
//		System.out.println(count);

//		String s = "XXXII";
//		int m = 0;
//	for (int i = 0; i < s.length(); i++) {
//		if(s.charAt(i) == 'I') {
//			m = m + 1;
//			if(s.substring(s.length()-2).equals("IV") || s.substring(s.length()-2).equals("IX")) {
//				m = m -2;
// 			}
//		}
//		if(s.charAt(i) == 'V') {
//			m = m+5;
//		}
//		if(s.charAt(i) == 'X') {
//			m = m + 10;
//		}
//	}	
//		System.out.println(m);

//	int num = 30;
//	int d1 = 0, d2 = 0;
//	for (int i = 1 ; i <= num/2; i++) {
//		if(i%2 == 0 && (num-i)%2 == 0 ) {
//			d1 = i;
// 			d2 = num-i;
//			if(d1+d2 == num) {
//				System.out.println(d1+" + "+d2);
//			}
//		}
//		d1 = i;
//		d2 = num - i;
//		System.out.println(i+" + "+(num-i));
//	}

//			int[] x = {1,2,3,4,5};
//			for (int i = 0; i < x.length; i++) {
//				for (int j = i+1; j < x.length; j++) {
//					if(x[i] + x[j] == 7) {
//						System.out.println(x[i]+" + "+x[j]);
//					}
//				}
//			}

//		int[] x = { 1, 2, 3, 5, 9 };
//		int[] c = new int[6]; 
//		int k = 0;
//		for (int i = 0; i <= 10; i++) {
//			boolean b = false;
//			for (int j = 0; j < x.length; j++) {
//				if (i == x[j]) {
//					b = true;
//					break;
//				}
//			}
//			if (b == false) {
//				System.out.println(i);
//				c[k] = i;
//				k++;
//			}
//		}
//		for (int i = 0; i < c.length; i++) {
//			//if (c[i] != 0)
//				System.out.print(c[i] + " ");
//		}

//		String s = "H12e434ll46456o W324or2525ld24testing5 shastra";
//		int m = 0, count = 0;
//		for (int i = 0; i < s.length(); i++) {
//			if (s.charAt(i) == '0' || s.charAt(i) == '1' || s.charAt(i) == '2' || s.charAt(i) == '3'
//					|| s.charAt(i) == '4' || s.charAt(i) == '5' || s.charAt(i) == '6' || s.charAt(i) == '7'
//					|| s.charAt(i) == '8' || s.charAt(i) == '9') {
//				m = m + (s.charAt(i) - '0');
//			}
//			if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')) {
//				count++;
//			}
//		}
//		System.out.println("The sum of total number in string is: " + m);
//		System.out.println("The total number of alphabet in string is: " + count);

//		for (char i = 'A'; i <= 'z'; i++) {
//			System.out.println(i);
//		}

//		String	s = "lnvnv@#%jIL";
//		char[] c = s.toCharArray();
//		String s1 = "";
//		for (int i = 0; i < c.length; i++) {
//			for (int j = 0; j < c.length-1; j++) {
//				if(c[j]>c[j+1]) {
//					char t = c[j];
//					c[j] = c[j+1];
//					c[j+1] = t;
//				}
//			}
//		}
//		for (int i = 0; i < c.length; i++) {
//			s1 = s1 + c[i];
//		}
//		System.out.println(s1);

//		char ch = '+';
//		byte b = (byte) ch;
//		System.out.println(ch+"...."+b);

//		String s = "Hello";
//		String s1 = "Hello";
//		System.out.println((int)'W');
//		System.out.println((int)'H');
//		int c = s.compareTo(s1);
//		if(c==0)
//			System.out.println("Equal");
//		else 
//			System.out.println("Not Equal");

//		String s = "1312436362sfaff452525342";
//		boolean flag = false;
//		try {
//			Double.parseDouble(s);
//			flag = true;
//		}catch(NumberFormatException e) {
//			System.err.println(e.getMessage());
//		}
//		if(flag) 
//			System.out.println("Numeric");
//		else 
//			System.out.println("Not numeric");

//		
		
		

	}
}
