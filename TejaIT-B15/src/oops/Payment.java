package oops;

public class Payment {

	//cash payment
	public void pay(String paymentType,int amount) {
		System.out.println("payement type::"+paymentType+"   amount::"+amount);
	}
	//card payment
	public void pay(String paymentTpe,int amount,Long cardNum) {
System.out.println("payement type::"+paymentTpe+"  amount::"+amount+"  cardNum::"+cardNum);
	}
	//UPI payment
	public void pay(String paymentType,int amount,String upiId) {
System.out.println("Payment type:: "+paymentType+"  amount::"+amount+"  upiId::"+upiId);	
	}
	
	public static void main(String[] args) {
		Payment p1=new Payment();
		p1.pay("Cash", 500);
		p1.pay("card payement", 1500, 12345678L);
		p1.pay("UPI", 50, "teja@ybl");
		
	}
}
