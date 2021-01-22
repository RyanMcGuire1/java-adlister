import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ViewColorServlet", urlPatterns = "/viewcolor")
public class ViewColorServlet extends HelloWorldServlet{
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String color = req.getParameter("color");

        req.setAttribute("color", color);
        req.getRequestDispatcher("/viewColor.jsp").forward(req, res);
    }
}
