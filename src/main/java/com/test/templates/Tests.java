package com.test.templates;

import java.io.StringWriter;
import java.util.Properties;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.exception.MethodInvocationException;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;

public class Tests {

	public static void main(String[] args) {
		Properties p = new Properties();
	    p.put("resource.loaders ", "file");
	    p.put("resource.loader.file.class", "org.apache.velocity.runtime.resource.loader.FileResourceLoader");
	    p.put("file.resource.loader.path", "C:\\Projects");

		Velocity.init(p);

		TestEntity ar=new TestEntity("dfs", 34535, "f");
		VelocityContext context = new VelocityContext();

		context.put( "name", ar );

		Template template = null;
		StringWriter sw = new StringWriter();
		context.put("test", null);
		context.put("hne", new int[] {0,1,2});
		context.put("hne1", new String[] {"ax","oh","hah"});
		
		String text=" ${test|'John Doe'}${test|'John Doe'}";

		try
		{
		  Velocity.evaluate(context,sw,"hne", text);
		}
		catch( ResourceNotFoundException rnfe )
		{
			System.err.println(rnfe.getMessage());
		}
		catch( ParseErrorException pee )
		{
			System.err.println(pee);
		}
		catch( MethodInvocationException mie )
		{
			System.err.println(3);
		}
		catch( Exception e )
		{}

		
		System.err.println(sw);
		System.err.println("Ready");
	}

}
