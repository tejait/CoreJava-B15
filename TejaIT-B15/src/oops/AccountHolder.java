package oops;

public class AccountHolder {// raju
private String holderName;
private int accountNumber;
public int balance;
private String ifsc;

public String getHolderName() {
	return holderName;
}
public void setHolderName(String holderName) {
	this.holderName = holderName;
}

public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	
	if(balance<0) {
	throw new IllegalStateException("Balance cannot be negative");	
	}
	
	this.balance = balance;
}

public void setIfsc(String ifsc) {
	this.ifsc = ifsc;
}
public String getIfsc() {
	return ifsc;	
}
public int getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}

}
