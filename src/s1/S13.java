package s1;

public class S13 {

	public static void main(String[] args) {
		String s = "123453321";
		System.out.println(s);
		boolean b = false;
		int m = s.length() - 1;
		for (int i = 0; i < m; i++,m--) {
			if (s.charAt(i) != s.charAt(m)) {
				b = true;
			}
		}
		if (b == true) {
			System.out.println("Not Palidrome");
		} else {
			System.out.println("Pelidrome");
		}
	}
}
