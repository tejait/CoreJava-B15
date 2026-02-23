package except;

public class ErrorTest {

	public void m1() {
		//StackOverflowError
		
		System.out.println("m1 method");
		m2();
	}
	
	public void m2() {
		System.out.println("m2 method");
		m3();
	}
	public void m3() {
		System.out.println("m3 method..");
		m1();
	}
	public static void main(String[] args) {
		ErrorTest et=new ErrorTest();
		et.m1();
		//et.m2();
	}
}
