package methods;

public class Shopping3 {
	int total;
	int gstBill;
	int totalWithGst;
	public int mobiles() {
		int realme=13000;
		int iphone=12000;
		 total=realme+iphone;
		 gstBill=gst("mobiles", total);
		 totalWithGst=total+gstBill;
		return totalWithGst;
	}

	public int fashoin() {
		int shirt=500;
		int tshirt=500;
		 total=shirt+tshirt;
		 gstBill=gst("fashoin", total);
		 totalWithGst=total+gstBill;
		return totalWithGst;
	}
	public int gst(String catg,int bill) {// based catg,
		int gstAmt=0;
		if(catg.equals("mobiles")) {
			 gstAmt=(bill*10)/100;	
		}else if(catg.equals("electronics")){
			 gstAmt=(bill*15)/100;	
		}else if(catg.equals("toys")){
			 gstAmt=(bill*20)/100;
		}else {
			 gstAmt=(bill*18)/100;	
		}
		return gstAmt;
	}
	
	public int discount(int totalBill) {
		int discount=0;
		if(totalBill>5000 && totalBill<10000) {
			 discount=(totalBill*5)/100;
			
		}else if(totalBill>10000 && totalBill<50000) {
			 discount=(totalBill*10)/100;
			
		}else if(totalBill>50000 && totalBill<75000){
			 discount=(totalBill*20)/100;
		
		}else if(totalBill>75000 && totalBill<100000) {
			 discount=(totalBill*25)/100;
			
		}else if(totalBill>100000) {
			 discount=(totalBill*30)/100;
		
		}else {
			 discount=(totalBill*2)/100;
			
		}
		return discount;
	}
	public void totalBill() {
		int mobilesBill=mobiles();
		System.out.println("Mobiles Bill::"+mobilesBill);
		int fashoiBill=fashoin();
		System.out.println("fashoin Bill::"+fashoiBill);
		int totalBillWithGst=mobilesBill+fashoiBill;
		System.out.println("totalBill with GST:: "+totalBillWithGst);
		int discountAmt=discount(totalBillWithGst);
		int finalBillAfterDiscount=totalBillWithGst-discountAmt;
		System.out.println("finaBill to Pay:: "+finalBillAfterDiscount);
	}
	public static void main(String[] args) {
		Shopping3 s3=new Shopping3();
		s3.totalBill();
	}
}
