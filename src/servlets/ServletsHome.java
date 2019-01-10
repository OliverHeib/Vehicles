package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Vehicle;
import models.VehicleDAO;

@SuppressWarnings("serial")
public class ServletsHome extends HttpServlet
{
	private static final long serialVersionUID = 1l;
	
	/*@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		VehicleDAO dao = new VehicleDAO();
		ArrayList<Vehicle> allVehicles = dao.getAllVehicle();
		
		RequestDispatcher view = req.getRequestDispatcher("index.jsp");
		req.setAttribute("allVehicles", allVehicles);
		view.forward(req, resp);
	}*/
	
	@Override
	protected void doGet( HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
	{        
		response.setContentType("text/html");
		response.setStatus(HttpServletResponse.SC_OK);
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1>Log in</h1>");            
		out.println("<form action=\"\" method=\"post\" >");
		out.println("Enter username: <input type=\"text\" name=\"username\"> <br>");
		out.println(" Enter password: <input type=\"password\" name=\"password\"> <br>");
		out.println("<input type=\"submit\" value=\"Login\">");
		out.println("</form>");            
		out.println("</body></html>");            
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String uname = request.getParameter("username");
		String password = request.getParameter("password");
		PrintWriter out = response.getWriter();
		if(uname.equals("admin")&& password.equals("kings123"))
		{
			VehicleDAO dao = new VehicleDAO();
			ArrayList<Vehicle> allVehicles = dao.getAllVehicle();
			
			RequestDispatcher view = request.getRequestDispatcher("index.jsp");
			request.setAttribute("allVehicles", allVehicles);
			view.forward(request, response);   
		}
		else
		{
			doGet(request, response);
		}
	}
	/*
	@SuppressWarnings("serial")
	public static class LogoutServlet extends HttpServlet
	{      
		@Override protected void doGet( HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
		{             
			response.sendRedirect("http://localhost:8005/");            
		}
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{
			doGet(request, response);
		}    
	}*/
}
