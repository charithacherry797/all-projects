package com.capgemini.files.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandling 
{
	public static void main(String[] args) throws IOException 
	{
//		File folder = new File("C:\\Core Java\\Basic_assignments");
//		System.out.println(folder.exists());
//		
//		File file = new File("C:\\Core Java\\Basic_assignments\\src\\Array.java");
//		System.out.println(file.exists());
//		
//		File file = new File("test.txt");
//		if(!file.exists())
//		{
//			file.createNewFile();
//			System.out.println("File Created Successfully");
//		}
//		
//		//FileWriter writer = new FileWriter(file);
//		//BufferedWriter writer = new BufferedWriter(new FileWriter(file)); 
//		PrintWriter writer = new PrintWriter(new FileWriter(file,true));
//		writer.println("Hello..");
//		//writer.newLine();
//		writer.println("How are you");
//		
//		writer.close();
//		System.out.println("content has been written successfully");

	
//	FileReader reader = new FileReader("C:\\Core Java\\Basic_assignments\\src\\Array.java");
//	BufferedReader bReader = new BufferedReader(reader);
//	
//	PrintWriter writer = new PrintWriter("Bank.java");
//	
//	String content;
//	while((content = bReader.readLine())!=null)
//	{
//		//System.out.println(content);
//		writer.println(content);
//	}
//	
//	System.out.println("Success");
//	writer.close();
//	bReader.close();
//	reader.close();
	
		
//		  File windowsDirectory = new File("c:\\windows");
//		  System.out.println(windowsDirectory.isDirectory()); 
//		  String content[] = windowsDirectory.list();
//		  
//		  for (String s : content) 
//		  { 
//			  System.out.println(s); 
//		  }
	File newDir = new File("My Directory");
	if(! newDir.exists())
	{
		newDir.mkdir();
		System.out.println("Directory created successfully");
	}
	
	File file = new File(newDir, "MyFile.txt");
	if(!file.exists())
		file.createNewFile();
	System.out.println("File created successfully");
	
	}
}
