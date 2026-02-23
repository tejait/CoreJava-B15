package modifiers1;

import modifiers2.C;
import modifiers2.D;

  class A extends C{

	protected int id;
	
	protected void m1() {
		System.out.println("A class m1 method..");
	}
	
	public int ticketPrice() {
		int price=1000;
		int gst=100;
		int fare=50;
		int total=price+gst+fare;
		return total;
	}
	
	public static void main(String[] args) {
		A a=new A();
		System.out.println(a.id);
		a.m1();
		System.out.println(a.cid);
		a.cm1();
		
		B b=new B();
		System.out.println(b.bid);
		b.bm1();
		
		C c=new C();
		System.out.println(c.cid);
		c.cm1();
		
		D d=new D();
		System.out.println(d.did);
		d.dm1();
	}
}
