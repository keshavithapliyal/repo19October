package com.accenture.lkm;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException 
	{
		FileOutputStream fout=new FileOutputStream("fil.txt");
		String str="hello";
		byte b[]=str.getBytes();//to conver string into array of bytes
		fout.write(b);
		fout.flush();
		System.out.println("end of program");
	}

}
