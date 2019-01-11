package servlets;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.Vehicle;
import models.VehicleDAO;

/** 
 * Class to serve dashboard page
 * @author Oliver Heib
 */
public class ServletDashboard extends HttpServlet
{
	private static final long serialVersionUID = 1l;
	
	/** 
	 * Serves http get requests
	 * @param request http request
	 * @param response http response
	 */
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
		
		session.setAttribute("loggedin", true);
		String uname = request.getParameter("username");
		String password = GenHash(request.getParameter("password"));
		if(uname.equals("user")&& password.equals(GenHash("1234")))
		{
			session.setAttribute("isadmain", false);
			VehicleDAO dao = new VehicleDAO();
			ArrayList<Vehicle> allVehicles = dao.getAllVehicle();
			
			RequestDispatcher view = request.getRequestDispatcher("DashboardUser.jsp");
			request.setAttribute("allVehicles", allVehicles);
			view.forward(request, response);   
		}
		else if(uname.equals("admin")&& password.equals(GenHash("asdf")))
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
	
	private String GenHash(String pass)
	{
		try {
            // Create MessageDigest instance for MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
            //Add password bytes to digest
            md.update(pass.getBytes());
            //Get the hash's bytes
            byte[] bytes = md.digest();
            //This bytes[] has bytes in decimal format;
            //Convert it to hexadecimal format
            StringBuilder sb = new StringBuilder();
            for(int i=0; i< bytes.length ;i++)
            {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            //Get complete hashed password in hex format
            return sb.toString();
        }
        catch (NoSuchAlgorithmException e)
        {
            e.printStackTrace();
            return "a";
        }
		
	}

}
