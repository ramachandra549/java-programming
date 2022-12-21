package com.string;

public class NewStringContainsUpper {

	public static void main(String[] args) {
		String s="Java And Selenium",sn="";
		
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isUpperCase(c))
			sn=sn+c;
			
		}
		System.out.println(sn+" ");
	}
}
