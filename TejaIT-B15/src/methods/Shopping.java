package methods;

public class Shopping {
int total;
int billWithTax;
	public int mobile() {
		int realme=12000;
		int samsung=14000;
		 total=realme+samsung;
		 billWithTax=tax(total);
		 withGst=gst(billWithTax);
		return billWithTax;
	}
	
	public int electronics() {
		int tv=12000;
		int laptop=15000;
		total=tv+laptop;
		billWithTax=tax(total);
		return billWithTax;
	}
	
	public int tax(int bill) {
		int withTax=bill+1000;
		return withTax;
	}
	public void totalBill() {
	    int mobileBill=mobile();
	    System.out.println("mobile bill:: "+mobileBill);
	    int electronicsBill=electronics();
	    System.out.println("electronics Bill:: "+electronicsBill);
	    int finaTotalBill=mobileBill+electronicsBill;
	    System.out.println("final Bill:: "+finaTotalBill);
	}
	public static void main(String[] args) {
		Shopping s1=new Shopping();
		s1.totalBill();
	}
}
