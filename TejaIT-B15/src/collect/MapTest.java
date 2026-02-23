package collect;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapTest {
	
	public void hashMapTest() {
		//panNum       Id
		//  key       value 
		Map<String, String> map=new HashMap<String, String>();
		                    map.put("BHS123GH", "Bharath");  // entry
		                    map.put("NAS456GH", "Nagendra");
		                    map.put("NAV789GH", "Naveen");
		                    map.put("MAN123GH", "Manjith");
		                    map.put("NAV789GH", "Navaneeth");
		                    map.put("SAI123GH", "Bharath");
		                    map.put(null, "Yaseen");
	for(Entry<String, String> entry:map.entrySet()) {
		System.out.println(entry.getKey().hashCode());
	}	                 
				                    
	}
	public void linkedHashMapTest() {
		Map<String, String> map=new LinkedHashMap<String, String>();
        map.put("BHS123GH", "Bharath");  // entry
        map.put("NAS456GH", "Nagendra");
        map.put("NAV789GH", "Naveen");
        map.put("MAN123GH", "Manjith");
        map.put("NAV789GH", "Navaneeth");
        map.put("SAI123GH", "Bharath");
        map.put(null, "Yaseen");
for(Entry<String, String> entry:map.entrySet()) {
System.out.println(entry);
}	                 
	}
	
	public void treeMapTest() {
		// sorting order
		Map<String, String> map=new TreeMap<String, String>();
        map.put("BHS123GH", "Bharath");  // entry
        map.put("NAS456GH", "Nagendra");
        map.put("NAV789GH", "Naveen");
        map.put("MAN123GH", "Manjith");
        map.put("NAV789GH", "Navaneeth");
        map.put("SAI123GH", "Bharath");
        //map.put(null, "Yaseen");
        map.put("ABC123", null);
for(Entry<String, String> entry:map.entrySet()) {
System.out.println(entry);
}
	}
	public void hashTableTest() {
		Hashtable<String, Integer> ht=new Hashtable<String, Integer>();
		ht.put("AB123", 101);
		ht.put("BC234", 102);
		ht.put("YZ123", 104);
		ht.put("KL123", 103);
		//ht.put(null, 106);
		ht.put("ML345", null);
		for(Entry<String, Integer> entry:ht.entrySet()) {
		//System.out.println(entry.getKey()+"   "+entry.getValue());	
			System.out.println(entry);
		}
		
	}
	
	
public static void main(String[] args) {
	MapTest mt=new MapTest();
	//mt.hashMapTest();
	//mt.linkedHashMapTest();
	//mt.treeMapTest();
	mt.hashTableTest();
}
}
