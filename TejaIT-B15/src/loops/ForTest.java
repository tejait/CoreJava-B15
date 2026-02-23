package loops;

public class ForTest {


public void test() {
	
	   // int i=10;         i>5;         i++;  // i+1;
	// initialization   condition  increment/decrement
	for(int i=1;  i<10; i++) {
		 //i=10    10<10=false   9+1=10;
		System.out.println(i); // execution- 1 2 3 4 5 6 7 8 9
	}

}

public void test2() {
	for(int i=1;i<10;i--) {
	System.out.println(i);	
	}
}
public static void main(String[] args) {
	ForTest ft=new ForTest();
	//ft.test();
	ft.test2();
}
}
