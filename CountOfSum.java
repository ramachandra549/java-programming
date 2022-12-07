package com.programming;

import java.util.Scanner;

public class CountOfSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number to count :");
		int num=sc.nextInt();
		int rev=0;
		
		while(num>0)
		{	
			rev=rev+num%10;
			num=num/10;
			
		}
		System.out.println(rev);
	}

}
