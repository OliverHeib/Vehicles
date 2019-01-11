package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ServletLogin extends HttpServlet
{
	private static final long serialVersionUID = 1l;
	
	@Override
	protected void doGet( HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
	{        
		HttpSession session = request.getSession();
		if(request.getParameter("loggedin") != null)
		{
			session.setAttribute("loggedin", request.getParameter("loggedin"));
		}
		if(request.getParameter("isadmin") != null)
		{
			session.setAttribute("isadmin", request.getParameter("isadmin"));
		}
		
		RequestDispatcher view = request.getRequestDispatcher("Login.jsp");
		view.forward(request, response);           
	}
}
