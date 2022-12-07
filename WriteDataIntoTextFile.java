package com.programming;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("C:\\Users\\chand\\eclipse-workspace\\Programming\\src\\com\\programming\\TextFileWritter.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Welcome to java with selenium");
		bw.write("Welcome to Java");
		System.out.println("Finished!!!");
		bw.close();
	}
}
