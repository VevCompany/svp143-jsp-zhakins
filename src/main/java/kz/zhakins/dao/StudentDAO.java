package kz.zhakins.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import kz.zhakins.model.Student;




public class StudentDAO {
	StudentList list;
	static Connection conn = null;
	static Statement stmt = null;
	static ResultSet result = null;
	
	
	
	
	
	public static ArrayList<Student>  findStudent(String Searchname){
		
		
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
	
	public static void editStudent(int id ,String name,int age) throws SQLException{
		conn = DBConnection.getter().getDbConnection();
		
		
		stmt = conn.createStatement();
		PreparedStatement preparedStatement = null;
		
		preparedStatement = conn.prepareStatement(
		         "UPDATE student SET name=?, age=? where id=?");
		
		preparedStatement.setString(1, name);
		preparedStatement.setLong(2, age);
		preparedStatement.setLong(3, id);
		
		preparedStatement.executeUpdate();
				


		
		
		
		
	}
	public static void delStudent(int id) throws SQLException{
		conn = DBConnection.getter().getDbConnection();
		
		
		stmt = conn.createStatement();
		PreparedStatement preparedStatement = null;
		
		preparedStatement = conn.prepareStatement(
		         "DELETE from student  where id=?");	
		
		preparedStatement.setLong(1, id);
		
		preparedStatement.executeUpdate();
				


		
		
		
		
	}
	
	public static void addStudent(String name, int age){
		
		conn = DBConnection.getter().getDbConnection();
		
		try {
			stmt = conn.createStatement();
			PreparedStatement preparedStatement = null;
			
			preparedStatement = conn.prepareStatement(
			         "INSERT INTO student( name, age) values( ?,?)");
			preparedStatement.setString(1, name);
			preparedStatement.setLong(2, age);
			
			preparedStatement.executeUpdate();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
