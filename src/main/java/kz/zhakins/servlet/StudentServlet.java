package kz.zhakins.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ResponseCache;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		ArrayList<Student> list = StudentList.getStudent();
			resp.setContentType("text/html;charset=UTF-8");
			
			PrintWriter out = resp.getWriter();
			try {
				out.println("<html>");
				out.print("<head>");
				out.println("<title> </title>");
				out.println("</head>");
				out.println("<body>");
				
				out.println("<h1>Список Студентов</h1>");
				out.println("<table border = 1>");
				out.println("<tr>");
				out.println("<th> Name </th>");
				out.println("<th> Group </th>");
				out.println("</tr>");
				for (Student student : list) {
					
					out.println("<tr>");
					out.println("<td>");
					out.println(student.getName());	
					out.println("</td>");
					out.println("<td>");
					out.println(student.getGroup());	
					out.println("</td>");
					out.println("</tr>");
					
				}
				out.println("</table>");
				out.println("</body>");
				
				
				out.println("</html>");
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			out.close();
		}
		
		
	
		}

}
