package s2;

import java.util.Scanner;

@SuppressWarnings("serial")
class AtmException extends RuntimeException {
	@Override
	public String getMessage() {
		return "Your card is blocked. Please visit nearest branch";
	}
}

public class S12 {
	
	public void cardEnter() {
		Scanner sc = new Scanner(System.in);
		int count = 1;
		for (int i = 1; i <= 3; i++) {
			System.out.println("Enter the pin");
			int j = sc.nextInt();
			if (j == 1234) {
				System.out.println("Continue to next process");
				break;
			}
			else {
				if(i < 3) {
					System.out.println("Please enter one more time....");
					count++;
				}
			}
		}
		sc.close();
		if(count >= 3) {
				throw new AtmException();
		} 
	}
	public static void main(String[] args) {
		S12 s = new S12();
		s.cardEnter();
	}
}
