package com.string;

public class CountLower_UpperCaseChar {

	public static void main(String[] args) {
		String s="Rama Chandra Nayak";
		int lcount=0,ucount=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isUpperCase(c))
				ucount++;
			if(Character.isLowerCase(c))
				lcount++;
			
		}
		System.out.println(lcount);
		System.out.println(ucount);
	}
}
