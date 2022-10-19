package com.accenture.lkm;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeObject {

	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		FileInputStream fin=new FileInputStream("fil1.txt");
		ObjectInputStream in=new ObjectInputStream(fin);
		Student stu=(Student)in.readObject();
		System.out.println(" details: "+stu.getStudentId()+" "+stu.getStuName()+" "+stu.getCourse());
	}

}
