package multi;

public class Swiggy extends Thread{
// locking mechanism
	
	@Override
	public synchronized void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread Id- "+Thread.currentThread().getId());
		}
	}
	
	public static void main(String[] args) {
		Swiggy s1=new Swiggy();   // object level lock -  s1
		Thread t1=new Thread(s1);
		     t1.start();
		     
		 Thread t2=new Thread(s1);  
		 	 t2.start();
	}
}
