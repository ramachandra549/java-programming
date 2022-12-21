package com.programming;

public class MissingElementInArray {

	public static void main(String[] args) {
		//Array should not have any duplicates
		//Array no need to be Sorted
		//values should be in Range
		
		int a[]= {1,2,3,5,6,7,8};
		
		//1+2+3+4+5+6+7+8=36
		//1+2+3+5+6+7+8=27
		
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		int sum2=0;
		for(int i=0;i<=8;i++)
		{
			sum2=sum2+i;
		}
		System.out.println(sum2);
		System.out.println("Mising Number is :"+(sum2-sum));
		
	}
}
