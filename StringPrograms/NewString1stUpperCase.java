package com.string;

public class NewString1stUpperCase {

	public static void main(String[] args) {
		String s="Java AND Selenium",sn="",up="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isUpperCase(c))
				up+=c;
			else
				sn+=c;
		}
		String after=up+sn;
		System.out.println(after);
		
	}
}
