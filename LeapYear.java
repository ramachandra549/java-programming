package com.programming;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year the to check Leap :");
		int year=sc.nextInt();
		if(year%100==0 && year%400==0 || year%100!=0 && year%4==0)
		{
			System.out.println(year+" is a leap year");
		}
		else
		{
			System.out.println(year+" is not a leap year");
		}
	}
}
