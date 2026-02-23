package oops;

public class VariablesData {
int k;
	public static void main(String[] args) {
		int id=10;
		System.out.println(id);
		    id=20;
		System.out.println(id);
		id=30;
	  System.out.println(id);
	  
	  int i=id;
	  int j=i;
	  System.out.println(i);
	  System.out.println(j);//
	  VariablesData vd=new VariablesData();
	  
	  vd.k=45;
	  System.out.println(vd.k);
	}
}
