package com.string;

public class AsciiValues {

	public static void main(String[] args) {
		String s="Ramachandra";
		
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			System.out.println(c+" "+(int)c);
		}
		
	}
}
