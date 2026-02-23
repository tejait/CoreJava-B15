package oops;

public class Grow extends NSE{

	@Override
	public void brokerageCharges() {
		System.out.println(" Grow brokerage charges are 20/-");
	}
public static void main(String[] args) {
	Grow g=new Grow();
	g.stocksInfo();
	g.IPO();
	g.holidays();
	g.brokerageCharges();
}
}
