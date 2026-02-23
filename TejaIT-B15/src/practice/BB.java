package practice;

public class BB extends AA{

	@Override
	public void m1() {
		System.out.println("child class m1 method");
	}
	
	@Override
	public void m2() { // private methods we can't override
		System.out.println("child class m2 method");
	}
	
	@Override
	public void m3() { // final methods we can't override
		System.out.println("child class m3 method");
	}
	
	@Override
	public void m4() { // static methods we can't override
		System.out.println("child class m4 method");
	}
}
