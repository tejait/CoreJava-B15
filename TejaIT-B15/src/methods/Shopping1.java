package methods;

public class Shopping1 {
	
public int mobiles() {
	int realme=13000;
	int iphone=12000;
	int total=realme+iphone;
	return total;
}

public void totalBill() {
	int mobilesBill=mobiles();
	System.out.println("Mobiles Bill::"+mobilesBill);
}

public static void main(String[] args) {
	Shopping1 sp1=new Shopping1();
	sp1.totalBill();
}
}
