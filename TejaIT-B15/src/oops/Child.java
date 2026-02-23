package oops;

public class Child extends Parent{
	
@Override	
public void m1(int id) {
	System.out.println("child m1 method..");
}

public void m2() {
	System.out.println("child m2 method..");
}

public static void main(String[] args) {
	Child c=new Child();
	c.m1(10);
	c.m2();
}
}
