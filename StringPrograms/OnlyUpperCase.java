package com.string;

public class OnlyUpperCase {

	public static void main(String[] args) {
		
		String s="Chandu And Nayak";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isUpperCase(c))
				System.out.print(c+" ");
		}
		
	}
}
