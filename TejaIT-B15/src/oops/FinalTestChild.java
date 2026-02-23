package oops;

public class FinalTestChild extends FinalTestParent{
	final int id=13; // declaration
	@Override
	public void m1() {
		System.out.println("child m1 method...");
	}
	
	
	public void m2() {
		id=15;
		System.out.println(id);
	}
}
