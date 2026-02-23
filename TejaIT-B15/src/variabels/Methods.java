package variabels;

public class Methods {

	public int mobile() {
		System.out.println("mobiles method");
		return 123;
	}
	public int amount() {
		System.out.println("amount method called");
		return 1200;
	}
	
	public static void main(String[] args) {
		Methods m=new Methods();
		        System.out.println(m.mobile());
		        int salaryAmount=m.amount();
		        System.out.println(salaryAmount);
		        System.out.println(m.amount());
		         int salaryAmountWithBonus=salaryAmount+500;
		         System.out.println(salaryAmountWithBonus);
	}
}
