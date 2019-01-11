package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.Vehicle;
import models.VehicleDAO;

public class ServletNewvehicle  extends HttpServlet{
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
		
		//if(session.getAttribute("loggedin") != null && session.getAttribute("isadmin") != null)
		{
			//boolean a = (boolean)session.getAttribute("loggedin");
			//boolean b = (boolean)session.getAttribute("isadmin");
			//if(a==false)
			{
				//if(b==false)
				{
					/*response.setContentType("text/html");
					response.setStatus(HttpServletResponse.SC_OK);
					PrintWriter out = response.getWriter();
					out.println("<html><body>");  
					out.println("<div class=\"container\">");  
					out.println("<h1>Accsess Denied</h1>"); 
					out.println("<form action=\"/\">\n" + 
							"input type=\"submit\" value=\"Logout\"/>\n" + 
							"</form> ");
					out.println("</div>");  
					out.println("</html></body>");  */
				}
				//else
				{
					
					RequestDispatcher view = request.getRequestDispatcher("NewVehicle.jsp");
					view.forward(request, response);
				}
			}
			//else
			{
				//response.sendRedirect("/login");            
			}
		}
		//else
		{
			//response.sendRedirect("/login");            
		}
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session=request.getSession();
		String make = request.getParameter("make");
		String model = request.getParameter("model");
		int year = Integer.parseInt(request.getParameter("year"));
		int price = Integer.parseInt(request.getParameter("price"));
		String licenceNumber = request.getParameter("licenceNumber");
		String colour = request.getParameter("colour");
		int numberDoors = Integer.parseInt(request.getParameter("numberDoors"));
		String transmition = request.getParameter("transmition");
		int milage = Integer.parseInt(request.getParameter("milage"));
		String fuelType = request.getParameter("fuelType");
		int engineSize = Integer.parseInt(request.getParameter("engineSize"));
		String bodyStyle = request.getParameter("bodyStyle");
		String condition = request.getParameter("condition");
		String notes = request.getParameter("notes");
		
		Vehicle newv = new Vehicle(1, make, model, year, price, licenceNumber, colour, numberDoors, transmition, milage, fuelType, engineSize, bodyStyle, condition, notes);
		VehicleDAO a = new VehicleDAO();
		if(a.InsertVehicle(newv))
		{
			response.setContentType("text/html");
			response.setStatus(HttpServletResponse.SC_OK);
			PrintWriter out = response.getWriter();
			out.println("<html><body>");  
			out.println("<div class=\"container\">");  
			out.println("<h1>Sucsessfully created new vehicle</h1>"); 
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
			out.println("<h1>Failed to create new vehicle</h1>"); 
			out.println("<a href=\"/dashboard\">Back to Dashboard</a>");
			out.println("</div>");  
			out.println("</html></body>");
		}
		
		
	}
}
