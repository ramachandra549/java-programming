package com.string;

public class OnlyStartsWith {

	public static void main(String[] args) {
		String s="Hey this is Rama Chandra Nayak ",w="";
		s+=" ";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			
			if(c!=' ')
			{
				w+=c;
			}
			else
			{
				if(w.startsWith("R"))
				{
					System.out.println(w);
				}
				w="";
			}
		}
	}
}
