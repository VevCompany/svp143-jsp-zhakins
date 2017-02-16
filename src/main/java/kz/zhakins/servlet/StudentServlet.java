package kz.zhakins.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ResponseCache;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		
			resp.setContentType("text/html;charset=UTF-8");
			PrintWriter out = resp.getWriter();
			try {
				out.println("<html>");
				out.print("<head>");
				out.println("<title> </title>");
				out.println("</head>");
				out.println("<body>");
				out.println("<h1>Список Студентов</h1>");
				out.println("</body>");
				
				
				out.println("</html>");
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			out.close();
		}
		
		
	
		}

}
