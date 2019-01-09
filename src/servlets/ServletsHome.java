package servlets;

import java.io.IOException;
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
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		VehicleDAO dao = new VehicleDAO();
		ArrayList<Vehicle> allVehicles = dao.getAllVehicle();
		
		RequestDispatcher view = req.getRequestDispatcher("index.jsp");
		req.setAttribute("allVehicles", allVehicles);
		view.forward(req, resp);
	}
}
