package com.programming;

import java.util.Scanner;

public class ArmStrongNum {

	/*
	 * Armstromg number is positive number which is equal to the cubes of the sum of digits
	 * EX: 153 -> 1 5 3
	 *    		  1*1*1 + 5*5*5 + 3*3*3 
	 *    			1+125+27
	 *    				153
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Num to check the Number Armstrong or Not :");
		int n=sc.nextInt();
	//	int n=153;
		int temp=n,sum=0,r;
		
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=sum+ r*r*r;
			
		}
		if(temp==sum)
		{
			System.out.println(temp+" is a Armstrong Number");
		}
		else
			System.out.println(temp+" is not Armstrong Number");
		
	}
}
