package s2;

import java.util.Scanner;

@SuppressWarnings("serial")
class AtmpWrongpinException extends RuntimeException {
	@Override
	public String getMessage() {
		return "Your entered choice is over... \nPlease visit nearest branch";
	}
}

@SuppressWarnings("serial")
class MoreWithdrawAmountException extends RuntimeException {
	@Override
	public String getMessage() {
		return "You entered amount is more than balance..... \nfirst check balance then withdraw.";
	}
}

public class S14 {
	boolean flag = false;
	private int balance = 10000;
	static Scanner sc = new Scanner(System.in);
	@SuppressWarnings("resource")
	public void atmPin() throws InterruptedException {
		int count = 0;
		for (int j = 1; j <= 3; j++) {
			System.out.println("Enter your pin number");
			int i = sc.nextInt();
			if (i == 1234) {
				int ch, amount;
				System.out.println("1. Deposite : \n2. Withrraw : \n3. Check Balance : ");
				System.out.println("Enter your choice: ");
				ch = sc.nextInt();
				switch (ch) {
				case 1:
					System.out.println("Enter the amount which deposited.");
					amount = sc.nextInt();
					if (amount > 50000) {
						System.out.println(
								"The amount is more than 50000...\nPlease visit nearest branch to deposite the money");
						flag = true;
					} else {
						deposite(amount);
					}
					break;
				case 2:
					System.out.println("Enter the amount which withdraw.");
					amount = sc.nextInt();
					if (amount > balance) {
						try {
							throw new MoreWithdrawAmountException();
						} catch (MoreWithdrawAmountException e) {
							System.err.println(e.getMessage());
							flag = true;
						}
					} else {
						if (amount > 25000) {
							System.out.println("The amount is more than 25000...\nPlease visit nearest branch to withdraw the money.");
							flag = true;
						} else {
							withdraw(amount);
						}
					}
						break;
				case 3: checkBalance();
						break;
				default: System.out.println("Invalid choice....");
				}
				break;
			} else {
				System.out.println("Entered pin is wrong.. ");
				if (count < 2) {
					System.out.println("Please check one more time.");
				}
				count++;
			}
		}
		if (count == 3) {
			Thread.sleep(1000);
			try {
				throw new AtmpWrongpinException();
			} catch (AtmpWrongpinException e) {
				System.err.println(e.getMessage());
				this.flag = true;
			}
		}
		sc.close();
	}

	public void deposite(int money) {
		balance = balance + money;
		System.out.println("Deposited money: " + money);
	}

	public void withdraw(int money) {
		balance = balance - money;
		System.out.println("Withdraw money: " + money);
	}

	public void checkBalance() {
		System.out.println("Total Balance: " + balance);
		flag = true;
	}
	public static void main(String[] args) throws InterruptedException {
		S14 s = new S14();
		s.atmPin();
		if (s.flag) {
			return;
		}
		else {
			s.checkBalance();
		}
		System.out.println("Continue");
	}
}
