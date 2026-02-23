package variabels;

public class VariablesTest {

	public int abc() {
		int a=10;
		System.out.println(a);
		   a=12;
		   a=15;
		   System.out.println(a);
		   a=20;
		   a=5;
		System.out.println(a);
		
		return 0;
	}
	
	public static void main(String[] args) {
		VariablesTest vt=new VariablesTest();
		vt.abc();
	}
}
