package oops;

public class AliceBlue extends NSE{

	@Override
	public void brokerageCharges() {
		System.out.println("Alice Blue charges 15/-");
	}

	public static void main(String[] args) {
		AliceBlue ab=new AliceBlue();
		ab.stocksInfo();
		ab.IPO();
		ab.holidays();
		ab.brokerageCharges();
	}
}
