package com.string;

public class NewString1stNum_Char {

	public static void main(String[] args) {
		String s="Java N0234 Selenium",sn="",num="";
		
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isDigit(c))
				num=num+c;
			else
			{
				sn+=c;
			}
			
		}
		String after=num+sn;
		System.out.println(after);
	}
}
