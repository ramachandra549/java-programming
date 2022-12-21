package com.programming;

import java.util.Arrays;

public class CompareArrays {

	public static void main(String[] args) {
		
		int a1[]= {1,2,3,4,5};
		int a2[]= {1,2,3,4,5};
		
/*		boolean status=Arrays.equals(a1,a2);
		if(status)
		{
			System.out.println("They are Equals");
		}
		else
		{
			System.out.println("not Equals");
		}
*/
		boolean status=true;
		if(a1.length == a2.length)
		{
			for(int i=0;i<a1.length;i++)
			{
				if(a1[i] != a2[i])
				{
					status=false;
				}
			}
			
		}
		else
		{
			status=false;
		}
		
		if(status==true)
		{
			System.out.println("Arrays Are Equals");
		}
		else
		{
			System.out.println("Arrays Are Not Equals");
		}
		
		
		
		
		
		
		
	}
}
