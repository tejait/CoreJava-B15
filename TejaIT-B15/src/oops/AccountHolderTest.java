package oops;

public class AccountHolderTest { // Yaseen
public static void main(String[] args) {
	//AccountHolder ah=new AccountHolder("Raju", 1223434, 500, "SBIN002");
	//System.out.println(ah.holderName+" "+ah.accountNumber+" "+ah.balance+" "+ah.ifsc);

	AccountHolder ah=new AccountHolder();
	              ah.setHolderName("Raju"); // initialization -setter
	              ah.setHolderName("Kondaveeti Raju");
	              ah.setHolderName("K Raju");
	              ah.setBalance(15000);
	System.out.println(ah.getHolderName()); // read
	System.out.println(ah.getBalance());
	
	
}
}
