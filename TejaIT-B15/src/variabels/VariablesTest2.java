package variabels;

public class VariablesTest2 {
	int id=30; //instance variable
           
	public int xyz() {
	 int   id=20;
	      this.id=30; //
		   id=40;
	System.out.println(id);  //20
	System.out.println(this.id);//10
	System.out.println(id); 
	System.out.println(id);
		return 0;
	}
	
	public static void main(String[] args) {
		VariablesTest2 vt2=new VariablesTest2();
		vt2.xyz();
	}
}
