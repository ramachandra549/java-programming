package com.string;

public class StringCls {

	public static void main(String[] args)
	{
		String s1="ramachandra ";
		String s2="Nayak";
		String modify=s1.toUpperCase();
		
		System.out.println("UpperCase :"+modify);
		System.out.println("Lower :"+s2.toLowerCase());
		System.err.println("Length :"+s1.length());
		System.out.println("Concat :"+modify.concat(s2));
		System.out.println("Extracting M :"+s1.charAt(2));
		System.out.println("Equals :"+s1.equals(s2));
		
	}

}
