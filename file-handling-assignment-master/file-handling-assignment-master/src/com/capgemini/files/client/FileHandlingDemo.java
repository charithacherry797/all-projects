package com.capgemini.files.client;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandlingDemo {
	public static void main(String[] args) throws IOException {
//		File file= new File("C:\\Users\\mamomin\\Downloads\\Assignments\\Day-3-Java-Classes and Objects\\miscellaneous assignments.txt");
//		System.out.println(file.exists());
//		File folder= new File("C:\\Users\\mamomin\\Downloads\\Assignments\\Day-3-Java-Classes and Objects");
//		System.out.println(folder.exists());

//		File file= new File("test.txt");
//		if(!file.exists()){
//			file.createNewFile();
//			System.out.println("file is created sucessfully");
//		}

		/*
		 * --- File Writing -- // FileWriter writer= new FileWriter(file,true); //
		 * BufferedWriter writer= new BufferedWriter(new FileWriter(file)); //
		 * PrintWriter writer= new PrintWriter(file); PrintWriter writer = new
		 * PrintWriter(new FileWriter(file, true)); writer.println("hello.."); //
		 * writer.newLine(); writer.println("world"); // writer.newLine();
		 * writer.println("How are you???"); writer.close();
		 * System.out.println("Content has been written sucessfully");
		 */

		/*
		 * ----File reading---- FileReader reader=new FileReader(
		 * "C:\\Mahvash_Workspace\\Java_workspace\\inheritance_assignment\\src\\com\\capgemini\\employeeapp\\model\\SavingAccount.java"
		 * ); BufferedReader bReader = new BufferedReader(reader);
		 * 
		 * PrintWriter writer = new PrintWriter("BankAccount.java");
		 * 
		 * String content; while((content = bReader.readLine())!= null) { //
		 * System.out.println(content); writer.println(content); }
		 * 
		 * System.out.println("success"); writer.close(); bReader.close();
		 * reader.close();
		 */

		/*
		 * File windowsDirectory = new File("C:\\Windows");
		 * System.out.println(windowsDirectory.isDirectory()); String content[] =
		 * windowsDirectory.list();
		 * 
		 * for (String s : content) { System.out.println(s); }
		 */
		
		
//		To create a folder
		File newDir = new File("myDir");
		if(!newDir.exists()) {
			newDir.mkdir();
			System.out.println("Folder is sucessfull created");
		}
		
//		To create a file inside a folder
		File file = new File(newDir, "myfile.txt");
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("file is sucessfully created");
		}
	}

}
