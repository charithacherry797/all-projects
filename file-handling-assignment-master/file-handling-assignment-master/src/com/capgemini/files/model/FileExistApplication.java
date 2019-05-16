package com.capgemini.files.model;

import java.io.File;

public class FileExistApplication 
{
	public boolean checkFileExist()
	{
		File file = new File("C:\\Core Java\\Basic_assignments\\src\\Array.java");
		if(file.exists())
		{
			System.out.println("File Exists");
			return true;
		}
		else
		{
			System.out.println("File does not Exists");
			return false;
		}
	}
}
