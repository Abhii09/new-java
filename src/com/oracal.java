package com;
//interface implements here (connection and con1 is nested interface) call connection.con1.
public class oracal implements connection.Con1  {

	
	public void commit() {
		System.out.println("this is commit");
	}


	public void rollback() {
		System.out.println("this is rollback");
		
	}
	
	public void display() {
		System.out.println("oracla display");
	}

}
