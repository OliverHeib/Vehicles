package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.VehicleDAO;

public class ServletDelete extends HttpServlet 
{
	private static final long serialVersionUID = 1l;
	
	@Override
	protected void doPost( HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
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
		
		int ID = Integer.parseInt(request.getParameter("id"));
		VehicleDAO a = new VehicleDAO();
		if(a.DeleteVehicle(ID))
		{
			response.setContentType("text/html");
			response.setStatus(HttpServletResponse.SC_OK);
			PrintWriter out = response.getWriter();
			out.println("<html><body>");  
			out.println("<div class=\"container\">");  
			out.println("<h1>Sucsessfully Deletion of vehicle</h1>"); 
			out.println("<a href=\"/dashboard\">Back to Dashboard</a>");
			out.println("</div>");  
			out.println("</html></body>");
		}
		else
		{
			response.setContentType("text/html");
			response.setStatus(HttpServletResponse.SC_OK);
			PrintWriter out = response.getWriter();
			out.println("<html><body>");  
			out.println("<div class=\"container\">");  
			out.println("<h1>Failed to Delete vehicle</h1>"); 
			out.println("<a href=\"/dashboard\">Back to Dashboard</a>");
			out.println("</div>");  
			out.println("</html></body>");
		}
	}
}
