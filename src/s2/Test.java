package s2;

public class Test {
	public static void main(String[] args) {
		System.out.println("To check occurance.");
		String s = "To check occurance.";
		for (int j = 65; j <= 126; j++) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == (char)(j)) {
					count++;
				}
			}
			if (count > 0) {
				System.out.println((char)(j) + " = " + count);
			}
		}
	}
}
