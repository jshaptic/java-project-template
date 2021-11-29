package com.github.jshaptic.java_project_template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SomeClass
{
	private String resource = "some-resource.txt";
	
	public boolean someMethod()
	{
		return true;
	}
	
	public boolean someUntestedMethod()
	{
		return true;
	}
	
	public String readResourceAsURI() throws IOException, URISyntaxException
	{
		return new String(Files.readAllBytes(Paths.get(ClassLoader.getSystemClassLoader().getResource(resource).toURI())));
	}
	
	public String readResourceAsStream() throws IOException
	{
		try
		(
			InputStream in = ClassLoader.getSystemResourceAsStream(resource);
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		)
		{
			return reader.readLine();
		}
	}
}