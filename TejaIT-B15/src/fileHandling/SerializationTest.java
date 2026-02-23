package fileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationTest {
public static void main(String[] args) throws IOException {
	Customer c1=new Customer(101, "Raju", 123456L,123,111);
	System.out.println(c1);
	
	FileOutputStream fos=new FileOutputStream("C:\\Users\\chint\\OneDrive\\Documents\\filesData\\customer.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fos); // written code converts into Byetcode
                       oos.writeObject(c1); // writing object  
                       oos.close();
                       fos.close();
                       System.out.println("Serailization Done....");
}
}
