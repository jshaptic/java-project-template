package com.github.jshaptic.java_project_template;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.FileSystemNotFoundException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SomeClassTest extends Assert
{
	@Test
	public void someMethodReturnsTrue()
	{
		SomeClass classUnderTest = new SomeClass();
		assertTrue(classUnderTest.someMethod(), "someExampleMethod should return 'true'");
	}
	
	@Test(expectedExceptions = FileSystemNotFoundException.class)
	public void testReadResourceAsURI() throws IOException, URISyntaxException
	{
		SomeClass classUnderTest = new SomeClass();
		assertEquals(classUnderTest.readResourceAsURI(), "some data");
	}
	
	@Test
	public void testReadResourceAsStream() throws IOException
	{
		SomeClass classUnderTest = new SomeClass();
		assertEquals(classUnderTest.readResourceAsStream(), "some data");
	}
}