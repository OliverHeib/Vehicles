package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.Vehicle;
import models.VehicleDAO;

public class ServletDashboard extends HttpServlet
{
	private static final long serialVersionUID = 1l;
	
	@Override
	protected void doGet( HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
	{        
		HttpSession session=request.getSession();
		if(request.getParameter("loggedin") != null)
		{
			session.setAttribute("loggedin", request.getParameter("loggedin"));
		}
		if(request.getParameter("isadmin") != null)
		{
			session.setAttribute("isadmin", request.getParameter("isadmin"));
		}
		
		if(session.getAttribute("loggedin") != null && session.getAttribute("isadmin") != null)
		{
			boolean a = (boolean)session.getAttribute("loggedin");
			boolean b = (boolean)session.getAttribute("isadmin");
			if(a==false)
			{
				if(b==false)
				{
					VehicleDAO dao = new VehicleDAO();
					ArrayList<Vehicle> allVehicles = dao.getAllVehicle();
					
					RequestDispatcher view = request.getRequestDispatcher("DashboardUser.jsp");
					request.setAttribute("allVehicles", allVehicles);
					view.forward(request, response);   
				}
				else
				{
					VehicleDAO dao = new VehicleDAO();
					ArrayList<Vehicle> allVehicles = dao.getAllVehicle();
					
					RequestDispatcher view = request.getRequestDispatcher("DashboardAdmin.jsp");
					request.setAttribute("allVehicles", allVehicles);
					view.forward(request, response);
				}
			}
			else
			{
				response.sendRedirect("/login");            
			}
		}
		else
		{
			response.sendRedirect("/login");            
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session=request.getSession();
		if(request.getParameter("loggedin") != null)
		{
			session.setAttribute("loggedin", request.getParameter("loggedin"));
		}
		if(request.getParameter("isadmin") != null)
		{
			session.setAttribute("isadmin", request.getParameter("isadmin"));
		}
		
		session.setAttribute("loggedin", true);
		String uname = request.getParameter("username");
		String password = request.getParameter("password");
		if(uname.equals("user")&& password.equals("1234"))
		{
			session.setAttribute("isadmain", false);
			VehicleDAO dao = new VehicleDAO();
			ArrayList<Vehicle> allVehicles = dao.getAllVehicle();
			
			RequestDispatcher view = request.getRequestDispatcher("DashboardUser.jsp");
			request.setAttribute("allVehicles", allVehicles);
			view.forward(request, response);   
		}
		else if(uname.equals("admin")&& password.equals("asdf"))
		{
			session.setAttribute("isadmain", true);
			VehicleDAO dao = new VehicleDAO();
			ArrayList<Vehicle> allVehicles = dao.getAllVehicle();
			
			RequestDispatcher view = request.getRequestDispatcher("DashboardAdmin.jsp");
			request.setAttribute("allVehicles", allVehicles);
			view.forward(request, response);
		}
		else
		{
			session.setAttribute("loggedin", false);
			doGet(request, response);
		}
	}

}
