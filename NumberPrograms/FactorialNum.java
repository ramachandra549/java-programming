package com.programming;

public class FactorialNum {

	public static void main(String[] args) {
		
		int num=5;
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		for(int i=num;i>=1;i--)
		{
			fact=fact*1;
		}
		
		System.out.println(fact);
		
		
		
	}
}
