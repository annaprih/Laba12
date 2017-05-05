import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Anna on 05.05.2017.
 */

@WebServlet("/Servlet_1Redirect")
public class Servlet_1Redirect extends HttpServlet {
    public static boolean flag = true;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(flag == true){
        request.getSession().setAttribute("getRedirect", "Get запрос Redirect ");
        response.sendRedirect("Servlet_2Redirect");
        flag = false;
        }
        else{
            response.sendRedirect("Forward.jsp");
        }
    }

}
