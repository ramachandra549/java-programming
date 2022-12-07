package com.programming;

import java.util.Scanner;

public class CountNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the CountNumber :");
		long num=sc.nextLong();
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println(count);

	}

}
