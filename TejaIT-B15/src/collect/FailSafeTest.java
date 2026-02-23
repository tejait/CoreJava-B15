package collect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeTest {
	// fail - safe
public void onMap() {
	Map<Integer, String> map=new ConcurrentHashMap<Integer, String>();
	                     map.put(102, "AMC");
	                     map.put(105, "KFC");
	                     map.put(103, "Dominos");
                         map.put(106, "MC Donalds");
	                     map.put(104, "Pizza Hut");	
	                     
	               for(Entry<Integer, String> entry:map.entrySet()) {
	            	   if(entry.getKey()==103) {
	            		// map.put(108, "Burger King"); 
	            		   map.remove(103);
	            	   }
	                  System.out.println(entry);  	 
	                  }
	               
	               System.out.println("==========");
	               for(Entry<Integer, String> entry:map.entrySet()) {
	            	   System.out.println(entry);
	               }
}
public void onList() {
	List<Integer> li=new CopyOnWriteArrayList<Integer>();
	li.add(10);
	li.add(20);
	li.add(30);
	li.add(40);
	
	for(Integer i:li) {
		if(i==20) {
			//li.add(55);
			li.remove(1);
		}
		System.out.println(i);
	}
	
	System.out.println("=============");
	for(Integer i:li) {
		System.out.println(i);
	}
}


	public static void main(String[] args) {
		FailSafeTest fst=new FailSafeTest();
		fst.onMap();
		//fst.onList();
	}
}
