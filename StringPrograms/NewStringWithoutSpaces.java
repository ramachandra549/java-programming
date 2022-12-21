package com.string;

public class NewStringWithoutSpaces {

	public static void main(String[] args) {
		
		String s="Ja va  And  Sele nium",sn="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(!Character.isWhitespace(c))
			{
				sn+=c;
			}
		}
		System.out.println(sn);
	}
}
