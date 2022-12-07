 package com.programming;

import java.util.Scanner;

public class FebonacciSeries {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Range ");
		int num=sc.nextInt();
		
		int a=1,b=1,k=0;
		System.out.print("1 1 ");
		while(k<=num)
		{
			k=a+b;
			System.out.print(k+" ");
			a=b;
			b=k;
			
		}
	}

}
