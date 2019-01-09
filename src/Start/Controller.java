package Start;

import org.eclipse.jetty.server.Server;
//import org.eclipse.jetty.webapp.WebAppContext;
import org.eclipse.jetty.webapp.WebAppContext;

public class Controller {

	public static void main(String[] args) throws Exception
	{
		Server server = new Server(8005); //create server on port 8005
		WebAppContext ctx = new WebAppContext(); //create a context
		ctx.setResourceBase("webapp"); //point to where web content stored
		ctx.setContextPath("/vehiclesdb"); // base url (landing page)
		
		//config
		Configure(server);
		
		//mapping
		ctx.addServlet("servlets.ServletsHome", "/home");
		
		//Setting the handler and starting the Server
		server.setHandler(ctx);
		server.start();
		server.join();

	}
	
	private  static void Configure(Server server)
	{ 
		org.eclipse.jetty.webapp.Configuration.ClassList classlist = org.eclipse.jetty.webapp.Configuration.ClassList.setServerDefault(server);
		classlist.addAfter("org.eclipse.jetty.webapp.FragmentConfiguration","org.eclipse.jetty.plus.webapp.EnvConfiguration", "org.eclipse.jetty.plus.webapp.PlusConfiguration");
		classlist.addBefore("org.eclipse.jetty.webapp.JettyWebXmlConfiguration","org.eclipse.jetty.annotations.AnnotationConfiguration");
	}

}
