import javax.servlet.*;

public class Listener implements ServletContextListener
   {
     public void contextInitialized(ServletContextEvent event)
	 {
	   ServletContext sc = event.getServletContext();
	   String Redirectionredirect_Link = sc.getInitParameter("redirect_Link");
	   Redirection R = new Redirection(Redirectionredirect_Link);
	   sc.setAttribute("Redirection",R);
	   }
	   
	   public void contextDestroyed(ServletContextEvent event)
	   {
	   }
	   }
	   
 