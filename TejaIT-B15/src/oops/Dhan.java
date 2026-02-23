package oops;

public class Dhan extends NSE{

	@Override
	public void brokerageCharges() {
		System.out.println("brokerage charges are 10/-");
	}

	
	public static void main(String[] args) {
		Dhan d=new Dhan();
		d.stocksInfo();
		d.IPO();
		d.holidays();
		d.brokerageCharges();
		
		
	}
}
