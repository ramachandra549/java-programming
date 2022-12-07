package com.programming;

public class StrongNumber {

	/*
	 * Strong number is sum of the Factorial of digits is equal to the Given number
	 * 123 =1! + 2! + 3! = 9  it is not  Strong Number
	 * 145 =1! + 4! + 5! = 145 it is Strong Number
	 * 
	 */
	public static int fact(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
		
	}
	public static void main(String[] args) {
		
		int num=123;
		int temp=num;
		int sum=0;
		while(num>0)
		{
			int re=num%10;
			sum=sum+fact(re);
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("It is a Strong Number");
		}
		else
			System.out.println("it is not strong number");
	}
}
