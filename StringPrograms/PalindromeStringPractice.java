package com.string;

public class PalindromeStringPractice {

	public static void main(String[] args) {
		String str="Anna",rev="";
		String org=str;
		for(int i=str.length()-1;i>=0;i--)
		{
			rev+=str.charAt(i);
		}
		System.out.println(rev);
		
	}
}
