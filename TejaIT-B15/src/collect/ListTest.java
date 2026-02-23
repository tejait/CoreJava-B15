package collect;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListTest {
	
public void arrayListTest() {
    // <> - generic
	// <E>- element Type  - use only classes
	// type-  Integer, String, Double, Employee,Customer
	ArrayList<Integer> al=new ArrayList<Integer>();
	                   al.add(10);
	                   al.add(20);
	                   al.add(30);
	                   al.add(40);
	                   al.add(50);
	                   al.add(1, 25);
	                   al.remove(0);
	                   
	                   System.out.println(al.get(2));
	                   System.out.println("-----------------");
	         for(int i=0;i<al.size();i++) {
	        	 System.out.println(al.get(i));
	         } 
	         System.out.println("=================");
	         for(Integer val:al) {
	        System.out.println(val);	 
	         }	
}
public void linkedListTest() {
	LinkedList<Integer>   li=new  LinkedList<Integer>();
						  li.add(10);
						  li.add(20);
						  li.add(30);
						  li.add(1, 25);
	                     for(Integer i:li) {
	                    	System.out.println(i); 
	                     }
}

public void vectorTest() {
	Vector<String> v=new  Vector<String>();
					v.add("sai");
					v.add("kumar");
					v.add("chintu");
					v.add("siva");
					v.add("sri");
					
					for(String str:v) {
					System.out.println(str);	
					}
}

public void stackTest() {
Stack<String> s=new Stack<String>();
              s.push("sai");
			  s.push("kumar");
			  s.push("chintu");
			  s.push("siva");
			  s.push("sri");
			  s.pop();
			  s.pop();
			  s.pop();
			  //System.out.println("pop element "+s.peek());
			  System.out.println("==================");
			  for(String str:s) {
			  System.out.println(str);	
			  }

}

public static void main(String[] args) {
	ListTest listTest=new ListTest();
	//listTest.arrayListTest();
	//listTest.linkedListTest();
	//listTest.vectorTest();
	listTest.stackTest();
}
}
