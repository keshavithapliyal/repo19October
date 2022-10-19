package com.accenture.lkm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fIn=new FileInputStream("fil.txt");
		int c=0;
		while((c=fIn.read())!=-1)
		{
			System.out.print((char)c);
		}
	}

}
