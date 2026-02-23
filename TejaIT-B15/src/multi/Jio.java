package multi;

public class Jio implements Runnable{

	@Override
	public void run() {
		// execution
	for(int i=0;i<10;i++) {
		System.out.println("Thread Id- "+Thread.currentThread().getId());
	}	
	}
	
	public static void main(String[] args) {
		Jio j1=new Jio();
		Thread t1=new Thread(j1); // t1 -15
		       t1.start();
		       
		Thread t2=new Thread(j1);// t2-16
		       t2.start();		
		
		Thread t3=new Thread(j1);
		       t3.start();
	}

}
