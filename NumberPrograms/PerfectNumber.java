package com.programming;

import java.util.Scanner;

public class PerfectNumber {

	/*
	 * Ex : sum of the divisors are equal to the given number
	 * 6 -> 1+2+3 =6
	 * 28 -> 1+2+4+7+14=28 perfect number
	 */
/*	public static void main(String[] args) {
		int num=6;
		boolean b=isPerfect(num);
		if (b)
			System.out.println("its a perfect number");
		else
			System.out.println("its not perfect number");
	}
	public static boolean isPerfect(int num)
	{
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==num)
		{
			return true;
		}
		return false;
	}
	
*/	
//Approach :2	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<num;i++)
		{
			
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==num)
		{
			System.out.println("its a perfect");
		}
		else
			System.out.println("its not");
	}
}
