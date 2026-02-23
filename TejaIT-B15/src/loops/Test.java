package loops;

public class Test {
	public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            // Repeats "*" i times for each row
            System.out.println("*".repeat(i));
        }
    }
	  public static void main2(String[] args) {
	        int rows = 5;

	        for (int i = 1; i <= rows; i++) {
	            // Inner loop for leading spaces
	            for (int j = i; j < rows; j++) {
	                System.out.print(" ");
	            }
	            // Inner loop for stars
	            for (int k = 1; k <= (2 * i - 1); k++) {
	                System.out.print("*");
	            }
	            // Move to the next line
	            System.out.println();
	        }
	    }
	public static void main1(String[] args) {
        int rows = 5; // Number of rows to print
        for (int i = 1; i <= rows; i++) { 	            
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line
        }
    }
}
