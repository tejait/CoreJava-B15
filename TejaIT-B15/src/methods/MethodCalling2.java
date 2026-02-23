package methods;

public class MethodCalling2 {
	
public int mobiles() {
	int realme=12000;
	int samsung=13000;
	int total=realme+samsung;
	System.out.println("Toatal Amount of Mobiles:: "+total);
	int gst=gst("mobiles",total);
	System.out.println("GST Amount on mobiles:: "+gst);
	int totalWithGst=total+gst;
	System.out.println("Total With GST:: "+totalWithGst);
	return totalWithGst;
}

public int gst(String catg,int bill) { // catg...
	if(catg.equals("mobiles")) {
	//int gstAmount=(bill*10)/100;
		sgstamt=sgst(catg,bill);
		cgstamt=cgst(catg,bill);
		int gstAmount=sgstamt+cgstamt;
		
	  }else if(catg.equals("electronics")) {
		  
	  }else if() {
		  
	  }else {
		  
	  }
	return gstAmount;
}
public void totalBill() {
	int mobileBill=mobiles();
}
public static void main(String[] args) {
	MethodCalling2 mc=new MethodCalling2();
	mc.totalBill();
}
}
