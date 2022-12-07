package com.programming;

import java.util.Scanner;

public class PrimeNumber2 {

	/*
	 * The number which has only two factors 1 and itself,
	 * 7=1,7
	 * 13=1,13
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number to check Prime or Not :");
		int num=sc.nextInt();
		int count=0;
		
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println("its a prime number");
				
			}
			else
				System.out.println("Not a prime number");
		}
		
	}
}
