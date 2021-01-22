import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "pizzaServlet", urlPatterns = "/pizza")
public class pizzaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/pizza-order.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String crustType = req.getParameter("crust");
        String sauceType = req.getParameter("sauce");
        String size = req.getParameter("size");
        String[] toppings = req.getParameterValues("topping");
        String address = req.getParameter("address");

        System.out.println("Your pizza crust is " + crustType);
        System.out.println("Your pizza sauce is " + sauceType);
        System.out.println("Your pizza size  is " + size);
        System.out.println("Your toppings are:");
        for(int i =0; i < toppings.length; i++){
            System.out.println(toppings[i]);
        }
        System.out.println("Will be delivered to " +address);
    }
}
