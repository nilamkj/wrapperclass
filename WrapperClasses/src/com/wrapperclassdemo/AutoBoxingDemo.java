package com.wrapperclassdemo;

public class AutoBoxingDemo {

	public static void main(String[] args) {
		
		//Conversion from int to Integer
		int num=20;
		Integer i=Integer.valueOf(num);//Conversion of int to Integer
		System.out.println("i="+i);
		
		//java 1.5
		
		Integer j=num;
		//Integer k=new Integer(num);
		System.out.println("j="+j);
		System.out.println(j);
	}

}
