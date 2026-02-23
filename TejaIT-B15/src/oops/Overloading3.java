package oops;

public class Overloading3 {
	// if no.of parameter same, then data types differrent
	// no.of paraemeters are same, datatypes also same then order should be differrent
public void m1(int id,String name) {
	System.out.println("id:: "+id+"   name:: "+name);
}

public void m1(String name,int id) {
	System.out.println("name:: "+name+"  id"+id);
}

public static void main(String[] args) {
	Overloading3 ov3=new Overloading3();
	ov3.m1("Java Stop!", 15);
	ov3.m1(10, "Teja IT");
	
}
}
