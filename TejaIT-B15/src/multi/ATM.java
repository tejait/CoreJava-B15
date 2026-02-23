package multi;

public class ATM {
        volatile  boolean maintananceMode=false; // true
	public void transactionProcess() {
		System.out.println("customer came to transaction process...");
		
		while(!maintananceMode) {  // false
			// transactions process is going on...
			//System.out.println("while loop is running...");
		}
		System.out.println("ATM is Stopped for maintenance");	
	}
	
	public void maintanance() {
		System.out.println("ADMIN chaning maintanace mode...");
		maintananceMode=true;
	}
	public static void main(String[] args) throws InterruptedException {
		ATM atm=new ATM();
		Thread atmTransaction=new Thread(new Runnable() {
			@Override
			public void run() {
				atm.transactionProcess();
			}
		});
		atmTransaction.start();
		
		Thread.sleep(4000);
		atm.maintanance();
		
	}
}
