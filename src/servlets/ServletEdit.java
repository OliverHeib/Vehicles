package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

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
public class ServletEdit extends HttpServlet 
{
	private static final long serialVersionUID = 1l;
	
	/** 
	 * Serves http post requests
	 * @param request http request
	 * @param response http response
	 */
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
		response.setContentType("text/html");
		response.setStatus(HttpServletResponse.SC_OK);
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<div class=\"container\">");  
		out.println("<h1>Edit vehicle</h1><br><form action=\"/doedit\" method=\"post\" >"); 
		VehicleDAO dao = new VehicleDAO();
		ArrayList<Vehicle> allVehicles = dao.getVehicle(ID);
		for (Vehicle v : allVehicles)
		{
			out.write("<input id=\"inputNumber\" class=\"inputNumber\" type=\"number\" placeholder=\"Year\" required=\"\" name=\"id\" value=\""+ v.getVehicle_id() + "\"><br><input id=\"inputText\" class=\"inputText\" type=\"text\" placeholder=\"Make\" required=\"\" name=\"make\" value =\" "+ v.getMake() +"\"><br><input id=\"inputText\" class=\"inputText\" type=\"text\" placeholder=\"Make\" required=\"\" name=\"model\" value =\""+ v.getModel() +"\"><br><input id=\"inputNumber\" class=\"inputNumber\" type=\"number\" placeholder=\"Year\" required=\"\" name=\"year\" value=\""+ v.getYear() + "\"><br><input id=\"inputNumber\" class=\"inputNumber\" type=\"number\" placeholder=\"Year\" required=\"\" name=\"price\" value=\"" + v.getPrice() + "\"><br><input id=\"inputText\" class=\"inputText\" type=\"text\" placeholder=\"Make\" required=\"\" name=\"licenceNumber\" value =\"" + v.getLicense_number() + "\"><br><input id=\"inputText\" class=\"inputText\" type=\"text\" placeholder=\"Make\" required=\"\" name=\"colour\" value =\"" + v.getColour() + "\"><br><input id=\"inputNumber\" class=\"inputNumber\" type=\"number\" placeholder=\"Year\" required=\"\" name=\"numberDoors\" value=\"" + v.getNumber_doors() + "\"><br><input id=\"inputText\" class=\"inputText\" type=\"text\" placeholder=\"Make\" required=\"\" name=\"tramsmitssion\" value =\"" + v.getTransmission() + "\"><br><input id=\"inputNumber\" class=\"inputNumber\" type=\"number\" placeholder=\"Year\" required=\"\" name=\"milage\" value=\"" + v.getMileage() + "\"><br><input id=\"inputText\" class=\"inputText\" type=\"text\" placeholder=\"Make\" required=\"\" name=\"fuelType\" value =\"" + v.getFuel_type() + "\"><br><input id=\"inputNumber\" class=\"inputNumber\" type=\"number\" placeholder=\"Year\" required=\"\" name=\"engineSize\" value=\"" + v.getEngine_size() + "\"><br><input id=\"inputText\" class=\"inputText\" type=\"text\" placeholder=\"Make\" required=\"\" name=\"bodyStyle\" value =\"" + v.getBody_style() + "\"><br><input id=\"inputText\" class=\"inputText\" type=\"text\" placeholder=\"Make\" required=\"\" name=\"condition\" value =\"" + v.getCondition() + "\"><br><input id=\"inputText\" class=\"inputText\" type=\"text\" placeholder=\"Make\" required=\"\" name=\"notes\" value =\"" + v.getNotes() + "\"><br>");
		}
		out.println("<input type=\"submit\" value=\"Update Vehicle\">");
		out.println("</form><br><a href=\"/dashboard\">Back to Dashboard</a>");
		out.println("</div>");  
		out.println("</html></body>");
	}

}
