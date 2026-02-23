package fileHandling;

import java.io.Serializable;

public class Customer implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1837483748734L;
int cid;
String name;
long cardNum;
transient int cvv; // cannot serialize
static int pin; // cannot serialize


public Customer(int cid, String name, long cardNum, int cvv, int pin) {
	super();
	this.cid = cid;
	this.name = name;
	this.cardNum = cardNum;
	this.cvv = cvv;
	this.pin = pin;
}


@Override
public String toString() {
	return "Customer [cid=" + cid + ", name=" + name + ", cardNum=" + cardNum + "]";
}



}
