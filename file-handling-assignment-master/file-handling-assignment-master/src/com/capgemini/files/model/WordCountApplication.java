package com.capgemini.files.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCountApplication {
	public int checkWordCount() throws IOException {
		FileReader reader = new FileReader("C:\\Users\\mamomin\\Downloads\\Assignments\\Day-8-FileIO\\assignments_io.txt");
		BufferedReader breader = new BufferedReader(reader);
		int countWord = 0;
		
		String content;
		while ((content = breader.readLine()) != null) {
			String s[] = content.split("\\s+");
			countWord += s.length;

		}
		System.out.println("Words Counted successfully");
		breader.close();
		reader.close();
		return countWord;
	}
}
