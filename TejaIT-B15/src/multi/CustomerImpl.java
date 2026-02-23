package multi;

public class CustomerImpl {
public static void main(String[] args) {
	Customer c1=new Customer();
	// withdraw thread-1
	Thread t1=new Thread(new Runnable() {
		@Override
		public void run() {
			try {
				c1.withdraw("user-1",15000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	});
	t1.start();
	Thread t3=new Thread(new Runnable() {
		@Override
		public void run() {
			try {
				c1.withdraw("user-2",4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	});
	t3.start();
	
	
	// deposite thread
	Thread t2=new Thread(new Runnable() {
		
		@Override
		public void run() {
			c1.deposite(20000);
		}
	});
	t2.start();
}
}
