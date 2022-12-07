package com.programming;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String s="selenium      with   java   is   Mandatory    ";
		s=s.replaceAll("\\s", "");
		System.out.println(s);
	}
}
