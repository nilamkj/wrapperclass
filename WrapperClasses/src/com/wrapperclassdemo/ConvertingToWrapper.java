package com.wrapperclassdemo;

public class ConvertingToWrapper {

	public static void main(String[] args) {
		
		double num=10;
		Double i=Double.valueOf(num);
		System.out.println("i="+i);
		
		System.out.println("-----Integer-----");
		Integer i1=new Integer(10);
		Integer j=new Integer("1012");
		
		System.out.println("i1:"+i1);
		System.out.println("j:"+j);
		
		System.out.println("-----Double-----");
		Double d=new Double(45.23);
		Double d1=new Double("78.56");
		
		System.out.println("d:"+d);
		System.out.println("d1:"+d1);
		
		System.out.println("-----Character-----");
		Character ch=new Character('A');
		//Character ch1=new Character("T");
		//Character ch1=new Character(97);
		//Character ch1=new Character("ABC");//error: The constructor Character(String) is undefined
		System.out.println("ch:"+ch);
			
		System.out.println("-----Byte-----");
		byte bb=55;
		String str="45";
		Byte b=new Byte(bb);
		Byte y=new Byte(str);
		System.out.println("byte:"+bb);
		System.out.println("byte:"+str);
		
		System.out.println("-----Long-----");
		long l=11;
		String strg="99";
		Long l1=new Long(l);
		Long l2=new Long(strg);
		System.out.println(l1);
		System.out.println(l2);
		
		System.out.println("-----Boolean-----");
		Boolean b1=new Boolean("True");
		System.out.println(b1);
		
	}

}
