package com.programming;

public class RemoveJunk {

	public static void main(String[] args) {
		
		String s="(*^%%$^& rama Chnadra Nayak 9217824";
		String s1="*** %%%$#$ Selenium $$$ with  @@ java &&&";
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		s1=s1.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);
		System.out.println(s1);
	}
}
