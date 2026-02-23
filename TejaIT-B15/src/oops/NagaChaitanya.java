package oops;

public class NagaChaitanya extends Nagarjuna{

	@Override
	public void  car() {
		System.out.println("child car");
	} 
	
	public void restuarent() {
		System.out.println("child restuarent");
	}
	
	public static void main(String[] args) {
		NagaChaitanya n1=new NagaChaitanya();
		n1.car();     
		n1.restuarent();
		n1.land();
		n1.house();
		n1.annpurnaStudio();
		n1.cycle();
		
	}
}
