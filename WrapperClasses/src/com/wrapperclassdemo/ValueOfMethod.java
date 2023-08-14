package com.wrapperclassdemo;

public class ValueOfMethod {

	public static void main(String[] args) {
		
		int num=10;
		Integer i=Integer.valueOf(num);//Conversion of int to Integer
		System.out.println("i="+i);
		
		Integer j=Integer.valueOf("45");//Conversion of Integer to String
		System.out.println("j="+j);
		
		Integer k=Integer.valueOf("101",2);//String , int
		System.out.println("k="+k);

	}

}
