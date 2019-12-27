package com;
//handling exception using try and catch.
public class TryException {

	public static void main (String[] args) {
		
		System.out.println("main start");
		try {
			System.out.println("try--start");
			int x=10/0;
			System.out.println("try--end"+x);
		}catch (Exception e) {
			System.out.println(e);//exception will be show.
		}
		System.out.println("main end");
}
}
