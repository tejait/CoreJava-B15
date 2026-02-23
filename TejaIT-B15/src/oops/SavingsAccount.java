package oops;

public class SavingsAccount extends Account implements ATMService, OnlineService {

	public void accountType() {
		System.out.println("Savings Account");	
	}
	@Override
	public void fundTransfer() {
		System.out.println("funds transfering using online service");
	}

	@Override
	public void withdraw() {
		System.out.println("amount withdraw using ATM service");
	}
	public static void main(String[] args) {
		SavingsAccount sa=new SavingsAccount();
		sa.accountType();
		sa.dispute();
	}
}
