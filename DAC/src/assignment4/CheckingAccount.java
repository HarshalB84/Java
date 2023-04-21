package assignment4;

public class CheckingAccount {

	public void withdraw() {
		System.out.println("Withdraw money ");
	}

	public void getBalance(float balance) {
		if(balance<1000) {
			try {
				InsufficientFund f = new InsufficientFund("Minimum balance should not be less than 1000");
				throw f;
			}catch(InsufficientFund i) {
				System.out.println(i.getMessage());
			}
		}else {
			System.out.println("allowed to withdraw");
		}
	
	
	
	}
	
	public static void main(String[] args) {
		
		float balance = 900;
		
		CheckingAccount c = new CheckingAccount();
		
		c.getBalance(balance);
		
		
	}
	
}