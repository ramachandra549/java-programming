package com.string;

public class CountOnlyUpper {

	public static void main(String[] args) {
		
		String s="Chandu Nayak";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isUpperCase(c))
			{
				System.out.println(c);
				count++;
			}
		}
		System.out.println(count);
	}
}
