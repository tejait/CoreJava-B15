package oops;

public class Abhibus implements PhonePe{
	// classes allows to write normal methods
	
	@Override
	public void ticketBooking() {
	     String from="Guntur";
	     String to="Hyderabad";
	     String name="sai";
	     int ticketPrice=1000;
		System.out.println("from:: "+from);
		System.out.println("to:: "+to);
		System.out.println("name:: "+name);
		System.out.println("ticket Price:: "+ticketPrice);
		//id=20;
		System.out.println(PhonePe.id);
	}

	public static void main(String[] args) {
		Abhibus ab=new Abhibus();
		ab.ticketBooking();
	}
}
