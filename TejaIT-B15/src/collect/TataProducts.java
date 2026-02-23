package collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TataProducts implements Comparable<TataProducts>{
 int id;
 String name;
 double price;
public TataProducts(int id, String name, double price) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
}

@Override
public int compareTo(TataProducts o) {
	return this.id-o.id; // based on ID
	//return (int) (this.price-o.price); // based on price
	//return this.name.compareTo(o.name); // based on name
}

@Override
public String toString() {
	return "TataProducts [id=" + id + ", name=" + name + ", price=" + price + "]";
}

public static void main(String[] args) {
	TataProducts t1=new TataProducts(101, "Tcs", 12.5);
	TataProducts t2=new TataProducts(103, "Tanishqu", 32.5);
	TataProducts t3=new TataProducts(102, "Tata Salt", 2.5);
	TataProducts t4=new TataProducts(106, "Titan", 82.5);
	TataProducts t5=new TataProducts(105, "Tata Water", 62.5);
	
	//t1,t2,t3,t4,t5- 
	
	List<TataProducts> list=new ArrayList<TataProducts>();
					   list.add(t1);
					   list.add(t2);
					   list.add(t3);
					   list.add(t4);
					   list.add(t5);
					 
					   Collections.sort(list);
					   for(TataProducts i:list) {// t1,t2,t3,t4,t5
						// System.out.println(i.id+" "+i.name+" "+i.price); 
						   System.out.println(i);
					   }
	
}

}
