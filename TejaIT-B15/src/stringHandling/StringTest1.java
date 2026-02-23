package stringHandling;

public class StringTest1 {
public static void main(String[] args) {
	// String is characters of sequence or character array
	// String is Objective Types
	// String is a class
	// String is Immutable class
	
	char[] ch= {'B','h','a','r','a','t','h'};
	System.out.println(ch);
	
	String s1=new String(ch);
	System.out.println(s1);
	
	String name="Nagendra";  // literal
	System.out.println(name);
	
	String name2=new String("Teja");  // String Object
	System.out.println(name2);
}
}
