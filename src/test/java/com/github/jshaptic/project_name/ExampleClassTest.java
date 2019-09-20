package com.github.jshaptic.project_name;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.FileSystemNotFoundException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExampleClassTest extends Assert
{
	@Test
	public void someExampleMethodReturnsTrue()
	{
		ExampleClass classUnderTest = new ExampleClass();
		assertTrue(classUnderTest.someExampleMethod(), "someExampleMethod should return 'true'");
	}
	
	@Test(expectedExceptions = FileSystemNotFoundException.class)
	public void testReadResourceAsURI() throws IOException, URISyntaxException
	{
		ExampleClass classUnderTest = new ExampleClass();
		assertEquals(classUnderTest.readResourceAsURI(), "some data");
	}
	
	@Test
	public void testReadResourceAsStream() throws IOException
	{
		ExampleClass classUnderTest = new ExampleClass();
		assertEquals(classUnderTest.readResourceAsStream(), "some data");
	}
}