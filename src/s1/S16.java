package s1;

public class S16 {

	public static void main(String[] args) {
		String s = "Al1212323l i@!&&#78934####s*** we))((((2367))llZZZZ896Z";
		int c = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '0' || s.charAt(i) == '1' || s.charAt(i) == '2' || s.charAt(i) == '3'
					|| s.charAt(i) == '4' || s.charAt(i) == '5' || s.charAt(i) == '6' || s.charAt(i) == '7'
					|| s.charAt(i) == '8' || s.charAt(i) == '9') {

				int a = Character.getNumericValue(s.charAt(i));
				c = c + a;
			}
		}
		System.out.println(c);
	}
}
