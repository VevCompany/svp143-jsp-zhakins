package kz.zhakins.dao;

import kz.zhakins.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentList {

	public static  ArrayList<Student> getStudent(){
		ArrayList<Student> list = new ArrayList<Student>();
		Student s = null;
		for (int i = 0; i < 10; i++) {
			s = new Student("Name "+i,"Group "+i);
			list.add(s);
		}
		return list;
		
	}
}
