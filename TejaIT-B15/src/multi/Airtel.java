package multi;

public class Airtel extends Thread{ // extend thread class 
// multi - threading

	//override the run method
	@Override
	public  void run() {
		System.out.println("Run method...");
	}
	
	public static void main(String[] args) {
		Airtel a1=new Airtel();// we have create object of our custome class
		//a1.run();
		Thread t1=new Thread(a1);// we have to create Thread class Object
		// we are passed our custome object reference into Thread Object.
		       t1.start(); 	// to start the thread we are used start() method from thread class
		    // then thread will start and calls the run();
	}
	
}
