package com.programming;

import java.util.Scanner;

public class CountEven_Odd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to Count :");
		int num=sc.nextInt();
		int even=0;
		int odd=0;
		 while(num!=0)
		 {
			 
			int remain=num%10;
			
			 if(remain%2==0)
			 {
				 even++; 
				 
			 }
			 else 
			 {
				 odd++;
				 
			 }
			 num=num/10;
		 }
		 System.out.println("Even count is :"+even);
		 System.out.println("Odd count is :"+odd);
		 
	}

}
