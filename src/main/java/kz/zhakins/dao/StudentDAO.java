package kz.zhakins.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import kz.zhakins.model.Student;




public class StudentDAO {
	StudentList list;
	
	
	
	
	
	
	public static ArrayList<Student>  findStudent(String Searchname){
		Connection conn = null;
    	Statement stmt = null;
    	ResultSet result = null;
		
		conn = DBConnection.getter().getDbConnection();
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		
			
		try {
			stmt = conn.createStatement();
			

			
			String sql = "SELECT id, name, age FROM student";
			result = stmt.executeQuery(sql);
			
		      while(result.next()){
		         //Retrieve by column name
		         Long id  = result.getLong("id");
		         int age = result.getInt("age");
		         String name = result.getString("name");
		         list.add( new Student(id, name, age));
		      }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			


			if (!Searchname.isEmpty()) {
				ArrayList<Student> result1 = new ArrayList<Student>();
				for (int i = 0; i < list.size(); i++) {
					if (Searchname.equals(list.get(i).getName()) ) 
						result1.add(list.get(i));
					
				}
				return result1;
			}
		
			return list;
		
		
	}
}
