package stringHandling;

public class Test2 {
public void m1(String str) {
	System.out.println("String...."+str);
}

public void m1(StringBuffer sbf) {
System.out.println("String Buffer  "+sbf);	
}

public void m1(StringBuilder sbu) {
System.out.println("String Builder  "+sbu);	
}

public static void main(String[] args) {
	Test2 t2=new Test2();
	//   t2.m1(null);  // ambiguity -
	
	t2.m1("Java");
	
	StringBuffer sbf=new StringBuffer("String buffer value");
	t2.m1(sbf);
	
	StringBuilder sbu=new StringBuilder("Builder");
	t2.m1(sbu);
	
	
}
}
