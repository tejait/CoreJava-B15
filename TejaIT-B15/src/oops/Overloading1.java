package oops;

public class Overloading1 {
	// same class - method name is same, with no.of parameters differrent
public void m1() {
	System.out.println("this is m1 method..");
}

public void m1(int id) {
System.out.println("this is m1 method... id::"+id);
}

public void m1(int i,String name) {
	System.out.println("m1 method.. i::"+i+" name::"+name);
}

public static void main(String[] args) {
	Overloading1 o1=new Overloading1();
	                o1.m1();
	                o1.m1(123);
	                o1.m1(10, "Teja");
}
}

