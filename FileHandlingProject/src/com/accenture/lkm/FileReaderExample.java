package com.accenture.lkm;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) throws IOException 
	{
		int c=0;
		try 
		{
			FileReader reader=new FileReader("c://users//kausar.khan//data.txt");
			while((c=reader.read())!=-1)
			{
				System.out.print(" "+(char)c);
			}
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("file does not exist....");
			e.printStackTrace();
		}
		System.out.println("End of program");
		
		
	}

}
