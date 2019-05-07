package CreditCard_Validator_TEST;

public class CreditCard {
	public long cardnum;
	
	public CreditCard() {}
	
	public CreditCard(int cardnum) {
		this.cardnum = cardnum;
	}

	public long getCardnum() {
		return cardnum;
	}

	public void setCardnum(long num) {
		this.cardnum = num;
	}
	
	public boolean validate() { //validation using Luhn's algorithm
		String strnum = Long.toString(cardnum); //convert int to string
		char[] charnum = strnum.toCharArray(); //convert the string to array of single digit/char
		
		if (charnum.length <= 19) { //19 is max length for a credit card number
			int sum = 0;
			for (int i=0; i<charnum.length; i++) {
				if (i%2 == 0) {
					int n = Integer.parseInt(String.valueOf(charnum[i])); //convert char back to int
					n *= 2;
					
					if (n >= 10) 
						sum += (1 + (n%10));
					else
						sum += n;
				}
				else
					sum += Integer.parseInt(String.valueOf(charnum[i]));
			}
			
			if (sum%10 == 0)
				return true;
			else
				return false;
		}
		return false;
	}//end of validate()
	
}//EOF
