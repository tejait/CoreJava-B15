package except;

public class InsufficientFundsException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public  InsufficientFundsException() {
		super();
	}
	
	public InsufficientFundsException(String s) {
        super(s);
    }
}
