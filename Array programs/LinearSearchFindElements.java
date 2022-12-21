package com.programming;

public class LinearSearchFindElements {

	public static void main(String[] args) {
		
		int a[]= {10,20,40,50,80,30};
		
		int search=80;
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(search==a[i])
			{
				System.out.println("Elements found :"+i);
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Elements not found");
		}
	}
}
