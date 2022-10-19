package com.accenture.lkm;

import java.io.Serializable;

public class Student implements Serializable
{
	private int studentId;
	private transient String stuName;
	private static String course="MCA"; //static member
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public static String getCourse() {
		return course;
	}
	public static void setCourse(String course) {
		Student.course = course;
	}
	
	
}
