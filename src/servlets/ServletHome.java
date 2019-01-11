package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/** 
 * Class to serve Home page
 * @author Oliver Heib
 */
public class ServletHome extends HttpServlet
{
	private static final long serialVersionUID = 1l;
	
	/** 
	 * Serves http post requests
	 * @param request http request
	 * @param response http response
	 */
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
		
		RequestDispatcher view = request.getRequestDispatcher("HomePage.jsp");
		view.forward(request, response);           
	}
}

