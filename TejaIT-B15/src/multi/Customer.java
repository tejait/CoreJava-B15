package multi;

public class Customer {

	int bankBal=0; // 5000
	public synchronized void withdraw(String name,int withdrawAmount) throws InterruptedException {  // bharath -15000
		System.out.println("customer came to withdraw amount..."+name);
		
		if(bankBal<withdrawAmount) {
	System.out.println("Sorry sir, we don't have enough amount, please wait.");
		wait(); 
		}
		
		System.out.println("customer withdraw amount Successfully...");
		bankBal=bankBal-withdrawAmount;
	}
	
	public synchronized void deposite(int depositeAmount) { // sai - 20000
		System.out.println("customer came to deposite amount...");
		bankBal=bankBal+depositeAmount;
		System.out.println("customer deposit successfully");
		System.out.println("notifying..............");
		//notify();
		notifyAll();
	}
}
