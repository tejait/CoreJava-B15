package oops;

public class Nagarjuna extends NageswarRao{

	public void land() {
		System.out.println("parent land..");
	}
	
	public void house() {
		System.out.println("parent house...");
	}
	
	public void car() {
		System.out.println("parent car");
	}
	public static void main(String[] args) {
		Nagarjuna n=new Nagarjuna();
		n.land();
		n.house();
		n.car();
		n.annpurnaStudio();
		n.cycle();
		//n.car();
	}
}
