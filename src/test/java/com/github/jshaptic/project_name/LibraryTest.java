package com.github.jshaptic.project_name;

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
}