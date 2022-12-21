package com.string;

public class CountVowelsInString {

	public static void main(String[] args) {
		String s="my name is Ramachandra nayak";
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			char u=Character.toUpperCase(c);
			if(u=='A'||u=='E'||u=='I'||u=='O'||u=='u')
			{
				count++;
			System.out.print(u+" ");
			}
			
		}
		
		System.out.println(count);	
	}
}