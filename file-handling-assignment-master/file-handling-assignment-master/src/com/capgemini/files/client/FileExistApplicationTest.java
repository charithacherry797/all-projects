package com.capgemini.files.client;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.files.model.FileExistApplication;

public class FileExistApplicationTest 
{
	@Test
	public void testForFileExistance() 
	{
		FileExistApplication fileExist = new FileExistApplication();
		assertEquals(true, fileExist.checkFileExist());
	}
	
	@Test
	public void testForFileNotExistance() 
	{
		FileExistApplication fileExist = new FileExistApplication();
		assertEquals(true, fileExist.checkFileExist());
	}

}
