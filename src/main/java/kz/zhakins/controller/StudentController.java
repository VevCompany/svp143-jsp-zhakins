package kz.zhakins.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ResponseCache;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kz.zhakins.dao.StudentDAO;
import kz.zhakins.dao.StudentList;
import kz.zhakins.model.Student;

/**
 * Servlet implementation class StudentServlet
 */
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Method type " + req.getMethod());
		String name = (req.getParameter("name") != null && !req.getParameter("name").isEmpty() ) ? req.getParameter("name"): "";
		
		
		boolean newStud = req.getParameter("new")!=null?(req.getParameter("new").equals("1")?true:false):false;
		boolean editStud = (req.getParameter("edit") != null && !req.getParameter("edit").isEmpty()) ? true : false;
		//boolean createStud = (req.getParameter("create") != null && !req.getParameter("create").isEmpty()) ? true : false;
		boolean createStud = false;
		System.out.println("Parameter name = "+ name);
		System.out.println("Parameter newStud = "+ newStud);
		System.out.println("Parameter createStud = "+ createStud);
		RequestDispatcher rd = req.getRequestDispatcher("jsp/succes.jsp");
		
		
		if(newStud){
			addStudent(req,resp);
			
			req.setAttribute("new", 0);
				rd = req.getRequestDispatcher("jsp/succes.jsp");
				rd.forward(req, resp);
			
				
		}
		else if(editStud){
			//String StudentID = (req.getParameter("id") != null && !req.getParameter("id").isEmpty() ) ? req.getParameter("id"): "0";
			int id =35;// Integer.parseInt(req.getParameter("35"));
			//int id = req.getParameter("student.id");
			
			try {
				StudentDAO.editStudent(35,"Samat",30);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			rd = req.getRequestDispatcher("jsp/editStudent.jsp");
			//req.setAttribute("students", student);
			rd.forward(req, resp);
		}
		
			ArrayList<Student> find = StudentDAO.findStudent(name);
			rd = req.getRequestDispatcher("jsp/succes.jsp");
			
			req.setAttribute("students", find);
			rd.forward(req, resp);	
		
		
		
		rd = req.getRequestDispatcher("jsp/succes.jsp");
		rd.forward(req, resp);		
	
	}
	protected void addStudent(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		
		String name = (req.getParameter("name") != null && !req.getParameter("name").isEmpty() ) ? req.getParameter("name"): "";
		
		int age = Integer.parseInt((req.getParameter("age") != null && !req.getParameter("age").isEmpty() ) ? req.getParameter("age"): "0") ;
		RequestDispatcher rd = req.getRequestDispatcher("jsp/addStudent.jsp");
		if(!name.isEmpty() && age != 0){
			StudentDAO.addStudent(name, age);
		}
		//req.setAttribute("new", 0);
		
		
		rd.forward(req, resp);
	}
	
	protected void editStudent(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		
	}
}
