package com.programming;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {
//Approach - 1:
		FileReader fr=new FileReader("C:\\Users\\chand\\eclipse-workspace\\Programming\\src\\com\\programming\\TextFileReader.txt");
		BufferedReader br=new BufferedReader(fr);
		
		String str="";
		while( (str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		br.close();
		
//Approach - 2:
		File fl=new File("C:\\\\Users\\\\chand\\\\eclipse-workspace\\\\Programming\\\\src\\\\com\\\\programming\\\\TextFileReader.txt");
		Scanner sc=new Scanner(fl);
		
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		
//Approach -3:
		File fle=new File("C:\\\\Users\\\\chand\\\\eclipse-workspace\\\\Programming\\\\src\\\\com\\\\programming\\\\TextFileReader.txt");
		Scanner scn=new Scanner(fle);
		scn.useDelimiter("\\z");
		System.out.println(scn.next());
		
		
		
		
		
		
		
	}
}
