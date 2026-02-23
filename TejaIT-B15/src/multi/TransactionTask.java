package multi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TransactionTask implements Runnable{
private int transactionId;

public TransactionTask(int transactionId) {
	super();
	this.transactionId = transactionId;
}

@Override
public void run() {
System.out.println("Transaction Id:: "+transactionId+" is processing... "
			+ "By:: "+Thread.currentThread().getName());
}

public static void main(String[] args) {
	ExecutorService es=Executors.newFixedThreadPool(2);
	                es.submit(new TransactionTask(101));
	                es.submit(new TransactionTask(102));
	                es.submit(new TransactionTask(103));
	                es.submit(new TransactionTask(104));
	                es.submit(new TransactionTask(105));
	             es.shutdown();
   }
}
