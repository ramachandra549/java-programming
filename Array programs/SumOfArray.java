package com.programming;

public class SumOfArray {

	public static void main(String[] args) {
		
		int a[]= {5,10,15,10,5,5};
		int sum=0;
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
//ForEach Loop
		for(int num:a)
		{
			sum=sum+num;
		}
		System.out.println(sum);
		
		
		
		
		
		
	}
}
