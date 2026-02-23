package oops;


public class Cred extends BillDesk{

	public void upiPayment() {
		System.out.println("CRED UPI payements..");
	}
	
	public void loans() {
		System.out.println("CRED loans...");
	}
	public void cards() {
		System.out.println("CRED cards payement..");
	}
	public void cibilScore() {
		System.out.println("CRED offercing cibil score..");
	}
	
	public static void main(String[] args) {
		Cred c=new Cred();
		c.upiPayment();
		c.loans();
		c.cards();
		c.cibilScore();
		c.paymentProcess();
	}
	
}
