package kz.zhakins.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.Request;

import kz.zhakins.model.User;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
/*	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	*//**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 *//*
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}*/
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	req.setAttribute("title","Welcome" );
    	
    	RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
    	String username = req.getParameter("username");
    	String password = req.getParameter("password");
    	
    	if (username != null && password != null) {
    		User s= new User(username,password);
    		if (s.authValide()) {
				rd = req.getRequestDispatcher("/jsp/succes.jsp");
				req.setAttribute("title","Main page");
				req.setAttribute(username, password);
    		}
    		else{
    			req.setAttribute("error","Invalid OR password");
    			rd = req.getRequestDispatcher("test");
    		}
		}
    	System.out.println(username + password);
    	
    	
    	
    	
    	
    	rd.forward(req, resp);
    	
    	
    }

}
