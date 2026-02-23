package stringHandling;

public class StringTest2 {
public static void main(String[] args) {
	//SCP- doesn't allow duplicate objects
	// before creating a new object in SCP, the object will compare with .equals methods
	// if the same object available in SCP, new object won't create
	// but in heap always create new Object, it doesn't consider duplication, bcz it doesn't compare with .equals
	                              // literal - scp
	String s1=new String("java"); // Object - Heap
	String s2="Teja";  // literal - SCP
	String s3=new String("java");  
	String s4="Teja";
	String s5="java";
	String s6=new String("Teja");
	String s7="Bharath";
	String s8="Teja";
	String s9=new String("Teja");
	// ==    compares the object references (address)
	
	
	System.out.println(s1==s2);// false
	System.out.println(s1==s3); // false
	System.out.println(s2==s4); // true
	System.out.println(s4==s5); // false
	System.out.println(s6==s9);// false
	System.out.println("========================");
	// .equals compares the content, it deosn't care about address, and memory location
	System.out.println(s1.equals(s2));
	System.out.println(s1.equals(s3));
	System.out.println(s2.equals(s4));
	System.out.println(s6.equals(s9));
	
	
	
	
	
	
	
	
	
	
	
}
}
