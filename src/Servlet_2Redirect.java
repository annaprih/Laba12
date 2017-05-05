import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Anna on 05.05.2017.
 */
@WebServlet("/Servlet_2Redirect")
public class Servlet_2Redirect extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession httpSession = request.getSession();
        httpSession.setAttribute("getRedirect", httpSession.getAttribute("getRedirect") +"getRedirect2");
        response.sendRedirect("Servlet_1Redirect");
    }

}