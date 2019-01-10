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

public class ServletsHome extends HttpServlet
{
	private static final long serialVersionUID = 1l;
	
	@Override
	protected void doGet( HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
	{        
		response.setContentType("text/html");
		response.setStatus(HttpServletResponse.SC_OK);
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>\n" + 
				"		<meta charset=\"UTF-8 name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" + 
				"		<title>Login</title>\n" + 
				"		<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css\" integrity=\"sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS\" crossorigin=\"anonymous\">\n" + 
				"	</head>");
		out.println("<body>");
		out.println("<div class=\"container\">");
		out.println("<h1>Log in</h1>");            
		out.println("<form action=\"\" method=\"post\" >");
		out.println("<input id=\"inputUsername\" class=\"inputUsername\" type=\"text\" placeholder=\"Username\" required=\"\" name=\"username\"> <br>");
		out.println("<input id=\"inputPassword\" class=\"inputPassword\" type=\"password\" placeholder=\"Password\" required=\"\" name=\"password\"> <br>");
		out.println("<input type=\"submit\" value=\"Login\">");
		out.println("</form>");        
		out.println("</div>");
		out.println("</body></html>");            
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String uname = request.getParameter("username");
		String password = request.getParameter("password");
		if(uname.equals("admin")&& password.equals("kings123"))
		{
			VehicleDAO dao = new VehicleDAO();
			ArrayList<Vehicle> allVehicles = dao.getAllVehicle();
			
			RequestDispatcher view = request.getRequestDispatcher("DashboardUser.jsp");
			request.setAttribute("allVehicles", allVehicles);
			view.forward(request, response);   
		}
		else
		{
			doGet(request, response);
		}
	}

}
