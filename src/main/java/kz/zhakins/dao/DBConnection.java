package kz.zhakins.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author 
 *
 */
final public class DBConnection {
	
	private static DBConnection _instance = null;
	Connection dbConnection = null;
	
	//JDBC driver name and database URL
	static final String JDBC_DRIVER = "org.postgresql.Driver";  
	static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/test";
	
	//  Database credentials
	static final String USER = "postgres";
	static final String PASS = "postgres";
	
	DBConnection(){
	    try {
	    	//��������� �������
	        Class.forName(JDBC_DRIVER);
	    } catch (ClassNotFoundException e) {
	    	e.printStackTrace();
	    }
	    try {
	    	//������ ����������
	        this.dbConnection = DriverManager.getConnection(DB_URL, USER, PASS);
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	
	/** Initialize Singleton */
	public static DBConnection getter(){
		if(_instance == null)
			_instance = new DBConnection();
		return _instance;
	}

	public Connection getDbConnection() {
		return dbConnection;
	}

}
