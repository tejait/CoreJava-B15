package variabels;

public class Methods1 {

	public byte id() {
		return 123;
	}
	public short num() {
		return 1234;
	}
	
	public int value() {
	return 12345;	
	}
	public static void main(String[] args) {
		Methods1 m1=new Methods1(); 
		byte val=m1.id();// 123
		System.out.println(val);
		short val1=m1.num();// 1234
		System.out.println(val1);
		int val2=m1.value();// 12345
		System.out.println(val2);
		
	}
}
