package practice;

public class Variables1 extends Variables2{

	String name="Teja IT";  // instance variable
	static double amount=123.45; // static variable
	
	int val=30;
	int defaultVal;  
	
	public void test() { // instance method
		int val=120;
		System.out.println(val);// default priority for local variable
		System.out.println(this.val); // this.instance variable
		System.out.println(super.val);// super.class variable
		defaultVal=124;
		System.out.println(defaultVal); // default variable
		
		int amount;
			amount=11;
		System.out.println(amount);// local varaibale must initialize before calling it.
	}
	
	public static void test2() {// static method
		System.out.println("static method....");
	}
	public static void main(String[] args) {
		int id=20; // local variable
	// class name  ref=new keyword  constructor	
		Variables1 v1=new Variables1(); // Object
		System.out.println(v1.name);  // ref.variableName
		System.out.println(Variables1.amount);// classname.variablename
		
	v1.test();   // ref.methodname
	Variables1.test2();  // classname.methodname
	
	}
}
