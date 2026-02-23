package variabels;

public class MethodsTypes {

	
	public int m1() { // instance method
		return 123;
	}
	public static int m2() {// static method
		return 1234;
	}
	
	public static void main(String[] args) {
		MethodsTypes mt=new MethodsTypes();
		System.out.println(mt.m1());
		System.out.println(MethodsTypes.m2());
	}
}
