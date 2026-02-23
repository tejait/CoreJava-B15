package collect;

public class HashCodeTest {
public static void main(String[] args) {
	int i=10;
	int j=20;
	//10<20;
	System.out.println(i==j);
	
	
	String s1="Bharath";
	String s2="Bharath";
	String s3="Nazeer";
	System.out.println(s1.equals(s2));// compares the content
	
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	// if the content is same then hashcode will be same
	System.out.println(s3.hashCode());
}
}
