package except;

public class Customer {
      
	int bill=500;
	public void payment(int amount) {
		
		if(bill<amount) { //500<1000
		System.out.println("payment success..");
		}else {
			//System.out.println("transaction failed..");
		//throw new InsufficientFundsException();
	throw new InsufficientFundsException("add funds...");		
		}
	}
	
	public static void main(String[] args) {
		Customer c=new Customer();
		c.payment(100);
	}
}
