package com.programming;

import java.util.HashSet;

public class DuplicateArrayElements {

	public static void main(String[] args) {

//Approach 1
/*		String arr[]= {"rama","chandra","nayak","Rama","Rama"};
		
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].equals(arr[j]))
				{
					System.out.println( "Duplicate Elements are :"+arr[i]);
					flag=true;
				}	
			}
		}
		if(flag==false)	
		{
			System.out.println("Elements Not Found");
		}
*/		
		
//Approach--HashSet 
		String arr[]= {"rama","chandra","nayak","Rama","rama"};
		HashSet <String> a=new  HashSet();
		
		boolean flag=false;
		for(String n:arr)
		{
			if(a.add(n)==false)
			{
				System.out.println("Duplicate Elements :"+n);
				flag=true;
			}
		}
		if (flag==false)
		{
			System.out.println("No Duplicates Elements Found");
		}
		
		
		
		
		
	}
}
