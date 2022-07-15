package s1;
public class S11 {
	public static void main(String[] args) {
		String string = "Hello testing Shastra";
		String[] parts = string.split(" ");
		for (String string2 : parts) {
			System.out.print(string2+" ");
		}
		System.out.println();
		String small=parts[0];
		String big=parts[0];
		for (int i = 1; i < parts.length; i++) {
			if (big.length() < parts[i].length()) {
				big=parts[i];
			}
			if(small.length() > parts[i].length()) {
				small=parts[i];
			}
		}
		System.out.println(small);
		System.out.println(big);
	}
}
