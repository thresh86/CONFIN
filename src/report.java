import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class report extends HttpServlet {

  public void Redirectionet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, java.io.IOException {
	  Redirection Redirection = (Redirection) getServletContext().getAttribute("Redirection");
      response.sendRedirect("http://dl.dropbox.com/u/29354428/How%20to%20use%20the%20Public%20folder.rtf");
  }
}