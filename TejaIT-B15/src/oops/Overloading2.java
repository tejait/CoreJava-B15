package oops;

public class Overloading2 {
// if no.parameters are same, datatypes different
	
	public void m1(int id) {
	System.out.println("Int parameter "+id);	
	}
	
	public void m1(String name) {
		System.out.println("String parameter "+name);
	}
	
	public void m1(double  amt) {
		System.out.println("double parameter: "+amt);	
	}
	
	public static void main(String[] args) {
		Overloading2 ov2=new Overloading2();
		ov2.m1(10);
		ov2.m1("Teja IT");
		ov2.m1(12.55);
	}
}
