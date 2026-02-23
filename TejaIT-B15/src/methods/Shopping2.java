package methods;

public class Shopping2 {
	public int mobiles() {
		int realme=13000;
		int iphone=12000;
		int total=realme+iphone;
		return total;
	}

	public int fashoin() {
		int shirt=500;
		int tshirt=500;
		int total=shirt+tshirt;
		return total;
	}
	public void totalBill() {
		int mobilesBill=mobiles();
		System.out.println("Mobiles Bill::"+mobilesBill);
		int fashoiBill=fashoin();
		System.out.println("fashoin Bill::"+fashoiBill);
	}
	
public static void main(String[] args) {
	Shopping2 s2=new Shopping2();
	s2.totalBill();
}
}
