package com.accenture.lkm;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
	public static void main(String[] args) throws IOException 
	{
	FileWriter writer=new FileWriter("c://users//kausar.khan//data.txt");
	String str="updated string......";
	//writer.write(str);
	writer.flush();
	System.out.println("End of program");
	}
}
