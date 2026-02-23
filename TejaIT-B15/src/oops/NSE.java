package oops;

public abstract class NSE {

	//hides the un-necessary data, show the necessary data
	// normal methods - implementation
	public void stocksInfo() {
		System.out.println("Infosys,TCS,Hindalco,Zomato,Bajaj,JIo,MRF,Nestle");
	}
	
	public void IPO() {
		System.out.println("Flipkart, blinkit,amazon");
	}
	
	public void holidays() {
		System.out.println("Agu15,DEC25,May1");
	}
	
	// abstract methods- data hiding
	public abstract void brokerageCharges();
	
	
	{
		System.out.println("NSE Instance block");
	}
	static{
		System.out.println("NSE Static block");
	}
	
	public NSE() {
		System.out.println("NSE constructor");
	}
	public static void main(String[] args) {
	//	NSE nse=new NSE();
	}
	
	
}
