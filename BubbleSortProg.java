package com.programming;

import java.util.Arrays;

public class BubbleSortProg {

	public static void main(String[] args) {
		
		
		int a[]= {4,3,5,1,2};
		System.out.println("Array before Sorting :"+Arrays.toString(a));	//if we want print allThe Elements in Array 
																		//in one Short then we have method called Arrays.toString
		int n=a.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(a[j]>a[j+1])		//Compare the Each element if the 1st number is greater than 2nd number than we have to Swap
				{
					int temp=a[j];		//Swapping Technique
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Array After Sorting :"+Arrays.toString(a));
	}
}
