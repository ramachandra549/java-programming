package com.string;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicatesInString {
	
	

		public static void main(String[]args){

		String s="Ramachandraaaa";
		char []arr=s.toCharArray();
		StringBuilder sb=new StringBuilder();
		int count=0;
	/*	for(int i=0;i<s.length();i++)
		{

			char ch=s.charAt(i);
			int index=s.indexOf(ch,i+1);
			if(index==-1)
			{
				sb.append(ch);
			}
		System.out.print(sb);
		}*/
//Approach:2		
	/*	for(int i=0;i<arr.length;i++)
		{
			boolean repeated=false;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					repeated=true;
					break;
				}
			}
			if(!repeated)
				sb.append(arr[i]);
		}
		System.out.println(sb);
		*/
//Approach:3
		Set<Character> set=new LinkedHashSet();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		System.out.println(set);
		for(Character c:set)
		{
			sb.append(c);
		//	System.out.print(c);	//we can use this type also
		}
		System.out.println(sb);
		
		
		
		
	}
}
