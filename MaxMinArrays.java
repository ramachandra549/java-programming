package com.programming;

public class MaxMinArrays {

	public static void main(String[] args) {
		
		int a[]= {11,10,3,5,5,6};
		
		int max=a[0];
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			else if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("maximum number is :"+max);
		System.out.println("min number is :"+min);
		
	}
}
