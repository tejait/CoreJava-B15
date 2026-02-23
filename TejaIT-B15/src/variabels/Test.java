package variabels;

public class Test {

	String name="Teja IT";   //instance var- inside the class-heap
	static double amt=12.55; //static variable- method
	
	
	public void m1() {
	System.out.println("m1 instance method");	
	
	}
	public static void m2() {
		System.out.println("m2 static method..");
	}
	
	public static void main(String[] args) {
		int id=10;  // local variable - stack
		    id=20;	
		System.out.println(id);

	    Test t1=new	Test();
		System.out.println(t1.name);	
		t1.m1();
		
		System.out.println(Test.amt);
		Test.m2();
	}
}
