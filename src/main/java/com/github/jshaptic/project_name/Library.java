package com.github.jshaptic.project_name;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Library
{
    private String resource = "some-resource.txt";
	
	public boolean someLibraryMethod()
    {
        return true;
    }
    
    public String readResourceByURI() throws IOException, URISyntaxException
    {
    	return new String(Files.readAllBytes(Paths.get(ClassLoader.getSystemClassLoader().getResource(resource).toURI())));
    }
}