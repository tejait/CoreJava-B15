package oops;

public class BikeDeliveryPartner extends DeliveryPartner{

	public void wearHelmet() {
		System.out.println("Bike deliver partner wear Helemet..");
	}

	@Override
	public void deliverOrder() {
		System.out.println("deliver order by Bike deliver partner..");
	}
	
	public static void main(String[] args) {
		BikeDeliveryPartner bdp=new BikeDeliveryPartner();
		bdp.acceptOrder();
		bdp.pickupOrder();

		bdp.wearHelmet();
		bdp.deliverOrder();
		
	}
}
