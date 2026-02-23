package oops;

public class CarDeliveryPartner extends DeliveryPartner{
public void largeOrderSupport() {
	System.out.println("large order support by car delivery..");
}

@Override
public void deliverOrder() {
	System.out.println("deliver order by car deliver partner..");
}


public static void main(String[] args) {
	CarDeliveryPartner cdp=new CarDeliveryPartner();
	cdp.acceptOrder();
	cdp.pickupOrder();
	cdp.largeOrderSupport();
	cdp.deliverOrder();
}
}
