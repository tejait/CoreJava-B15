package methods;

public class Methods3 {

	public void m1() {
		System.out.println("zero parameter");
	}
	
	public void m2(int id) {
		System.out.println("one Parameter.. int value:: "+id);
	}
	public void m3(String name) {
		System.out.println("one Parameter.. String value:: "+name);
	}
	public void m4(int i,String s) {
		System.out.println("two parameters.."+i+"   "+s);
	}
	public void m5(float f,int b,double d) {
		System.out.println("float::"+f+"   byte:: "+b+" double::"+d);
	}
	public void m6(float f,double d) {
		System.out.println("float:: "+f+"  double::"+d);
	}
	public static void main(String[] args) {
		Methods3 m3=new Methods3();
		m3.m1();
		m3.m2(10);
		m3.m3("Teja IT");
		m3.m4(15, "Your Java Stop!");
		m3.m5(1.23f, 12, 12.5);
		m3.m6(12.34f, 11.45);
	}
}
