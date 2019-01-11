package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.Vehicle;
import models.VehicleDAO;

/** 
 * Class to serve Doedit page
 * @author Oliver Heib
 */
public class servletDoEdit  extends HttpServlet{
private static final long serialVersionUID = 1l;
	
	/** 
	 * Serves http post requests
	 * @param request http request
	 * @param response http response
	 */
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
		
		int ID = Integer.parseInt(request.getParameter("id"));
		String make = request.getParameter("make");
		String model = request.getParameter("model");
		int year = Integer.parseInt(request.getParameter("year"));
		int price = Integer.parseInt(request.getParameter("price"));
		String licenceNumber = request.getParameter("licenceNumber");
		String colour = request.getParameter("colour");
		int numberDoors = Integer.parseInt(request.getParameter("numberDoors"));
		String transmition = request.getParameter("tramsmitssion");
		int milage = Integer.parseInt(request.getParameter("milage"));
		String fuelType = request.getParameter("fuelType");
		int engineSize = Integer.parseInt(request.getParameter("engineSize"));
		String bodyStyle = request.getParameter("bodyStyle");
		String condition = request.getParameter("condition");
		String notes = request.getParameter("notes");
		
		Vehicle newv = new Vehicle(ID, make, model, year, price, licenceNumber, colour, numberDoors, transmition, milage, fuelType, engineSize, bodyStyle, condition, notes);
		VehicleDAO a = new VehicleDAO();
		if(a.UpdateVehicle(newv))
		{
			response.setContentType("text/html");
			response.setStatus(HttpServletResponse.SC_OK);
			PrintWriter out = response.getWriter();
			out.println("<html><body>");  
			out.println("<div class=\"container\">");  
			out.println("<h1>Sucsessfully update of vehicle</h1>"); 
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
			out.println("<h1>Failed to update vehicle</h1>"); 
			out.println("<a href=\"/dashboard\">Back to Dashboard</a>");
			out.println("</div>");  
			out.println("</html></body>");
		}
		
		
	}
}
