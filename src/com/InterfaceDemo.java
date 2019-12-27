package com;
// main interface method call here
public class InterfaceDemo {
	
	public static void main(String[] args)
	{
		connection.Con1 con=new oracal();
		con.display();
		
		oracal c=new oracal();
		c.rollback();
		c.commit();
		c.display();
		
	}

}
