package com.string;

public class SpecialWordsPalindrome {
	public static void main(String[] args) {
		String s="Rama chandra BoB nayak",w="";
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
				char f=w.charAt(0);
				char l=w.charAt(w.length()-1);
				if(Character.toUpperCase(f)==Character.toUpperCase(l))
				{
					System.out.println(w);
				}
				w="";
			}
		}
	}

}
