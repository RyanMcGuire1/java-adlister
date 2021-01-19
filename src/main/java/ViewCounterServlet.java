import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ViewCountServlet", urlPatterns = "/count")
public class ViewCounterServlet extends HttpServlet {
    private int counter = 0;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
       counter += 1;
       response.setContentType("text/HTML");
       PrintWriter out = response.getWriter();
       out.println("<hi> This page has been viewed " + counter +" times!</h1");
    }
}
