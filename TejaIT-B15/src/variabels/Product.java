package variabels;

public class Product {
	
      String name="Iphone"; // instance variabale
      
    static  double amt=55000.99; // static variabale
      
	public static void main(String[] args) {
		int prodId=123;
		System.out.println(prodId);
		
		Product prod=new Product();    // OBJECT
		System.out.println(prod.name); // ref.variable
		
		System.out.println(amt); // classname.variable name
	}
}
