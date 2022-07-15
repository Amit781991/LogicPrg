package s1;

public class S14 {

	public static void main(String[] args) {
		char[] x = { 'A', 'B', 'C', 'B', 'A' };
		boolean b = false;
		int m = x.length - 1;
		System.out.println(m);
		for (int i = 0; i < m; i++) {
			if (x[i] != x[m]) {
				b = true;
			}
			m--;
		}
		if (b == false) {
			System.out.println("palidrome");
		} else {
			System.out.println("Not palidrome");
		}
	}
}
