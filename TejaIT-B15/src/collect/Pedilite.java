package collect;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Pedilite {
Integer pid;
String pname;
Double price;
public Pedilite(Integer pid, String pname, Double price) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.price = price;
}

@Override
public String toString() {
	return "Pedilite [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
}

public static void main(String[] args) {
	Pedilite p1=new Pedilite(102, "fevicol", 10.5);
	Pedilite p2=new Pedilite(103, "m-seal", 5.5);
	Pedilite p3=new Pedilite(101, "fevikwik", 12.5);
	Pedilite p4=new Pedilite(104, "anabond", 40.5);
	
	List<Pedilite> list=Arrays.asList(p1,p2,p3,p4);
	
	//BasedOnId onId=new BasedOnId();
	//Collections.sort(list, onId);
	
	//Collections.sort(list, new BasedOnName());
	//Collections.sort(list, new BasedOnPrice());
	String property="price";
	String orderTypes="ASC";
	
	if(property.equals("pname")) {
		Collections.sort(list, new BasedOnName());
	}else if(property.equals("pid")) {
		Collections.sort(list, new BasedOnId());
	}else if(property.equals("price")) {
		Collections.sort(list, new BasedOnPrice());
	}
	
	if(orderTypes.equals("DESC")) {
		Collections.reverse(list);
	}
	
	for(Pedilite pedilite:list) {
	System.out.println(pedilite);	
	}
}


}
