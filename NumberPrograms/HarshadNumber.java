package com.programming;

import java.util.Scanner;

public class HarshadNumber {
	/*
	 * Harshad number is completely divisible by sum of the digits of given number
	 * EX :
	 *   	18 = 1+8=9
	 *   		18 is completely divisible by 9
	 */

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number to check Harshad or not");
		int num=sc.nextInt();
		int org=num;
		int re,sum=0;
		while(org>0)
		{
			re=org%10;
			sum=sum+re;
			org=org/10;
		}
		if(num%sum==0)
			System.out.println("it is a harshad number");
		else
			System.out.println("it is not a harshad number");
	}
}
