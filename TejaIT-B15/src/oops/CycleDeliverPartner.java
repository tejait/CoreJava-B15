package oops;

public class CycleDeliverPartner extends DeliveryPartner{

	public void ecoFriendly() {
		System.out.println("ecoFriendly delivery by Cycle...");
	}

	@Override
	public void deliverOrder() {
		System.out.println("deliver order by Cycle deliver partner..");
	}
	
	public static void main(String[] args) {
		CycleDeliverPartner cdp=new CycleDeliverPartner();
		cdp.acceptOrder();
		cdp.pickupOrder();
		cdp.ecoFriendly();
		cdp.deliverOrder();
	}
}
