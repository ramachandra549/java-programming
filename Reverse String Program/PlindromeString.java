package com.programming;

import java.util.Scanner;

public class PlindromeString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.next();
		int len=str.length();
		String rev="";
		String org_str=str;
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(org_str==rev)
		{
		System.out.println(rev);
		}
		else
		{
			System.out.println(rev+" :is not Palindrome");
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
}
