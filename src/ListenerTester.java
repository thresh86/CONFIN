import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ListenerTester extends HttpServlet
{
  public void Redirectionet (HttpServletRequest request, HttpServletResponse response)
             throws IOException, ServletException
                   {
                      response.setContentType("text/html");
                      PrintWriter out = response.getWriter();

                      out.println("test context attributes set by listener<br>");
                      out.println("<br>");

               Redirection Redirection = (Redirection) getServletContext().getAttribute("Redirection");
              out.println("Redirection's redirect_link is:" + Redirection.getredirect_link());	
}
}			  