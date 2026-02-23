package fileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	FileInputStream fis=new FileInputStream("C:\\Users\\chint\\OneDrive\\Documents\\filesData\\customer.txt");
    ObjectInputStream ois=new ObjectInputStream(fis);
                     Object obj=ois.readObject();
                     
                     Customer c=(Customer)obj;
                     System.out.println(c);
					 ois.close();
					 fis.close();
                     
}
}
