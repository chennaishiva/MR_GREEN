package org.tcs;
//child class 2
public class Client extends Company {
	
	public void clientAddress() {
		System.out.println("Client Address is OMR");
	}
	
	public static void main(String[] args) {
		Client c = new Client();
		c.clientAddress();
		c.companyId();
		c.companyName();
	}

}
