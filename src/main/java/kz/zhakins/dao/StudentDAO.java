package kz.zhakins.dao;

import java.util.ArrayList;

import kz.zhakins.model.Student;

public class StudentDAO {
	StudentList list;

	
	
	public static ArrayList<Student>  findStudent(String name){
		
		ArrayList<Student> list = StudentList.getStudent();
		ArrayList<Student> result = new ArrayList<Student>();
			for (int i = 0; i < list.size(); i++) {
				if (name.equals(list.get(i).getName()) ) 
					result.add(list.get(i));
				
			}
			return result;
		
		
	}
}
