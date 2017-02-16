package kz.zhakins.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ResponseCache;
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
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Method type " + req.getMethod());
		String name = (req.getParameter("name") != null && !req.getParameter("name").isEmpty() ) ? req.getParameter("name"): "";
		boolean newStud = (req.getParameter("new") != null && !req.getParameter("new").isEmpty()) ? true : false;
		System.out.println("Parameter name = "+ name);
		
		ArrayList<Student> find = StudentDAO.findStudent(name);
		req.setAttribute("students", find);
		
		RequestDispatcher rd = req.getRequestDispatcher("jsp/succes.jsp");
		rd.forward(req, resp);		
	
	}

}
