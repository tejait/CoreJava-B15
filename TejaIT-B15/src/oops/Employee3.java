package oops;

public class Employee3 {

	int id;   //0
	String name; //null
	long salary; //0
	
	public Employee3() {
		System.out.println("zero arg constructor...");
	}
	
	public Employee3(int empId) {
		id=empId; // re-initialization
	System.out.println("Int arg constructor      "+empId);	
	}
	
	public Employee3(int empId,String empName) {
		id=empId;  //re-initialized
		name=empName;
		System.out.println("Int and String arg constructor...");
	}
	
	public Employee3(int empId,String empName,long empSalary) {
		id=empId;
		name=empName;
		salary=empSalary;
		System.out.println("3 args constructor...");
	}
	public static void main(String[] args) {
		Employee3 e3=new Employee3();  // object
		System.out.println(e3.id+"   "+e3.name+"   "+e3.salary);
		
		Employee3 e4=new Employee3(15);
		System.out.println(e4.id+"   "+e4.name+"   "+e4.salary);
		
		Employee3 e5=new Employee3(20,"sai");
		System.out.println(e5.id+"   "+e5.name+"   "+e5.salary);
		
		Employee3 e6=new Employee3(25,"Yaseen",20000);
		System.out.println(e6.id+"   "+e6.name+"   "+e6.salary);
	}
	
}


