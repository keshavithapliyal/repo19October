package com.accenture.lkm;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeObject {

	public static void main(String[] args) throws IOException 
	{
		Student s=new Student();
		s.setStudentId(1001);
		s.setStuName("Neha");
		FileOutputStream fout=new FileOutputStream("fil1.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(s);
		System.out.println("End of program");
		
		
		
	}

}
