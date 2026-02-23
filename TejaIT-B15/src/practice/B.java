package practice;
//child
public class B extends A{
String name="Teja";

public void car() {
	System.out.println("B class Car method..");
}

public void bike() {
	System.out.println("child bike...");
}
public static void main(String[] args) {
	B b=new B();  //child-sub class
	b.car();
	System.out.println(b.name);
	System.out.println(b.id);
	b.gold();
	
	System.out.println("====================");
	
	A a=new A(); //parent
	System.out.println(a.id);
	a.gold();
	//a.car();   parent obj can't access child data
	//System.out.println(a.name);
	a.car();
	System.out.println("==============");
	A a1=new B();
	a1.car();
	a1.gold();
	//a1.bike();
}
}
