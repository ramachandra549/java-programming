package com.programming;

import java.util.Arrays;
import java.util.Collections;

public class SortingElementsByBuildMethods {

	public static void main(String[] args) {
		
		
//Approach--1
		//we have a direct method called parallelSort(nameOfArray) in Arrays Class
		int a[]= {50,30,60,40,75,28,10};
		Arrays.parallelSort(a);
		System.out.println("Array After Sorting :"+Arrays.toString(a));
		
//Approach--2
		//we have a another method called sort(nameOfArray) in Arrays Class
		int b[]= {3,2,1,4,7,6};
		Arrays.sort(b);
		System.out.println("Array After Sorting :"+Arrays.toString(b));

//Approach--3
		//if we want to sort the elements in Descending order
		Integer  c[]= {5,3,2,1,7,10,8};
		Arrays.sort(c,Collections.reverseOrder()); 	//collections.reverese method will not support the primitive Data Type
		System.out.println("Array After Sorting :"+Arrays.toString(c));
	}
}
