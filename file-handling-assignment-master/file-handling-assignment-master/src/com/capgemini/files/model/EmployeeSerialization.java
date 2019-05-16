package com.capgemini.files.model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeSerialization {

	public void doSerialization(Object obj,String filepath) throws IOException {
		FileOutputStream fileoutputstream = new FileOutputStream(filepath);
		ObjectOutputStream outputStream= new ObjectOutputStream(fileoutputstream);
		
		outputStream.writeObject(obj);
		outputStream.close();
		fileoutputstream.close();
	}
}
