package oops;

public class HdfcBank extends Cred{

	@Override
	public void loans() {
		System.out.println("HDFC loans...");
	}
	
	@Override
	public void upiPayment() {
		System.out.println("HDFC UPI payements..");
	}
	
	@Override
	public void cards() {
		System.out.println("HDFC cards payement..");
	}
	
	public void cheque() {
		System.out.println("HDFC cheque status.....");
	}
	
	public static void main(String[] args) {
		HdfcBank hdfc=new HdfcBank();
		hdfc.loans();
		hdfc.upiPayment();
		hdfc.cards();
		hdfc.cheque();
		hdfc.cibilScore();
		hdfc.paymentProcess();
	}
}
