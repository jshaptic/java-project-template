package com.github.jshaptic.project_name;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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