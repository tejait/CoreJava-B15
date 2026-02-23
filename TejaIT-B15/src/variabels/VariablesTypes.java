package variabels;

public class VariablesTypes {

	 String name="Teja IT"; //Instance variable
	
	
	public static void main(String[] args) {
		 int id=10; //local variable
		System.out.println(id);
		
		VariablesTypes vt1=new VariablesTypes();
		System.out.println(vt1.name);// Teja IT
		
		Product p1=new Product();
		System.out.println(p1.name);// Iphone
		System.out.println(Product.amt);
		
		
	}



}
