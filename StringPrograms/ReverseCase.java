package com.string;

public class ReverseCase {

	public static void main(String[] args) {
		
		String s="Whatsapp Buddy",rev="";
		
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isUpperCase(c))
				rev+=Character.toLowerCase(c);
			else
				rev+=Character.toUpperCase(c);
			
		}
		System.out.println(rev);
	}
}
