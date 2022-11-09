package com.programming;

import java.util.Scanner;

public class ReverseEachWord {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter The String :");
//		String str=sc.next();
	/*	String str="My name is Ramachandra Nayak";
		String[] words=str.split(" ");
		String reverseString="";
		for(String w:words)
		{
			String revWord="";
			for(int i=w.length()-1;i>=0;i--)
			{
				revWord=revWord+w.charAt(i);
			}
			reverseString=reverseString+revWord+" ";
		}
		System.out.println(reverseString);
	*/	
//StringBuilder
	
		String str="wel come to java";
		String[] words=str.split(" ");
		String reverse="";
		for(String w:words)
		{
			StringBuilder sbl=new StringBuilder(w);
			sbl.reverse();
			reverse=reverse+sbl.toString()+" ";
		}
		System.out.println(reverse);
	}
}
