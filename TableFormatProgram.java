package com.programming;

import java.util.Scanner;

public class TableFormatProgram {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to Table :");
		int n=sc.nextInt();
		for(int i=0;i<=10;i++)
		{
			System.out.println(i+" *"+n+" "+"="+n*i);
		}
		
	}
}
