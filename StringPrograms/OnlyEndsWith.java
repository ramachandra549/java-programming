	package com.string;

public class OnlyEndsWith {

	public static void main(String[] args) {
		String s="hello Rama chandra nayak ",w="";
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
				if(w.endsWith("a"))
				{
					System.out.println(w);
				}
					w="";
			}
		}
		
	}
}
