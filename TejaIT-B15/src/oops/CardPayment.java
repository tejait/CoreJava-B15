package oops;

public class CardPayment extends PayementMethod{

	@Override
	public void pay() {
		System.out.println("this is card payement");
	}

	public static void main(String[] args) {
		CardPayment cp=new CardPayment();
		cp.paymentProcess();
		cp.pay();
	}
}
