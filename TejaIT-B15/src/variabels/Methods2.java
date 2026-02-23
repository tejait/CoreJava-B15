package variabels;

public class Methods2 {

	public int mobilePrice() {
		System.out.println("mobile method called");
		return 123;
	}
	
	public int electronicsPrice() {
		System.out.println("electronics method called");
		return 3000;
	}
	
	public double amount() {
		System.out.println("amount method called");
		return 123.45;
	}
	public float miles() {
		System.out.println("miles method called");
		return 2.3f;
	}
	public String productName() {
		System.out.println("productName method called");
		return "Iphone";
	}
	public void  something() {
		System.out.println("something method called");
	}
	
	public static void main(String[] args) {
		Methods2 m2=new Methods2();
		int mobilePrice=m2.mobilePrice();
		int electronicsPrice=m2.electronicsPrice();
		double amount=m2.amount(); // 129.45;
		float miles=m2.miles();
		String productName=m2.productName();
		m2.something();
		
		System.out.println(m2.miles());
		System.out.println(m2.productName());
	//	System.out.println(m2.something());
		
		
		
		
	}
}
