package variabels;

public class HyderbadCentral {

	int total=0;
	
	
public int mobiles() {
	int realme=12000;
	int iphone=14000;
	 total=realme+iphone;
	return total;
  }

public int appliances() {
	int fridge=15000;
	int ac=20000;
	 total=fridge+ac;
	return total;
  }

public int electronics() {
	int laptop=25000;
	int tv=35000;
	total=laptop+tv;
	return total;
  }


	public static void main(String[] args) {
		HyderbadCentral hc=new HyderbadCentral();
		System.out.println("Mobile bill:: "+hc.mobiles());
		System.out.println("Applicances bill:: "+hc.appliances());
		System.out.println("electronics bill::"+hc.electronics());
		
		int mobileBill=hc.mobiles();
		int applicanceBill=hc.appliances();
		int electronicsBill=hc.electronics();
		int totalBill=mobileBill+applicanceBill+electronicsBill;
		System.out.println(totalBill);
	}
}
