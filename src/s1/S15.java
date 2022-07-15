package s1;

public class S15 {
	public static void main(String[] args) {
		String s = "H1344el4577lo t6867es475ti79ng Sh5868ast2424a 36463";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '0' || s.charAt(i) == '1' || s.charAt(i) == '2' || s.charAt(i) == '3'
					|| s.charAt(i) == '4' || s.charAt(i) == '5' || s.charAt(i) == '6' || s.charAt(i) == '7'
					|| s.charAt(i) == '8' || s.charAt(i) == '9') {
				s = s.replace(s.charAt(i), 'X');
			}
		}
		System.out.println(s);
	}
}
