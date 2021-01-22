import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/ads")
public class ViewAdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Ads adsDao = DaoFactory.getAdsDao();
        List<Ad> listOfAds = adsDao.all();
        req.setAttribute("ads", listOfAds );
        req.getRequestDispatcher("/ads/index.jsp").forward(req, resp);
    }
}
