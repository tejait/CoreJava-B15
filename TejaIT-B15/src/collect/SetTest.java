package collect;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public void hashSetTest() {
		Set<Integer> set=new HashSet<Integer>();
		             set.add(12);
		             set.add(14);
		             set.add(16);
		             set.add(19);
		             set.add(14);
		             set.add(null);
		             for(Integer i:set) {
		            	System.out.println(i); 
		             }
	}
	
	public static void main(String[] args) {
		SetTest set=new SetTest();
		set.hashSetTest();
	}
}
