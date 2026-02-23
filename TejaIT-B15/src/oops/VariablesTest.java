package oops;

public class VariablesTest extends VariablesParent{

	int id=10;  // instance varible
	
	public void test() {
		int id=20; // local vairble
		System.out.println(id);
		System.out.println(id);
		System.out.println(this.id);
		System.out.println(super.id);
	}
	
	public static void main(String[] args) {
		VariablesTest vt=new VariablesTest();
		vt.test();
	}
	
}
