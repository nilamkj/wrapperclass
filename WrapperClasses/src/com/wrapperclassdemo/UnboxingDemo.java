package com.wrapperclassdemo;

public class UnboxingDemo {

	public static void main(String[] args) {
		
		Integer i=new Integer(10);
		int j=i.intValue();  //converting integer to int explicitly
		
		System.out.println("j="+j);
		
		//java 5
		int k=i;  //implicit
		System.out.println("k="+k);
	}

}
