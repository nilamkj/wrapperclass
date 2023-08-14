package com.wrapperclassdemo;

public class EnumTest {
	
	public enum Days
	{
		MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
	}

	public static void main(String[] args) {
		
		System.out.println(Days.MONDAY);
		System.out.println(Days.THURSDAY);
		
		//traversing the enum
		//values() method internally convert enumin arrays
		System.out.println("----enum-----");
		
		for(Days d:Days.values())
		{
			System.out.println(d);
		}
		System.out.println("------valueOf()-----");
		
		System.out.println("Value of Monday:"+Days.valueOf("MONDAY"));
		System.out.println("Value of Monday:"+Days.valueOf("MONDAY").ordinal());
		
		System.out.println("----enum----");
		for(Days d:Days.values())
		{
			System.out.println(d+"  :"+d.ordinal());
		}
	}

}
