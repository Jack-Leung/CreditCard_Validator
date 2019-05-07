package CreditCard_Validator_TEST;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		CreditCard cc = new CreditCard();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your credit card number: ");
		long num = sc.nextLong();
		cc.setCardnum(num);
		if (cc.validate())
			System.out.println("Valid credit card.");
		else
			System.out.println("Invalid credit card.");
	}

}
