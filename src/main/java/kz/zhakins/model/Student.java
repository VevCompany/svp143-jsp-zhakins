package kz.zhakins.model;

import java.util.Comparator;

public class Student implements Comparable<Student>{
	private Long id;
	private String name;
	private int age;
	public Student(Long id2,String name, int age) {
		this.id=id2;
		this.name = name;
		this.age = age;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	 
	@Override
	public int compareTo(Student arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	public static class Comparators{
		public static Comparator<Student> ID = new Comparator<Student>() {
	         @Override
	         public int compare(Student o1, Student o2) {
	             int i = o1.id.compareTo(o2.id);
	             if (i == 0) {
	                 i = (int) (o1.id - o2.id);
	             }
	             return i;
	         }
	     };
	}
	
}
