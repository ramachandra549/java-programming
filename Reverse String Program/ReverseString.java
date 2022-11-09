package com.programming;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.next();
	/*	int len=str.length();
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("Reverse String is :"+rev);
	*/	
		
//Array
	/*	char a[]=str.toCharArray();
		int len=a.length;
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println("Reverse String is :"+rev);
	*/	
		
		
//String Buffer
		StringBuffer sb= new StringBuffer(str);
		StringBuffer rev1=sb.reverse();
		System.out.println(rev1);
		
	}
}
