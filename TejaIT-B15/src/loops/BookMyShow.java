package loops;

public class BookMyShow {

	
	public void ticketBooking(String catg) {
		if(catg.equals("platinum")) {
	System.out.println("your seat allocatted in platinum category");
		}else if(catg.equals("gold")){
			System.out.println("your seat allocatted in gold category");		
		}else if(catg.equals("silver")) {
			System.out.println("your seat allocatted in silver category");
		}else {
			System.out.println("your seat allotted in nela ticket");
		}
	
	}
	
	public static void main(String[] args) {
		BookMyShow bms=new BookMyShow();
		           bms.ticketBooking("silver");
	}
}

