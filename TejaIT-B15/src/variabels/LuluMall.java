package variabels;

public class LuluMall {
	
	public int mobiles() {
		int realme=12000;
		int iphone=14000;
		int total=realme+iphone;
		return total;					
	}
	
	public int appliances() {
		int fridge=15000;
		int ac=20000;
		int total=fridge+ac;
		return total;
	}
	
public static void main(String[] args) {
	LuluMall lm=new LuluMall();
	int totalMobileBill=lm.mobiles();
	System.out.println("mobile bill:: "+totalMobileBill);
    int totalAppliancesBill=lm.appliances();
    System.out.println("Appliances bill:: "+totalAppliancesBill);
    
    int totalBill=totalMobileBill+totalAppliancesBill;
    System.out.println("total Bill::"+totalBill);
}
}
