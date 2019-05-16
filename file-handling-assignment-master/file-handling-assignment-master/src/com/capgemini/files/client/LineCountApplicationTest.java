package com.capgemini.files.client;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.capgemini.files.model.LineCountApplication;

public class LineCountApplicationTest 
{
	@Test
	public void testForCountingLinesWithValidInput() throws IOException 
	{
		LineCountApplication lineCount = new LineCountApplication();
		assertEquals(28, lineCount.checkLineCount());
	}
	

}
