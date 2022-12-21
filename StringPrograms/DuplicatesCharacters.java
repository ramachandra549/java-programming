package com.string;

public class DuplicatesCharacters {

	public static void main(String[] args) {
		
		String s="Javaaaa  andd Seleniummmm";
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			int index=s.indexOf(c,i+1);
			if(index==-1)
			{
				sb.append(c);
			}
		}
		System.out.println(sb);
		
	}
}
