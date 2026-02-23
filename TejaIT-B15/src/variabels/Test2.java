package variabels;

public class Test2 {

	int id=20;
	String name="Teja IT";
	
	public void m1() {
		System.out.println("this is m1 method");
	}
	
	public void m2() {
		System.out.println("this is m2 method..");
	}
	
	public static void main(String[] args) {
		Test2 t2=new Test2();  //object - class- instance data
		
		int idval=t2.id;
		String nameVal=t2.name;
		t2.m1();
		t2.m2();
	}
	
}
