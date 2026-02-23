package multi;

public class Uber extends Thread{

	@Override
	public void run() {
		data();
	}
	
	// which holds the class level lock   - ub
	public static synchronized void data() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread Id- "+Thread.currentThread().getId());
		}
	}
	
	// Data consistancy
	public static void main(String[] args) {
		Uber u1=new  Uber();// u1
		Thread t1=new Thread(u1);  // t1-16  -u1
		       t1.start();
		       
		Thread t2=new Thread(u1); // t2-17   -u1
		       t2.start();
		       
		Uber u2=new  Uber();    //u2
		Thread t3=new Thread(u2);  // t3- 18 - u2
		       t3.start();
		
		Thread t4=new Thread(u2); // t4- 19 -u2
		       t4.start();
	}
}
