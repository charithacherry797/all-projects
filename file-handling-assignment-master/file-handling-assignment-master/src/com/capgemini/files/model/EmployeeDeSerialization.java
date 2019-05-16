package com.capgemini.files.model;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeDeSerialization {

	public Object doDeSerialization(String filepath) throws ClassNotFoundException, IOException {
		FileInputStream inputStream = new FileInputStream(filepath);
		ObjectInputStream input = new ObjectInputStream(inputStream);
		Object object = input.readObject();
		input.close();
		inputStream.close();
		return object;
	}
}
