package oops;

public interface PhonePe {
// data hiding  -  abstrat methods
// data implementation - normal methods	
	
	// interface allows only abstract methods
	
public static final	int id=10;
	

public PhonePe() {
	// we can't create constructor
}

   {
	   //we can't create instance blocks
   }
  static {
	  // we can't write static blocks 
   }
	public abstract void ticketBooking(); // declaration- abstract methods
	public static void main(String[] args) {
		PhonePe ph=new PhonePe(); // we can't create Object
	}
}
