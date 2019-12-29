package com;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Bchild extends AParent {
	
	@SuppressWarnings("null")
	public void m1ex()
	{
		System.out.println("Bchild m1 method");
      String abc=null;
		
		if(abc.equals(null))
			 System.out.println("is equal");
		 else
			 System.out.println("not equal");
		
	}
	//checked exception using throw keyword.
	public void m2ex() throws IOException
	{
		System.out.println("throw m2ex");
		InputStream input = new FileInputStream("c:\\data\\input-text.txt");
	}


}
