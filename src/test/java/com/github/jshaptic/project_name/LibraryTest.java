package com.github.jshaptic.project_name;

import java.io.IOException;
import java.net.URISyntaxException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LibraryTest extends Assert
{
    @Test
    public void someLibraryMethodReturnsTrue()
    {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }
    
    @Test
    public void testReadResourceByURI() throws IOException, URISyntaxException
    {
        Library classUnderTest = new Library();
        assertEquals(classUnderTest.readResourceByURI(), "some data");
    }
}