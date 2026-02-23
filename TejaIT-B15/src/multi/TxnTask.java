package multi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TxnTask extends Thread{
     int transactionId; 

	public TxnTask(int transactionId) {
		super();
		this.transactionId = transactionId;
	}

	@Override
	public void run() {
	System.out.println("Transaction Id:: "+transactionId+" is processing... "
				+ "By:: "+Thread.currentThread().getName());
	}
	
	public static void main2(String[] args) {
		TxnTask  tx1=new TxnTask(101);
		Thread t1=new Thread(tx1);
		Thread t2= new Thread(new TxnTask(102));
		Thread t3=new Thread(new TxnTask(103));
		Thread t4= new Thread(new TxnTask(104));
		Thread t5=new Thread(new TxnTask(105));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
	public static void main(String[] args) {
		ExecutorService executorService=Executors.newFixedThreadPool(2);
		executorService.submit(new TxnTask(101));
		executorService.submit(new TxnTask(102));
		executorService.submit(new TxnTask(103));
		executorService.submit(new TxnTask(104));
		executorService.submit(new TxnTask(105));
		executorService.shutdown();
	}
     
}
