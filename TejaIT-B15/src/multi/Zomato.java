package multi;

public class Zomato extends Thread{

	@Override
	public void run() {
		// running -  execution of run method.
		for(int i=0;i<10;i++) {
		System.out.println("Thread ID :: "+Thread.currentThread().getId());
		try {
			Thread.sleep(4000);  // waiting state
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
		// dead - completion of run method execution
	}
	
	public static void main(String[] args) {
		Zomato z1=new Zomato();
		Thread t1=new Thread(z1);  // born or new - creating hread object
		       t1.start();   // runnable -  starting a thread
		       //t1.start();
		       
	}
}
